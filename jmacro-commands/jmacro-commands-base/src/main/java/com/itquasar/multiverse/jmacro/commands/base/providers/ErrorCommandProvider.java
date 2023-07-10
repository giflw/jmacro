package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Core;
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
    public ErrorCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ErrorCommand(getName(), core, scriptEngine);
    }

    public static class ErrorCommand extends Command {

        public ErrorCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(Object arg) {
            this.getScriptLogger().error(arg);
        }

        void call(Object arg, Throwable ex) {
            this.getScriptLogger().error(arg, ex);
        }

    }
}
