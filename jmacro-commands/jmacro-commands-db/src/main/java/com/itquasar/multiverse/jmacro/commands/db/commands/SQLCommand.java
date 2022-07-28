package com.itquasar.multiverse.jmacro.commands.db.commands;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;

import com.itquasar.multiverse.jmacro.commands.db.commands.sql.SQLConnection;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;

import groovy.lang.Closure;

public class SQLCommand extends Command implements AutoCloseable {

    private static List<SQLConnection> instances = new ArrayList<>(0);

    public SQLCommand(final String name, final JMacroCore core, final ScriptEngine scriptEngine) {
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
