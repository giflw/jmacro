package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.TimerCommand;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class TimerCommandProvider implements CommandProvider<TimerCommand> {

    @Override
    public String getName() {
        return "timer";
    }

    @Override
    public Class<TimerCommand> getCommandType() {
        return TimerCommand.class;
    }

    @Override
    public TimerCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new TimerCommand(getName(), core, scriptEngine);
    }
}

