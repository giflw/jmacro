package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.CommandUtils;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class RaiseCommandProvider implements CommandProvider<RaiseCommandProvider.RaiseCommand> {

    @Override
    public String getName() {
        return "raise";
    }

    @Override
    public Class<RaiseCommand> getCommandType() {
        return RaiseCommand.class;
    }

    @Override
    public RaiseCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new RaiseCommand(getName(), core, scriptEngineAware);
    }

    public static class RaiseCommand extends AbstractCommand {

        public RaiseCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
            super(name, core, scriptEngineAware);
        }

        void call(String message) {
            CommandUtils.raise(message);
        }

    }

}
