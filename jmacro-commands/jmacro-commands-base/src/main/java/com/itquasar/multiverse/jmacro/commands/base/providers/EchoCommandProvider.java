package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;

public class EchoCommandProvider implements CommandProvider<EchoCommandProvider.Echo> {

    /**
     * New log level between WARN and INFO.
     */
    public static final Level ECHO = Level.forName("ECHO", 350);

    @Override
    public Class<Echo> getCommandType() {
        return Echo.class;
    }

    @Override
    public Echo getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Echo((Logger) scriptEngine.getContext().getAttribute("logger"));
    }

    public static class Echo {

        private final Logger logger;

        public Echo(Logger logger) {
            this.logger = logger;
        }

        void call(Object arg) {
            logger.log(ECHO, arg);
        }

    }
}
