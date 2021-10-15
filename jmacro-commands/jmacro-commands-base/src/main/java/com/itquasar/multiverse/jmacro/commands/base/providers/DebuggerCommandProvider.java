package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;

import javax.script.ScriptEngine;

public class DebuggerCommandProvider implements CommandProvider<DebuggerCommandProvider.Debugger> {

    @Override
    public String getName() {
        return "debugger";
    }

    @Override
    public Debugger getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Debugger(scriptEngine);
    }

    public static class Debugger extends LoggingCommand {

        public Debugger(ScriptEngine scriptEngine) {
            super(scriptEngine);
        }

        void call() {
            this.call("Here we can debug");
        }

        void call(String message) {
            this.getLogger().debug(message);
        }
    }

}
