package com.itquasar.multiverse.jmacro.core.command;

import org.apache.logging.log4j.Logger;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public abstract class LoggingCommand {

    /**
     * Logger instance to use. This is got from script engine context attribute, or explicitly given.
     */
    private final Logger logger;

    /**
     * @param scriptEngine Script engine instance to get context, from which we get logger attribute.
     */
    public LoggingCommand(final ScriptEngine scriptEngine) {
        this(scriptEngine.getContext());
    }

    /**
     * @param scriptContext Script context from where to get attribute "logger".
     */
    public LoggingCommand(final ScriptContext scriptContext) {
        this((Logger) scriptContext.getAttribute("logger"));
    }

    /**
     * @param logger Logger instance to use as logger backend.
     */
    public LoggingCommand(final Logger logger) {
        this.logger = logger;
    }

    /**
     *
     * @return Logger instance.
     */
    public Logger getLogger() {
        return logger;
    }
}
