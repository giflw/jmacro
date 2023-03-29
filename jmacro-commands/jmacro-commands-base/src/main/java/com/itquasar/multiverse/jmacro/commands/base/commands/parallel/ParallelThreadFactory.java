package com.itquasar.multiverse.jmacro.commands.base.commands.parallel;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;

    ParallelThreadFactory(String namePrefix) {
        this.group = new ThreadGroup("parallel-" + poolNumber.getAndIncrement() + "-pool");
        this.namePrefix = namePrefix + "#";
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(group, runnable, namePrefix + threadNumber.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != Thread.NORM_PRIORITY) {
            thread.setPriority(Thread.NORM_PRIORITY);
        }
        return thread;
    }
}
