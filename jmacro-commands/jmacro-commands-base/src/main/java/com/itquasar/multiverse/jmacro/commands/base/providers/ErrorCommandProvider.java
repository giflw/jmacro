package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class ErrorCommandProvider implements CommandProvider<ErrorCommandProvider.ErrorCommand> {

    @Override
    public String getName() {
        return "error";
    }

    @Override
    public Class<ErrorCommand> getCommandType() {
        return ErrorCommand.class;
    }

    @Override
    public ErrorCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ErrorCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class ErrorCommand extends Command {

        public ErrorCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(Object arg) {
            this.getLogger().error(arg);
        }

        void call(Object arg, Throwable ex) {
            this.getLogger().error(arg, ex);
        }

    }
}
