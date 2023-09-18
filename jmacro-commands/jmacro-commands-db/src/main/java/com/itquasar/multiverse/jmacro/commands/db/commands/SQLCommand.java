package com.itquasar.multiverse.jmacro.commands.db.commands;

import com.itquasar.multiverse.jmacro.commands.db.commands.sql.SQLConnection;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.FunctionCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SQLCommand extends AbstractCommand implements FunctionCommand<SQLConnection, Object>, AutoCloseable {

    private static final List<SQLConnection> instances = new ArrayList<>(0);

    public SQLCommand(final String name, final Core core, final ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware);
    }

    @Override
    public Object call(Function<SQLConnection, Object> function) {
        return function.apply(new SQLConnection(this));
    }

    public void notifyClosed(final SQLConnection connection) {
        SQLCommand.instances.remove(connection);
    }

    @Override
    public void close() throws Exception {
        instances.forEach(SQLConnection::close);
    }
}
