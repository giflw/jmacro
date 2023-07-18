package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CallableCommand;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class ProgressCommandProvider implements CommandProvider<ProgressCommandProvider.ProgressCommand> {

    @Override
    public String getName() {
        return "progress";
    }

    @Override
    public Class<ProgressCommand> getCommandType() {
        return ProgressCommand.class;
    }

    @Override
    public ProgressCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ProgressCommand(getName(), core, scriptEngine);
    }

    public static class ProgressCommand extends AbstractCommand implements Constants {

        public ProgressCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        public <T> Progress<T> call(Supplier<T> supplier) {
            return new Progress<T>(supplier, getScriptLogger());
        }

        public <T> Progress<T> of(Supplier<T> supplier) {
            return call(supplier);
        }

    }

    // FIXME add name/prefix/label to progress
    public static class Progress<T> {

        private static final AtomicInteger COUNTER = new AtomicInteger(0);

        private static final char[] SPINNER = {'/', '-', '\\', '|'};
        private final AtomicBoolean running = new AtomicBoolean(false);

        private final Supplier<T> supplier;
        private final Logger logger;

        private static final int DEFAULT_MAX_SIZE = 80;

        private final int id = COUNTER.incrementAndGet();


        public Progress(Supplier<T> supplier, Logger logger) {
            this.supplier = supplier;
            this.logger = logger;
        }

        private T run(Runnable progress) {
            if (running.compareAndSet(false, true)) {
                try {
                    T result = null;
                    logger.info("Starting progress task...");
                    // FIXME use virtual threads
                    new Thread(progress, "progress#" + id).start();
                    result = supplier.get();
                    running.set(false);
                    logger.info("...progress task done");
                    return result;
                } catch (Exception exception) {
                    running.set(false);
                    throw exception;
                }
            }
            throw new JMacroException("Progress task is already running");
        }

        T dots() {
            return dots(DEFAULT_MAX_SIZE);
        }

        T dots(int maxDots) {
            return this.run(() -> {
                StringBuilder builder = new StringBuilder().append('\r');
                while (running.get()) {
                    if (maxDots > 0 && builder.length() > maxDots) {
                        builder.delete(0, builder.length() - 1);
                    }
                    builder.insert(0, '.');
                    System.out.print(builder);
                    sleep();
                }
            });
        }

        T spin() {
            return spinner();
        }

        T spinner() {
            return this.run(() -> {
                int i = 0;
                while (running.get()) {
                    i = (i + 1) % SPINNER.length;
                    System.out.print("[" + SPINNER[i] + ']');
                    System.out.print('\r');
                    sleepQuarter();
                }
                System.out.print('\b');
            });
        }

        @SneakyThrows
        private void sleep() {
            Thread.sleep(1000);
        }

        @SneakyThrows
        private void sleepQuarter() {
            Thread.sleep(250);
        }
    }

}
