package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.Result;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.List;
import java.util.concurrent.Callable;

import static com.itquasar.multiverse.jmacro.commands.base.providers.ConstantsCommandProvider.Constants.QUIET;
import static com.itquasar.multiverse.jmacro.commands.base.providers.ConstantsCommandProvider.Constants.VERBOSE;

public class AttemptCommandProvider implements CommandProvider<AttemptCommandProvider.Attempt> {

    @Override
    public String getName() {
        return "attempt";
    }

    @Override
    public Attempt getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Attempt(scriptEngine);
    }

    public static class Attempt extends LoggingCommand {

        private static final List<ConstantsCommandProvider.Constants> ALLOWED_VERBOSITIES = List.of(QUIET, VERBOSE);

        public Attempt(ScriptEngine scriptEngine) {
            super(scriptEngine);
        }

        Result call(Callable callable) {
            return call(VERBOSE, callable);
        }

        Result call(ConstantsCommandProvider.Constants verbosity, Callable callable) {
            if (!ALLOWED_VERBOSITIES.contains(verbosity)) {
                throw new IllegalArgumentException("Verbosity must be in " + ALLOWED_VERBOSITIES);
            }
            try {
                return Result.ok(callable.call());
            } catch (Throwable ex) {
                if (verbosity == QUIET) {
                    this.getLogger().error("Attempt failed: " + ex.getMessage());
                } else {
                    this.getLogger().error("Attempt failed: " + ex.getMessage(), ex);
                }

                return Result.error(ex);
            }
        }
    }

}
