package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.Result;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.concurrent.Callable;

@Log4j2
public class AttemptCommandProvider implements CommandProvider<AttemptCommandProvider.Attempt> {

    @Override
    public String getName() {
        return "attempt";
    }

    @Override
    public Attempt getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Attempt();
    }

    public static class Attempt {
        Result call(Callable callable) {
            try {
                return Result.ok(callable.call());
            } catch (Throwable ex) {
                LOGGER.error("Attempt failed: " + ex.getMessage(), ex);
                return Result.error(ex);
            }
        }
    }

}
