module jmacro.commands.db {
    requires static lombok;


    requires java.desktop;
    requires java.scripting;
    requires java.sql;

    requires jmacro.core;
    requires java.naming;
    requires org.apache.groovy;
    requires org.apache.groovy.sql;

    uses com.itquasar.multiverse.jmacro.core.command.CommandProvider;

    exports com.itquasar.multiverse.jmacro.commands.db.providers;
    exports com.itquasar.multiverse.jmacro.commands.db.commands;
    exports com.itquasar.multiverse.jmacro.commands.db.commands.sql;

}
