package com.itquasar.multiverse.jmacro.commands.base.providers;


import com.itquasar.multiverse.jmacro.commands.base.commands.Configuration;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class ConfigurationCommandProvider implements CommandProvider<Configuration> {

    @Override
    public String getName() {
        return "configuration";
    }

    @Override
    @SneakyThrows
    public Configuration getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Configuration();
    }
}


