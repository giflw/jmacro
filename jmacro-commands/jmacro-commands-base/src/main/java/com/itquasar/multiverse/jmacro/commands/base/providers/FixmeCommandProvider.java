package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
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
    public FixmeCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new FixmeCommand(getName(), core, scriptEngine);
    }

    public static class FixmeCommand extends AbstractCommand {

        public FixmeCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(String message) {
            throw new JMacroException("FIXME: " + message);
        }

    }

}
