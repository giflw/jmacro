package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.Result;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;

import javax.script.ScriptEngine;
import java.util.List;
import java.util.concurrent.Callable;

// FIXME shouldnt have a "catch" block ???
public class AttemptCommandProvider implements CommandProvider<AttemptCommandProvider.AttemptCommand> {

    @Override
    public String getName() {
        return "attempt";
    }

    @Override
    public Class<AttemptCommand> getCommandType() {
        return AttemptCommand.class;
    }

    @Override
    public AttemptCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new AttemptCommand(getName(), core, scriptEngine);
    }

    public static class AttemptCommand extends AbstractCommand implements Constants {

        private static final List<String> ALLOWED_VERBOSITY = List.of(QUIET, VERBOSE);

        public AttemptCommand(String name, Core core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        Result call(Callable callable) {
            return call(VERBOSE, callable);
        }

        <T> Result<T> call(String verbosity, Callable<T> callable) {
            if (!ALLOWED_VERBOSITY.contains(verbosity)) {
                throw new IllegalArgumentException("Verbosity must be in " + ALLOWED_VERBOSITY);
            }
            try {
                return Result.ok(callable.call());
            } catch (ExitException exitException) {
                throw exitException;
            } catch (Throwable ex) {
                if (verbosity == QUIET) {
                    this.getScriptLogger().error("Attempt failed: " + ex.getMessage());
                    Throwable cause = ex.getCause();
                    while (cause != null) {
                        this.getScriptLogger().error("Attempt failed caused by: (" + ex.getClass().getSimpleName() + ")" + cause.getMessage());
                        cause = cause.getCause();
                    }
                } else {
                    this.getScriptLogger().error("Attempt failed: " + ex.getMessage(), ex);
                }
                return Result.error(ex);
            }
        }
    }

}
