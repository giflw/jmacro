package com.itquasar.multiverse.jmacro.core.command;

import org.apache.logging.log4j.Logger;

import javax.script.ScriptContext;

public abstract class LoggingCommand {

    private final Logger logger;

    public LoggingCommand(ScriptContext scriptContext) {
        this((Logger) scriptContext.getAttribute("logger"));
    }

    public LoggingCommand(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }
}
