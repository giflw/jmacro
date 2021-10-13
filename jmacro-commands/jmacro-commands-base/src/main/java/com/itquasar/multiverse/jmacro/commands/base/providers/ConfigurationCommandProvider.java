package com.itquasar.multiverse.jmacro.commands.base.providers;


import com.itquasar.multiverse.jmacro.commands.base.commands.Configuration;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptContext;

public class ConfigurationCommandProvider implements CommandProvider<Configuration> {

    @Override
    public String getName() {
        return "configuration";
    }

    @Override
    public Configuration getCommand(ScriptContext context) {
        return new Configuration();
    }
}


