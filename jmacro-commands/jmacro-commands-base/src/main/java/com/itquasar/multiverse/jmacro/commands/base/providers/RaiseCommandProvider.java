package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
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
    public RaiseCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new RaiseCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class RaiseCommand extends Command {

        public RaiseCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(String message) {
            throw new JMacroException(message);
        }

    }

}
