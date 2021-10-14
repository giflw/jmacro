package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

// FIXME unify command loggers
@Log4j2
public class PauseCommandProvider implements CommandProvider<PauseCommandProvider.Pause> {

    @Override
    public String getName() {
        return "pause";
    }

    @Override
    public Pause getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Pause();
    }

    public static class Pause {

        void call(Number seconds) {
            this.call(seconds, null);
        }

        @SneakyThrows
        void call(Number seconds, String message) {
            if (message != null) {
                LOGGER.warn(message);
            }
            Number milis = seconds.longValue() * 1000;
            Thread.sleep(milis.longValue());
        }

    }

}
