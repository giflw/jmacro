package com.itquasar.multiverse.jmacro.commands.db.commands.sql


import com.itquasar.multiverse.jmacro.commands.db.commands.SQLCommand
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.sql.Sql
import groovy.transform.CompileDynamic
import lombok.SneakyThrows

public class SQLConnection implements AutoCloseable, Constants {

    private final SQLCommand sqlCommand
    private Sql sql
    private int batchSize = 100

    public SQLConnection(SQLCommand sqlCommand) {
        this.sqlCommand = sqlCommand
    }

    // TODO add support to receive another Sql instance
    // FIXME return this
    Sql connect(final String url, final String user = null, final String password = null) {
        CommandUtils.log(this.sqlCommand.bindings, WARNING, "Connecting to ${url} as ${user}")
        this.sql = Sql.newInstance(url, user, password)
        return this.sql
    }

    boolean isClosed() {
        return this.sql.connection.isClosed()
    }

    @Override
    @SneakyThrows
    public void close() {
        if (this.sql != null && !this.sql?.connection.closed) {
            this.sql.close()
            this.sqlCommand.notifyClosed(this)
        }
    }

    SQLConnection setBatchSize(int batchSize) {
        this.batchSize = batchSize
        return this
    }

    @CompileDynamic
    def methodMissing(String name, def args) {
        if (this.sql.respondsTo(name)) {
            CommandUtils.methodMissingOn(this.sql, name, args)
        }
        if (this.sql?.connection.respondsTo(name)) {
            CommandUtils.methodMissingOn(this.sql.connection, name, args)
        }
        if (name.contains(" ") || name.contains(";")) {
            String command = name.contains(" ") ? name.substring(0, name.indexOf(" ")).trim().toUpperCase() : name
            switch (command) {
                case "SELECT":
                    // FIXME allow use of positional substitution, not only named
                    return args ? sql.rows(*args, name) : sql.rows(name)
                    // FIXME allow batch using multi inserts (substring in VALUES)
                case "INSERT":
                case "UPDATE":
                case "DELETE":
                    if (args && args[0] != null) {
                        if (args.length == 1 && Map.isInstance(args[0])) {
                            return this.sql.execute(*args, name)
                        }
                        // suppose array or list of maps
                        args = args[0].getClass().isArray() || List.isInstance(args[0]) ? args[0] : args
                        return sql.withBatch(this.batchSize, name) { ps ->
                            args.findAll { it != null }.each { row ->
                                ps.addBatch(row)
                            }
                        }
                    } else {
                        return this.sql.execute(name)
                    }
                default:
                    return this.sql.execute(name)
            }
        }
        return CommandUtils.methodMissingOn(this.sqlCommand.bindings, name, args)
    }

    def propertyMissing(String name) {
        return CommandUtils.propertyMissingOnOrChainToContext(this.sqlCommand, this.sql, name)
    }
}
