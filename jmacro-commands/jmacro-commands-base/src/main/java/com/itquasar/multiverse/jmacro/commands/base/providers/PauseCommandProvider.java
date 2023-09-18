package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.util.LockUtils;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

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
    public PauseCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new PauseCommand(getName(), core, scriptEngineAware);
    }

    public static class PauseCommand extends AbstractCommand {

        private final ReentrantLock lock = new ReentrantLock();
        private final Condition pause = lock.newCondition();

        public PauseCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
            super(name, core, scriptEngineAware);
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

        void await() {
            LockUtils.runLocked(
                lock,
                () -> {
                    getScriptLogger().warn("Pause awaiting until signal");
                    pause.await();
                },
                e -> getScriptLogger().warn("Pause a interrupted")
            );
        }

        void signal() {
            getScriptLogger().warn("Pause signal to proceed");
            LockUtils.runLocked(lock, pause::signalAll);
        }

    }

}
