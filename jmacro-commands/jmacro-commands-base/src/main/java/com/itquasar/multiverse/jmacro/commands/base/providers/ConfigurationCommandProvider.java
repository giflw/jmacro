package com.itquasar.multiverse.jmacro.commands.base.providers;


import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class ConfigurationCommandProvider implements CommandProvider<ConfigurationCommand> {

    @Override
    public String getName() {
        return "configuration";
    }

    @Override
    public Class<ConfigurationCommand> getCommandType() {
        return ConfigurationCommand.class;
    }

    @Override

    public ConfigurationCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ConfigurationCommand(getName(), jMacroCore, scriptEngine);
    }
}


