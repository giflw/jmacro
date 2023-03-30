package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.commands.parallel.ParallelThreadFactory;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import groovy.lang.Closure;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import java.util.Queue;
import java.util.concurrent.*;

public class ParallelCommand extends Command implements AutoCloseable {


    public static final TimeUnit MILLISECONDS = TimeUnit.MILLISECONDS;
    public static final TimeUnit SECONDS = TimeUnit.SECONDS;
    public static final TimeUnit MINUTES = TimeUnit.MINUTES;
    public static final TimeUnit HOURS = TimeUnit.HOURS;

    public ParallelCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    private final String defaultGroup = "parallel";

    private String groupName;

    private ExecutorService executor;

    private static final ConcurrentMap<String, ParallelCommand> instances = new ConcurrentHashMap<>();

    public ParallelCommand call() {
        return this.call(0);
    }

    public ParallelCommand call(int poolSize) {
        return this.call(defaultGroup, poolSize);
    }

    public ParallelCommand call(String group) {
        return this.call(group, 0);

    }

    public ParallelCommand call(String group, int poolSize) {
        return call(group, poolSize, poolSize);
    }

    public ParallelCommand call(int minPoolSize, int maxPoolSize) {
        return call(defaultGroup, minPoolSize, maxPoolSize);
    }

    public ParallelCommand call(String group, int minPoolSize, int maxPoolSize) {
        if (instances.containsKey(group)) {
            return instances.get(group);
        } else {
            ParallelCommand parallel = new ParallelCommand(this.getName(), this.getCore(), this.getScriptEngine());
            instances.put(group, initParallel(getLogger(), parallel, group, minPoolSize, maxPoolSize));
            return parallel;
        }
    }

    private static ParallelCommand initParallel(Logger logger, ParallelCommand parallel, String group, int minPoolSize, int maxPoolSize) {
        boolean fixed = minPoolSize == maxPoolSize;
        minPoolSize = minPoolSize > 0 ? minPoolSize : (Runtime.getRuntime().availableProcessors() / 2);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            minPoolSize,
            fixed ? minPoolSize : maxPoolSize,
            fixed ? 0L : 60L,
            TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new ParallelThreadFactory(group),
            new ThreadPoolExecutor.AbortPolicy()
        );
        if (!fixed) {
            executor.allowCoreThreadTimeOut(true);
        }
        parallel.executor = executor;
        parallel.groupName = group;
        return parallel;
    }

    @SneakyThrows
    public Future<?> submit(Closure closure) {
        return submit(100, closure);
    }

    public Future<?> submit(float retryInterval, Closure closure) throws Exception {
        return submit((int) (retryInterval * 1000), TimeUnit.MILLISECONDS, closure);
    }

    public Future<?> submit(int retryInterval, Closure closure) throws Exception {
        return this.submit(retryInterval, TimeUnit.SECONDS, closure);
    }

    public Future<?> submit(int retryInterval, TimeUnit timeUnit, Closure closure) throws Exception {
        if (this.executor == null) {
            this.call();
        }
        getLogger().info("Executing " + closure + " on parallel group " + this.groupName);
        closure.setDelegate(this);
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        Future<?> future = null;
        do {
            try {
                future = executor.submit((Callable<? extends Object>) closure);
            } catch (RejectedExecutionException ex) {
                getLogger().debug("Task execution rejected. Waitinng " + retryInterval + " " + timeUnit.name());
                Thread.sleep(timeUnit.toMillis(retryInterval));
            }
        } while (future == null && !executor.isShutdown());
        return future;
    }

    public void waitAll(int timeout) {
        getLogger().warn("Awaiting " + groupName);
        try {
            this.executor.shutdown();
            this.executor.awaitTermination(timeout, TimeUnit.SECONDS);
            this.instances.remove(this.groupName);
            this.groupName = null;
        } catch (InterruptedException e) {
            throw new JMacroException("Could not await executor " + groupName + " termination", e);
        }
    }

    public void waitAll() {
        waitAll(10);
    }

    @Override
    public void close() {
        if (this.groupName != null) {
            this.waitAll();
            synchronized (instances) {
                instances.remove(this.groupName);
            }
        }
    }

    public void closeAll() {
        this.instances.values().forEach((ParallelCommand command) -> {
            getLogger().warn("Waiting for task to finish...");
            command.close();
        });
    }
}
