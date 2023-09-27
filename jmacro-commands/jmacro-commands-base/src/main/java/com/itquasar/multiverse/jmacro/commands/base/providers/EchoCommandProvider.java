package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.util.IOUtils;
import lombok.SneakyThrows;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class EchoCommandProvider implements CommandProvider<EchoCommandProvider.EchoCommand> {

    /**
     * New log level between WARN and INFO.
     */
    public static final Level ECHO = Level.forName("ECHO", 350);
    public static final Level PRINT = Level.forName("PRINT", 349);

    @Override
    public Class<EchoCommand> getCommandType() {
        return EchoCommand.class;
    }

    @Override
    public EchoCommand getCommand(final Core core, final ScriptEngineAware scriptEngineAware) {
        return new EchoCommand(core, scriptEngineAware);
    }


    // TODO add option to skip new line
    public static class EchoCommand extends AbstractCommand {

        private final Separator separator = new Separator(this);

        public EchoCommand(final Core core, final ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        void call(final Object arg) {
            this.getScriptLogger().log(ECHO, arg);
        }

        void call(String s, int size) {
            separator.of(s, size);
        }

        void call(char c, int size) {
            separator.of(c, size);
        }

        PrintStream out() {
            return EchoPrintWriter.of(getScriptLogger());
        }

        PrintStream getOut() {
            return out();
        }

        public Separator getSeparator() {
            return separator;
        }

        public Separator getSep() {
            return separator;
        }
    }

    public static class Separator {

        private final EchoCommand echoCommand;

        public Separator(EchoCommand echoCommand) {
            this.echoCommand = echoCommand;
        }

        void of(String s, int size) {
            echoCommand.call(s.repeat(size));
        }

        void of(String s) {
            of(s, 80);
        }

        void of(char c, int size) {
            of(String.valueOf(c), size);
        }

        void of(char c) {
            of(String.valueOf(c));
        }

        void stars() {
            of('*');
        }

        void dots() {
            of('.');
        }

        void dashes() {
            of('—');
        }

        void underscores() {
            of('_');
        }

        void backslashes() {
            of('\\');
        }

        void minuses() {
            of('-');
        }

        void pluses() {
            of('+');
        }

        void slashes() {
            of('/');
        }

        void equals() {
            of('=');
        }
    }

    public static class EchoPrintWriter extends PrintStream {

        private final BufferedReader reader;

        private EchoPrintWriter(OutputStream out, InputStream in, Logger scriptLogger) {
            super(out);
            this.reader = new BufferedReader(new InputStreamReader(in));
            Thread.startVirtualThread(() -> {
                try (this.reader) {
                    String line;
                    while ((line = this.reader.readLine()) != null) {
                        scriptLogger.log(PRINT, line);
                    }
                } catch (IOException e) {
                    if (!e.getMessage().equals("Write end dead")) {
                        scriptLogger.error("Error in echo print stream");
                    }
                }
            });
        }

        public static EchoPrintWriter of(Logger scriptLogger) {
            IOUtils.Pipe pipe = IOUtils.pipe();
            return new EchoPrintWriter(pipe.out(), pipe.in(), scriptLogger);
        }

        @SneakyThrows
        public void write(int b) {
            this.out.write(b);
        }

        public BufferedReader reader() {
            return reader;
        }

        @SneakyThrows
        @Override
        public void close() {
            super.close();
            this.reader.close();
        }
    }
}
