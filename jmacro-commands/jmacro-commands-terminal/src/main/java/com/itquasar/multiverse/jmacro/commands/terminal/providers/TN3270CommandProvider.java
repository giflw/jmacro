package com.itquasar.multiverse.jmacro.commands.terminal.providers;

import com.itquasar.multiverse.jmacro.commands.terminal.commands.TN3270;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.tn3270j.WaitMode;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class TN3270CommandProvider implements CommandProvider<TN3270> {

    @Override
    public Class<TN3270> getCommandType() {
        return TN3270.class;
    }

    @Override
    public TN3270 getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
        bindings.put("WaitMode", WaitMode.class);
        return new TN3270(scriptEngine, bindings);
    }
}
