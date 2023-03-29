package com.itquasar.multiverse.jmacro.commands.base.commands.parallel;

import com.itquasar.multiverse.jmacro.commands.base.providers.ParallelCommandProvider;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import groovy.lang.Closure;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelCommand extends Command implements AutoCloseable {

    private static int DEFAULT_RETRY_INTERVALIN_MS = 100;

    public ParallelCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    private AtomicInteger counter = new AtomicInteger(0);

    private final String defaultGroup = "parallel";

    private String group;

    private RetryPolicy retryPolicy;

    private ExecutorService executor;

    private final ConcurrentMap<String, ParallelCommand> instances = new ConcurrentHashMap<>();

    ParallelCommand call() {
        return this.call(0);
    }

    ParallelCommand call(int poolSize) {
        return this.call(defaultGroup, poolSize);
    }

    ParallelCommand call(String group) {
        return this.call(group, 0);

    }

    ParallelCommand call(String group, int poolSize) {
        return call(group, poolSize, poolSize);
    }

    ParallelCommand call(String group, int minPoolSize, int maxPoolSize) {
        return call(group, minPoolSize, maxPoolSize, 0);
    }

    ParallelCommand call(String group, int minPoolSize, int maxPoolSize, int retryInterval) {
        if (this.instances.containsKey(group)) {
            return this.instances.get(group);
        } else {
            ParallelCommand parallel = this.group == null && defaultGroup.equals(group)
                ? this
                : new ParallelCommand(this.getName(), this.getCore(), this.getScriptEngine());

            this.instances.put(group, initParallel(getLogger(), parallel, group, minPoolSize, maxPoolSize, retryInterval));
            return parallel;
        }
    }

    private static ParallelCommand initParallel(Logger logger, ParallelCommand parallel, String group, int minPoolSize, int maxPoolSize, int retryInterval) {
        boolean fixed = minPoolSize == maxPoolSize;
        minPoolSize = minPoolSize > 0 ? minPoolSize : (Runtime.getRuntime().availableProcessors() / 2);

        parallel.retryPolicy = new RetryPolicy(retryInterval > 0 ? retryInterval : DEFAULT_RETRY_INTERVALIN_MS);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            minPoolSize,
            fixed ? minPoolSize : maxPoolSize,
            fixed ? 0L : 60L,
            TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new ParallelThreadFactory(group),
            parallel.retryPolicy
        );
        parallel.retryPolicy.addQueueSizeListeners((Integer size) -> {
            logger.warn("Parallel group [" + parallel.group + "] saturation: " + size);
        });
        if (!fixed) {
            executor.allowCoreThreadTimeOut(true);
        }
        parallel.executor = executor;
        parallel.group = group;
        return parallel;
    }

    Future<?> submit(Closure closure) {
        if (this.executor == null) {
            this.call();
        }
        getLogger().info("Executing " + closure + " on parallel group " + this.group);
        closure.setDelegate(this);
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        return executor.submit(() -> {
            this.counter.incrementAndGet();
            try {
                closure.call();
            } finally {
                this.counter.decrementAndGet();
            }
        });
    }

    @SneakyThrows
    void waitAll(int timeout) {
        getLogger().warn("Awaiting " + group);
        while (this.counter.get() > 0) {
            Thread.sleep(50);
        }
        try {
            this.executor.awaitTermination(timeout, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new JMacroException("Could not await executor " + group + " termination", e);
        }
    }

    public Integer getSaturation() {
        return this.retryPolicy.getSize();
    }

    void awaitSaturation(int checkIntervalInMs) {
        this.awaitSaturation(0, checkIntervalInMs);
    }

    @SneakyThrows
    void awaitSaturation(int expectedValue, int checkIntervalInMs) {
        while (this.getSaturation() > expectedValue) {
            Thread.sleep(checkIntervalInMs);
        }
    }

    void waitAll() {
        waitAll(10);
    }

    @Override
    public void close() {
        this.instances.values().forEach((ParallelCommand command) -> {
            getLogger().warn("Shutting dow executor....");
            command.executor.shutdown();
            getLogger().warn("Waiting for task to finish...");
            command.waitAll(60);
        });
    }
}
