package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ParallelCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ParallelCommandProvider implements CommandProvider<ParallelCommand> {

    @Override
    public String getName() {
        return "parallel";
    }

    @Override
    public Class<ParallelCommand> getCommandType() {
        return ParallelCommand.class;
    }

    @Override
    public ParallelCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ParallelCommand(getName(), core, scriptEngineAware);
    }

}

