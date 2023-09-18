package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

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
    public ErrorCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ErrorCommand(getName(), core, scriptEngineAware);
    }

    public static class ErrorCommand extends AbstractCommand {

        public ErrorCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
            super(name, core, scriptEngineAware);
        }

        void call(Object arg) {
            this.getScriptLogger().error(arg);
        }

        void call(Object arg, Throwable ex) {
            this.getScriptLogger().error(arg, ex);
        }

    }
}
