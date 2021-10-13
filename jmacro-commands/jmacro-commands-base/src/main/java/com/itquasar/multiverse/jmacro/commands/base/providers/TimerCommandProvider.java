package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Timer;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptContext;

public class TimerCommandProvider implements CommandProvider<Timer> {

    @Override
    public String getName() {
        return "timer";
    }

    @Override
    public Timer getCommand(ScriptContext context) {
        return new Timer();
    }
}

