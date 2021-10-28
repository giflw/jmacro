package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;

public class LoggerCommandProvider implements CommandProvider<Logger> {

    @Override
    public String getName() {
        return "logger";
    }

    @Override
    public Class<Logger> getCommandType() {
        return Logger.class;
    }

    @Override
    public Logger getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return (Logger) scriptEngine.getContext().getAttribute("logger");
    }
}
