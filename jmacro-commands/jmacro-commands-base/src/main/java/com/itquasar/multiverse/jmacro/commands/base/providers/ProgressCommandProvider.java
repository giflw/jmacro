package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
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
                    logger.debug("Starting progress task...");
                    // FIXME use virtual threads
                    new Thread(progress, "progress#" + id).start();
                    result = supplier.get();
                    running.set(false);
                    logger.debug("...progress task done");
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
                StringBuilder builder = new StringBuilder();
                while (running.get()) {
                    if (maxDots > 0 && builder.length() >= maxDots) {
                         builder = new StringBuilder();
                    }
                    builder.append('.');
                    System.out.print(builder + " ".repeat(maxDots - builder.length()) + "\r");
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

/*

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

class Scratch {


    public static void main(String[] args) throws InterruptedException {
        var bar = new Bar();

    }

    abstract class Progress<T> implements Runnable {

    }

    static class Bar implements Runnable {

        private final AtomicBoolean running;
        private final Supplier<String> labelSupplier;

        private final Supplier<Long> totalSupplier;
        private final Supplier<Long> actualSupplier;

        private final Supplier<Boolean> indeterminateSupplier;
        private final String prefix = "[";
        private final String suffix = "]";
        private final String cursor = "<===>";
        private final String separator = ": ";
        private final int labelSize = 18;
        private final int barSize = 80 - labelSize - separator.length();

        public Bar(AtomicBoolean running, String label) {
            this.running = running;
            this.label = label;
        }

        public void run() {
            int position = 0;
            int step = 1;
            int spaceLength = barSize - prefix.length() - suffix.length() - cursor.length();
            String labelPadded = label.length() > labelSize? label.substring(0, labelSize) : label + " ".repeat(labelSize - label.length());
            while(true) {
                System.out.print(labelPadded + separator + prefix + innerBar(cursor, position, spaceLength) + suffix + '\r');
                position += step;
                if (position >= (spaceLength)) {
                    step = -1;
                } if (position == 0) {
                    step = 1;
                }
                // FIXME
                try {
                    Thread.sleep(250);
                } catch (Exception ex) {
                    // no op
                }
            }
        }

        private String innerBar(String cursor, int position, int availableSize) {
            return " ".repeat(position) + cursor + " ".repeat(availableSize - position);
        }
    }
}

 */
