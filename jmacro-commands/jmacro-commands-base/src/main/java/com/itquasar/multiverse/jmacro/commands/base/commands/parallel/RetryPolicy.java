package com.itquasar.multiverse.jmacro.commands.base.commands.parallel;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class RetryPolicy implements RejectedExecutionHandler, Runnable {

    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final AtomicInteger total = new AtomicInteger(0);

    private final Thread thread;
    private ThreadPoolExecutor executor = null;

    private final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    private final List<Consumer<Integer>> queueSizeListeners = new LinkedList<>();

    private final int sleepTimeInMs;

    RetryPolicy(int sleepTimeInMs) {
        this.sleepTimeInMs = sleepTimeInMs;
        this.thread = new Thread(this, this.getClass().getSimpleName() + "#" + COUNTER.getAndIncrement());
    }

    void addQueueSizeListeners(Consumer<Integer> listener) {
        this.queueSizeListeners.add(listener);
    }

    void removeQueueSizeListeners(Consumer<Integer> listener) {
        this.queueSizeListeners.remove(listener);
    }

    /**
     * @param runnable the runnable task requested to be executed
     * @param executor the executor attempting to execute this task
     */
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
        if (!executor.isShutdown()) {
            synchronized (this) {
                if (!thread.isAlive()) {
                    this.executor = executor;
                    this.thread.start();
                } else {
                    this.notifyAll();
                }
            }
            queue.offer(runnable);
            this.notifySize();
        }
    }

    private void notifySize() {
        int size = this.queue.size();
        if(this.total.getAndSet(size) != size) {
            queueSizeListeners.forEach(it -> it.accept(size));
        }
    }

    public int getSize() {
        return this.queue.size();
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            int total = this.queue.size();
            while (total > 0) {
                this.executor.execute(this.queue.poll());
                total--;
            }
            this.notifySize();
            if (this.queue.size() == 0) {
                synchronized (this) {
                    if (!this.executor.isShutdown()) {
                        this.wait();
                    } else {
                        return;
                    }
                }
            } else {
                Thread.sleep(this.sleepTimeInMs);
            }
        }
    }
}
