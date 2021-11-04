module jmacro.commands.terminal {
    requires static lombok;

    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.apache.groovy;
    requires tn3270j;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;

    exports com.itquasar.multiverse.jmacro.commands.terminal.commands;
    exports com.itquasar.multiverse.jmacro.commands.terminal.providers;
}
