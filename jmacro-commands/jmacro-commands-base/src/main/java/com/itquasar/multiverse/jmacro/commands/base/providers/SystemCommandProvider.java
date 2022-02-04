package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.SystemCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class SystemCommandProvider implements CommandProvider<SystemCommand> {

    @Override
    public String getName() {
        return "system";
    }

    @Override
    public Class<SystemCommand> getCommandType() {
        return SystemCommand.class;
    }

    @Override
    public SystemCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new SystemCommand(getName(), jMacroCore, scriptEngine);
    }
}
