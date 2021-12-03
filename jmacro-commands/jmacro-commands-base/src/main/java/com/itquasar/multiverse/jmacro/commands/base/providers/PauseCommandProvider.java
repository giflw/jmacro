package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;

import javax.script.ScriptEngine;

public class PauseCommandProvider implements CommandProvider<PauseCommandProvider.PauseCommand> {

    @Override
    public String getName() {
        return "pause";
    }

    @Override
    public Class<PauseCommand> getCommandType() {
        return PauseCommand.class;
    }

    @Override
    public PauseCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new PauseCommand(jMacroCore, scriptEngine);
    }

    public static class PauseCommand extends Command {

        public PauseCommand(JMacroCore core, ScriptEngine scriptEngine) {
            super(core, scriptEngine);
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
