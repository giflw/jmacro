package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ResultCommand;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;

import javax.script.ScriptContext;

/**
 * Exits script, not Java Virtual Machine
 */
public class ExitCommandProvider implements CommandProvider<ExitCommandProvider.ExitCommand> {

    @Override
    public Class<ExitCommand> getCommandType() {
        return ExitCommand.class;
    }

    @Override
    public ExitCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ExitCommand(core, scriptEngineAware);
    }

    public static class ExitCommand extends AbstractCommand {

        public ExitCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        void call() {
            call(0);
        }

        void apply() {
            call(0);
        }

        void invoke() {
            call(0);
        }

        void call(int code) {
            ResultCommand<?, ?> result = (ResultCommand<?, ?>) getContext().getBindings(ScriptContext.ENGINE_SCOPE).get("result");
            result.exitCode(code);
            throw new ExitException(code);
        }

        void apply(int code) {
            call(code);
        }

        void invoke(int code) {
            call(code);
        }

    }
}
