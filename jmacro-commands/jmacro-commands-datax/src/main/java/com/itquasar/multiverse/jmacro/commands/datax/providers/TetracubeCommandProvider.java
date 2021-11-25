package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.TetracubeCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class TetracubeCommandProvider implements CommandProvider<TetracubeCommand> {

    @Override
    public Class<TetracubeCommand> getCommandType() {
        return TetracubeCommand.class;
    }

    @Override
    public TetracubeCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new TetracubeCommand();
    }
}
