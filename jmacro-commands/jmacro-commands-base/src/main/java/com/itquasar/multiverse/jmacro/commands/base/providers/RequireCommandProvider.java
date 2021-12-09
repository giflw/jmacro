package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class RequireCommandProvider implements CommandProvider<RequireCommandProvider.RequireCommand> {

    @Override
    public String getName() {
        return "require";
    }

    @Override
    public Class<RequireCommand> getCommandType() {
        return RequireCommand.class;
    }

    @Override
    public RequireCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new RequireCommand(jMacroCore, scriptEngine);
    }

    public static class RequireCommand extends Command implements Constants {

        public RequireCommand(JMacroCore core, ScriptEngine scriptEngine) {
            super(core, scriptEngine);
        }

        void call(int version) {
            if (version != API_VERSION) {
                throw new JMacroException("Required API version " + version + " not supported. Actual version is " + API_VERSION + ".");
            }
            getLogger().warn("Required API version matched: " + API_VERSION + " === " + version);
        }

        void call(String commandName) {
            var command = getBindings().get(commandName);
            if (command == null) {
                throw new JMacroException("Required command " + commandName + " not available.");
            }
            getLogger().warn("Required command found: " + commandName + " = " + command);
        }
    }

}
