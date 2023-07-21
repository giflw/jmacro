package com.itquasar.multiverse.jmacro.commands.db.commands;

import com.itquasar.multiverse.jmacro.commands.db.commands.sql.SQLConnection;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import groovy.lang.Closure;

import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.List;

public class SQLCommand extends AbstractCommand implements AutoCloseable {

    private static final List<SQLConnection> instances = new ArrayList<>(0);

    public SQLCommand(final String name, final Core core, final ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    public SQLConnection call(final Closure closure) {
        final var sqlConnection = new SQLConnection(this);
        closure.setDelegate(sqlConnection);
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        closure.call();
        return sqlConnection;
    }

    public void notifyClosed(final SQLConnection connection) {
        SQLCommand.instances.remove(connection);
    }

    @Override
    public void close() throws Exception {
        instances.forEach(SQLConnection::close);
    }
}
