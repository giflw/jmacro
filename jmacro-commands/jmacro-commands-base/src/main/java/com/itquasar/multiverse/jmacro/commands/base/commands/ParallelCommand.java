package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.commands.parallel.LockWaitThreadPoolExecutor;
import com.itquasar.multiverse.jmacro.commands.base.commands.parallel.ParallelThreadFactory;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import groovy.lang.Closure;
import lombok.Getter;
import lombok.SneakyThrows;

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

    @Getter
    private int minPoolSize = Constants.CPUS / 2;

    @Getter
    private int maxPoolSize = Constants.CPUS;

    @Getter
    private boolean fixed = false;

    @Getter
    private long timeout = 1000; // milliseconds

    public void setMinPoolSize(int minPoolSize) {
        this.minPoolSize = minPoolSize > 0 ? minPoolSize : 1;
        this.computeFixedFlag();
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize == 0 ? minPoolSize : maxPoolSize;
        this.computeFixedFlag();
    }

    private void computeFixedFlag() {
        this.fixed = minPoolSize == maxPoolSize;
    }

    public ParallelCommand(String name, Core core, ScriptEngine scriptEngine) {
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

    public ParallelCommand call(int minPoolSize, int maxPoolSize, double timeout) {
        return call(defaultGroup, minPoolSize, maxPoolSize, Double.valueOf(timeout * 1000).longValue());
    }

    public ParallelCommand call(int minPoolSize, int maxPoolSize, long timeout) {
        return call(defaultGroup, minPoolSize, maxPoolSize, timeout);
    }

    public ParallelCommand call(String group, int minPoolSize, int maxPoolSize, double timeout) {
        return call(group, minPoolSize, maxPoolSize, Double.valueOf(timeout * 1000).longValue());
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
            instances.put(group, initParallel(parallel, group, minPoolSize, maxPoolSize, timeout));
            return parallel;
        }
    }

    private ParallelCommand initParallel(ParallelCommand parallel, String group, int minPoolSize, int maxPoolSize, long timeout) {
        parallel.minPoolSize = minPoolSize;
        parallel.maxPoolSize = maxPoolSize;
        parallel.timeout = timeout;

        LockWaitThreadPoolExecutor executor = new LockWaitThreadPoolExecutor(
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
        if (this.executor == null) {
            this.call();
        }
        getScriptLogger().info("Executing " + callable + " on parallel group " + this.groupName);
        if (callable instanceof Closure<?> closure) {
            closure.setDelegate(this);
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
        return executor.submit((Callable<?>) callable);
    }

    public void shutdown() {
        shutdown(this.timeout);
    }

    public void shutdown(long timeout) {
        getScriptLogger().warn("Awaiting parallel " + groupName);
        try {
            this.executor.shutdown();
            while (!this.executor.awaitTermination(timeout, TimeUnit.SECONDS)) {
                getScriptLogger().warn("Parallel " + groupName + "not terminated yet!");
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
            getScriptLogger().warn("Waiting for task to finish...");
            command.close();
        });
    }
}

