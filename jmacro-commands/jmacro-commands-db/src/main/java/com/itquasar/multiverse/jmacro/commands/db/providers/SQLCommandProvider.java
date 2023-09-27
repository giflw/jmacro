package com.itquasar.multiverse.jmacro.commands.db.providers;

import com.itquasar.multiverse.jmacro.commands.db.commands.SQLCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class SQLCommandProvider implements CommandProvider<SQLCommand> {

    @Override
    public Class<SQLCommand> getCommandType() {
        return SQLCommand.class;
    }

    @Override
    public SQLCommand getCommand(final Core core, final ScriptEngineAware scriptEngineAware) {
        return new SQLCommand(core, scriptEngineAware);
    }
}
