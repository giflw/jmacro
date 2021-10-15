package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Timer;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class TimerCommandProvider implements CommandProvider<Timer> {

    @Override
    public String getName() {
        return "timer";
    }

    @Override
    public Timer getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        return new Timer(scriptContext);
    }
}

