package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class DebuggerCommandProvider implements CommandProvider<DebuggerCommandProvider.Debugger> {

    @Override
    public String getName() {
        return "debugger";
    }

    @Override
    public Debugger getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        return new Debugger(scriptContext);
    }

    public static class Debugger extends LoggingCommand {

        public Debugger(ScriptContext scriptContext) {
            super(scriptContext);
        }

        void call() {
            this.call("Here we can debug");
        }

        void call(String message) {
            this.getLogger().debug(message);
        }
    }

}
