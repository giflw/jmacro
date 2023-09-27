package com.itquasar.multiverse.jmacro.commands.base.providers;


import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ConfigurationCommandProvider implements CommandProvider<ConfigurationCommand> {

    @Override
    public Class<ConfigurationCommand> getCommandType() {
        return ConfigurationCommand.class;
    }

    @Override

    public ConfigurationCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ConfigurationCommand(core, scriptEngineAware);
    }
}


