package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.CallableCommand;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

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

    public static class ProgressCommand extends CallableCommand<Progress> implements Constants {

        public ProgressCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        public Progress call(Runnable runnable) {
            return new Progress(runnable, getScriptLogger());
        }

        public Progress of(Runnable runnable) {
            return call(runnable);
        }

    }

    public static class Progress {

        private static final AtomicInteger COUNTER = new AtomicInteger(0);

        private static final char[] SPINNER = {'/', '-', '\\', '|'};
        private AtomicBoolean running = new AtomicBoolean(false);

        private final Runnable runnable;
        private final Logger logger;

        private final int id = COUNTER.incrementAndGet();


        public Progress(Runnable runnable, Logger logger) {
            this.runnable = runnable;
            this.logger = logger;
        }

        private void run(Runnable progress) {
            if (running.compareAndSet(false, true)) {
                try {
                    logger.info("Starting progress task...");
                    Thread thread = new Thread(() -> {
                        runnable.run();
                        running.set(false);
                        logger.info("...progress task done");
                    }, "progress#" + id);
                    thread.start();
                    progress.run();
                } catch (Exception exception) {
                    running.set(false);
                    throw exception;
                }
            }
        }

        void dots() {
            this.run(() -> {
                StringBuilder builder = new StringBuilder().append('\r');
                while (running.get()) {
                    builder.insert(0, '.');
                    System.out.print(builder);
                    sleep();
                }
            });
        }

        void spin() {
            spinner();
        }

        void spinner() {
            this.run(() -> {
                int i = 0;
                while (running.get()) {
                    i = (i + 1) % SPINNER.length;
                    System.out.print(SPINNER[i]);
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
