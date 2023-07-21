package com.itquasar.multiverse.jmacro.commands.db.providers;

import com.itquasar.multiverse.jmacro.commands.db.commands.SQLCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

public class SQLCommandProvider implements CommandProvider<SQLCommand> {

    @Override
    public String getName() {
        return "sql";
    }

    @Override
    public Class<SQLCommand> getCommandType() {
        return SQLCommand.class;
    }

    @Override
    public SQLCommand getCommand(final Core core, final ScriptEngine scriptEngine) {
        return new SQLCommand(this.getName(), core, scriptEngine);
    }
}
