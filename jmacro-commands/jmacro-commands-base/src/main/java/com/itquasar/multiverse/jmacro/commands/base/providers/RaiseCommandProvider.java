package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandUtils;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

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
    public RaiseCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new RaiseCommand(getName(), core, scriptEngine);
    }

    public static class RaiseCommand extends AbstractCommand {

        public RaiseCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(String message) {
            CommandUtils.raise(message);
        }

    }

}
