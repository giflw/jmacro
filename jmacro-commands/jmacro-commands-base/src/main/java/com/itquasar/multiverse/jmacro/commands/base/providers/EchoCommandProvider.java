package com.itquasar.multiverse.jmacro.commands.base.providers;

import javax.script.ScriptEngine;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import org.apache.logging.log4j.Level;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

public class EchoCommandProvider implements CommandProvider<EchoCommandProvider.EchoCommand> {

    /**
     * New log level between WARN and INFO.
     */
    public static final Level ECHO = Level.forName("ECHO", 350);

    @Override
    public String getName() {
        return "echo";
    }

    @Override
    public Class<EchoCommand> getCommandType() {
        return EchoCommand.class;
    }

    @Override
    public EchoCommand getCommand(final Core core, final ScriptEngine scriptEngine) {
        return new EchoCommand(this.getName(), core, scriptEngine);
    }


    // TODO add option to skip new line
    public static class EchoCommand extends AbstractCommand {

        private final Separator separator = new Separator(this);

        public EchoCommand(final String name, final Core core, final ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
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
}
