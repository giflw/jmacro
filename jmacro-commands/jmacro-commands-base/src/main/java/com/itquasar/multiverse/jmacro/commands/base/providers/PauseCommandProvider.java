package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;
import lombok.SneakyThrows;

import javax.script.ScriptEngine;

public class PauseCommandProvider implements CommandProvider<PauseCommandProvider.Pause> {

    @Override
    public String getName() {
        return "pause";
    }

    @Override
    public Class<Pause> getCommandType() {
        return Pause.class;
    }

    @Override
    public Pause getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Pause(scriptEngine);
    }

    public static class Pause extends LoggingCommand {

        public Pause(ScriptEngine scriptEngine) {
            super(scriptEngine);
        }

        void call(Number seconds) {
            this.call(seconds, null);
        }

        @SneakyThrows
        void call(Number seconds, String message) {
            if (message != null) {
                this.getLogger().warn(message);
            }
            Number milis = seconds.longValue() * 1000;
            Thread.sleep(milis.longValue());
        }

    }

}
