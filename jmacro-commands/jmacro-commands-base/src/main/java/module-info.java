module jmacro.commands.base {
    requires static lombok;

    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;

    requires java.scripting;

    requires jmacro.core;

    exports com.itquasar.multiverse.jmacro.commands.base.commands;
    exports com.itquasar.multiverse.jmacro.commands.base.providers;
}
