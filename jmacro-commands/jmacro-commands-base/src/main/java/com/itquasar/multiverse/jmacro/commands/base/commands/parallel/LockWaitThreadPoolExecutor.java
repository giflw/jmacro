package com.itquasar.multiverse.jmacro.commands.base.commands.parallel;

import io.vavr.control.Try;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockWaitThreadPoolExecutor extends ThreadPoolExecutor {

    private final ReentrantLock executionLock = new ReentrantLock();
    private final Condition poolHasEmptyThread = executionLock.newCondition();

    private final long awaitNanos;

    public LockWaitThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors.defaultThreadFactory(), new AbortPolicy());
    }

    public LockWaitThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, new AbortPolicy());
    }

    public LockWaitThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, Executors.defaultThreadFactory(), handler);
    }

    public LockWaitThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
        this.awaitNanos = keepAliveTime == 0 ? TimeUnit.SECONDS.toNanos(1) : unit.toNanos(keepAliveTime / 10);
    }

    @Override
    public void execute(Runnable command) {
        Try.run(() -> {
                this.executionLock.lock();
                while (this.getActiveCount() >= this.getMaximumPoolSize()) {
                    this.poolHasEmptyThread.awaitNanos(this.awaitNanos);
                }
            })
            .andFinallyTry(() -> super.execute(command))
            .andFinallyTry(() -> {
                this.executionLock.unlock();
                this.poolHasEmptyThread.signalAll();
            });
    }

    @Override
    public void shutdown() {
        Try.run(() -> {
            while (this.executionLock.isLocked()) {
                this.poolHasEmptyThread.awaitNanos(this.getActiveCount() * this.awaitNanos);
            }
        }).andFinally(super::shutdown);
    }
}
