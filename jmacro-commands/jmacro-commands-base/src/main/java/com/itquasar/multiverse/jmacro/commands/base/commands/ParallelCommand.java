package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.commands.parallel.ParallelThreadFactory;
import com.itquasar.multiverse.jmacro.commands.base.commands.parallel.TasksMonitor;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import groovy.lang.Closure;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import java.util.concurrent.*;

public class ParallelCommand extends Command implements AutoCloseable {

    public static final TimeUnit MILLISECONDS = TimeUnit.MILLISECONDS;
    public static final TimeUnit SECONDS = TimeUnit.SECONDS;
    public static final TimeUnit MINUTES = TimeUnit.MINUTES;
    public static final TimeUnit HOURS = TimeUnit.HOURS;

    private static final ConcurrentMap<String, ParallelCommand> instances = new ConcurrentHashMap<>();


    private final String defaultGroup = "parallel";

    private String groupName;

    private ExecutorService executor;
    private final TasksMonitor tasksMonitor = new TasksMonitor(this);

    private int minPoolSize = Constants.CPUS / 2;

    private int maxPoolSize = Constants.CPUS;

    private boolean fixed = false;
    private long timeout = 1000; // milliseconds

    public int getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(int minPoolSize) {
        this.minPoolSize = minPoolSize > 0 ? minPoolSize : 1;
        this.setFixed();
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize == 0 ? minPoolSize : maxPoolSize;
        this.setFixed();
    }

    public boolean isFixed() {
        return this.minPoolSize == this.maxPoolSize;
    }

    private void setFixed() {
        this.fixed = minPoolSize == maxPoolSize;
    }

    public long getTimeout() {
        return timeout;
    }

    public TasksMonitor getTasksMonitor() {
        return tasksMonitor;
    }

    public ParallelCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    public ParallelCommand call() {
        return this.call(this.minPoolSize);
    }

    public ParallelCommand call(int poolSize) {
        return this.call(defaultGroup, poolSize);
    }

    public ParallelCommand call(String group) {
        return this.call(group, this.minPoolSize);

    }

    public ParallelCommand call(String group, int poolSize) {
        return call(group, poolSize, poolSize, this.timeout);
    }

    public ParallelCommand call(int minPoolSize, int maxPoolSize) {
        return call(defaultGroup, minPoolSize, maxPoolSize, this.timeout);
    }

    public ParallelCommand call(String group, int minPoolSize, int maxPoolSize) {
        return this.call(group, minPoolSize, maxPoolSize, this.timeout);
    }

    public ParallelCommand call(int minPoolSize, int maxPoolSize, int timeout) {
        return call(defaultGroup, minPoolSize, maxPoolSize, timeout);
    }

    /**
     * @param group       Group name
     * @param minPoolSize Minimun pool size
     * @param maxPoolSize Maximum pool size
     * @param timeout     Timeout for retry and get in milliseconds
     * @return a parallel command instance
     */
    public ParallelCommand call(String group, int minPoolSize, int maxPoolSize, long timeout) {
        if (instances.containsKey(group)) {
            return instances.get(group);
        } else {
            ParallelCommand parallel = new ParallelCommand(this.getName(), this.getCore(), this.getScriptEngine());
            instances.put(group, initParallel(getLogger(), parallel, group, minPoolSize, maxPoolSize, timeout));
            return parallel;
        }
    }

    private ParallelCommand initParallel(Logger logger, ParallelCommand parallel, String group, int minPoolSize, int maxPoolSize, long timeout) {
        parallel.minPoolSize = minPoolSize;
        parallel.maxPoolSize = maxPoolSize;
        parallel.timeout = timeout;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            minPoolSize,
            parallel.fixed ? minPoolSize : maxPoolSize,
            parallel.fixed ? 0L : 60L,
            TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new ParallelThreadFactory(group),
            new ThreadPoolExecutor.AbortPolicy()
        );
        if (!parallel.fixed) {
            executor.allowCoreThreadTimeOut(true);
        }
        parallel.executor = executor;

        parallel.groupName = group;
        return parallel;
    }

    @SneakyThrows
    public Future<?> submit(Callable<?> callable) {
        return submit(this.timeout / 1000.0, callable);
    }

    public Future<?> submit(double retryWait, Callable<?> callable) throws Exception {
        return submit((int) (retryWait * 1000), TimeUnit.MILLISECONDS, callable);
    }

    public Future<?> submit(long retryWait, Callable<?> callable) throws Exception {
        return this.submit(retryWait, TimeUnit.SECONDS, callable);
    }

    public Future<?> submit(long retryWait, TimeUnit timeUnit, Callable<?> callable) throws Exception {
        if (this.executor == null) {
            this.call();
        }
        getLogger().info("Executing " + callable + " on parallel group " + this.groupName);
        if (callable instanceof Closure<?> closure) {
            closure.setDelegate(this);
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
        Future<?> future = null;
        do {
            try {
                future = executor.submit((Callable<?>) callable);
                tasksMonitor.add(future);
            } catch (RejectedExecutionException ex) {
                getLogger().debug("Task execution rejected. Waitinng " + retryWait + " " + timeUnit.name());
                Thread.sleep(timeUnit.toMillis(retryWait));
            }
        } while (future == null && !executor.isShutdown());
        return future;
    }

    public ParallelCommand waitTasks() {
        this.tasksMonitor.waitAll();
        return this;
    }

    public void shutdown() {
        shutdown(this.timeout);
    }

    public void shutdown(long timeout) {
        getLogger().warn("Awaiting parallel " + groupName);
        try {
            this.tasksMonitor.shutdown();
            this.executor.shutdown();
            while (!this.executor.awaitTermination(timeout, TimeUnit.SECONDS)) {
                getLogger().warn("Parallel " + groupName + "not terminated yet!");
            }
            instances.remove(this.groupName);
            this.groupName = null;
        } catch (InterruptedException e) {
            throw new JMacroException("Could not await executor " + groupName + " termination", e);
        }
    }

    @Override
    public void close() {
        if (this.groupName != null) {
            this.shutdown();
            synchronized (instances) {
                instances.remove(this.groupName);
            }
        }
    }

    public void closeAll() {
        instances.values().forEach((ParallelCommand command) -> {
            getLogger().warn("Waiting for task to finish...");
            command.close();
        });
    }
}
