package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;

public class ErrorCommandProvider implements CommandProvider<ErrorCommandProvider.Error> {

    @Override
    public Class<Error> getCommandType() {
        return Error.class;
    }

    @Override
    public Error getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Error((Logger) scriptEngine.getContext().getAttribute("logger"));
    }

    public static class Error {

        private final Logger logger;

        public Error(Logger logger) {
            this.logger = logger;
        }

        void call(Object arg) {
            logger.error(arg);
        }

        void call(Object arg, Throwable ex) {
            logger.error(arg, ex);
        }

    }
}
