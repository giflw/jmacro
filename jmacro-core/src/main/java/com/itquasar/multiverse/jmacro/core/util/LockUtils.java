package com.itquasar.multiverse.jmacro.core.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

@UtilityClass
@Log4j2
public class LockUtils {

    public void runLocked(ReentrantLock lock, CheckedRunnable checkedRunnable) {
        runLocked(lock, checkedRunnable, throwable -> LOGGER.error("Error handling locks", throwable));
    }

    public void runLocked(ReentrantLock lock, CheckedRunnable checkedRunnable, Consumer<Throwable> exceptionHandler) {
        if (!lock.isLocked()) {
            lock.lock();
        }
        try {
            checkedRunnable.run();
        } catch (Throwable throwable) {
            exceptionHandler.accept(throwable);
        } finally {
            if (lock.isLocked()) {
                lock.unlock();
            }
        }
    }

    @FunctionalInterface
    public interface CheckedRunnable {
        void run() throws Throwable;
    }
}
