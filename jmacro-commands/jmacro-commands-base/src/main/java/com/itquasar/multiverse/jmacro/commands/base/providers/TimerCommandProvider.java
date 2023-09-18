package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.TimerCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

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
    public TimerCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new TimerCommand(getName(), core, scriptEngineAware);
    }
}

