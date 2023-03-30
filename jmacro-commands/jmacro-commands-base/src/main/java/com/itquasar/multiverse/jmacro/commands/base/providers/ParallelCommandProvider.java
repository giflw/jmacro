package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ParallelCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

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
    public ParallelCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ParallelCommand(getName(), jMacroCore, scriptEngine);
    }

}

