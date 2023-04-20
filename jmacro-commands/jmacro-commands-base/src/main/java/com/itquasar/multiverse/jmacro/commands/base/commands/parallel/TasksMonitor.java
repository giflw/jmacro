package com.itquasar.multiverse.jmacro.commands.base.commands.parallel;

import com.itquasar.multiverse.jmacro.commands.base.commands.ParallelCommand;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class TasksMonitor {

    public static final int STOPPED = 0;
    public static final int RUNNING = 1;
    public static final int SHUTTLED_DOWN = 2;
    private final ParallelCommand command;
    private final AtomicInteger status = new AtomicInteger(STOPPED);
    private final Queue<Future<?>> futures = new ConcurrentLinkedQueue<>();
    private Thread thread = null;

    public TasksMonitor(ParallelCommand command) {
        this.command = command;
    }

    @SneakyThrows
    private static void sleep(long timeout) {
        Thread.sleep(timeout);
    }

    private static void cancelAll(Logger logger, List<Future<?>> cancels) {
        logger.info("Canceling futures executions");
        for (var cancel : cancels) {
            try {
                logger.info("Future ${future.hashCode()} -> trying to cancel even if running");
                cancel.cancel(true);
            } catch (Exception exCancel) {
                logger.error("Error canceling future execution " + exCancel);
                logger.debug("Error canceling future execution " + exCancel, exCancel);
            }
        }
    }

    public void add(Future<?> future) {
        this.futures.add(future);
        if (this.status.get() == STOPPED) {
            this.start();
        }
    }

    private void start() {
        if (this.status.compareAndSet(STOPPED, RUNNING)) {
            this.thread = new Thread(() -> {
                Logger logger = this.command.getLogger();
                logger.info("Starting tasks monitor thread");
                long timeout = command.getTimeout();
                logger.info("Waiting " + timeout + "s to first run");
                sleep(timeout);

                while (status.get() == RUNNING && !futures.isEmpty()) {
                    run(logger);
                }

                logger.info("Exiting tasks monitor thread");
                this.status.set(STOPPED);
            });
            this.thread.start();
        }
    }

    public List<Future<?>> getDone() {
        var done = futures.stream().filter(future -> future == null || future.isDone()).toList();
        futures.removeAll(done);
        return done;
    }

    private void run(Logger logger) {
        var cancels = getAllAndReturnCancels(logger);

        if (cancels.size() > 0) {
            cancelAll(logger, cancels);
        }

        logger.info("Actual tasks count: " + futures.size());
    }

    private List<Future<?>> getAllAndReturnCancels(Logger logger) {
        var cancels = new ArrayList<Future<?>>();
        logger.info("Getting futures values");
        for (Future<?> future : futures) {
            try {
                logger.info("Future " + future.hashCode() + " -> done : " + future.isDone() + " (get with wait time of " + command.getTimeout() + ")");
                var value = future.get(command.getTimeout(), ParallelCommand.MILLISECONDS);
                logger.info("Future " + future.hashCode() + " -> value: " + value);
            } catch (Exception exGet) {
                logger.error("Future get error: " + exGet + " (will be cancelled).");
                logger.debug("Future get error: " + exGet, exGet);
                cancels.add(future);
            }
        }
        return cancels;
    }

    public void shutdown() {
        this.status.set(SHUTTLED_DOWN);
        this.thread.interrupt();
    }

    public void clear() {
        this.futures.removeIf(Future::isDone);
    }

    @SneakyThrows
    public void waitAll() {
        while(true) {
            if (this.futures.isEmpty()) {
                return;
            }
            if (this.futures.stream().allMatch(Future::isDone)) {
                return;
            }
            Thread.sleep(command.getTimeout());
        }
    }
}
