package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
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
    public PauseCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new PauseCommand(getName(), core, scriptEngine);
    }

    public static class PauseCommand extends AbstractCommand {

        public PauseCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call(Number seconds) {
            this.call(seconds, null);
        }


        void call(Number seconds, String message) {
            if (message != null) {
                this.getScriptLogger().warn(message);
            }
            Number milis = seconds.longValue() * 1000;
            try {
                Thread.sleep(milis.longValue());
            } catch (InterruptedException e) {
                throw new JMacroException("Error sleeping", e);
            }
        }

        Thread thread() {
            return Thread.currentThread();
        }

        void forever() {
            Thread thread = thread();
            try {
                thread.join();
            } catch (InterruptedException e) {
                getScriptLogger().warn("Thread " + thread.getThreadGroup().getName() + ":" + thread.getName() + " interrupted");
            }
        }

        void interrupt() {
            Thread.currentThread().interrupt();
        }

    }

}
