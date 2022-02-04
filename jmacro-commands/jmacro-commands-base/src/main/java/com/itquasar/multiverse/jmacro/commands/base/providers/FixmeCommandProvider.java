package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class FixmeCommandProvider implements CommandProvider<FixmeCommandProvider.FixmeCommand> {

    @Override
    public String getName() {
        return "fixme";
    }

    @Override
    public Class<FixmeCommand> getCommandType() {
        return FixmeCommand.class;
    }

    @Override
    public FixmeCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new FixmeCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class FixmeCommand extends Command {

        public FixmeCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(String message) {
            throw new JMacroException("FIXME: " + message);
        }

    }

}
