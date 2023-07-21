package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ResultCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

public class ResultCommandProvider implements CommandProvider<ResultCommand> {

    @Override
    public String getName() {
        return "result";
    }

    @Override
    public Class<ResultCommand> getCommandType() {
        return ResultCommand.class;
    }

    @Override
    public ResultCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ResultCommand(getName(), core, scriptEngine);
    }

}
