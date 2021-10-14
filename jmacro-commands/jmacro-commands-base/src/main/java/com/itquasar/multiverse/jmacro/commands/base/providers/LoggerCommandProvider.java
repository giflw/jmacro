package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.LogManager;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class LoggerCommandProvider implements CommandProvider {

    @Override
    public String getName() {
        return "logger";
    }

    @Override
    public Object getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return LogManager.getLogger("ScriptEngine#" + context.getAttribute("id"));
    }
}
