package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

@Log4j2
public class DebuggerCommandProvider implements CommandProvider<DebuggerCommandProvider.Debugger> {

    @Override
    public String getName() {
        return "debugger";
    }

    @Override
    public Debugger getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Debugger();
    }

    public static class Debugger {

        void call() {
            this.call("Here we can debug");
        }

        void call(String message) {
            LOGGER.debug(message);
        }
    }

}
