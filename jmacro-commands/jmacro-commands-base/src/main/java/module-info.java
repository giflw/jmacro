module jmacro.commands.base {
    requires static lombok;

    requires io.vavr;
    requires org.apache.groovy;
    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires org.apache.httpcomponents.client5.httpclient5;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;

    exports com.itquasar.multiverse.jmacro.commands.base;
    exports com.itquasar.multiverse.jmacro.commands.base.providers;
    exports com.itquasar.multiverse.jmacro.commands.base.commands;
    exports com.itquasar.multiverse.jmacro.commands.base.commands.configuration;
    exports com.itquasar.multiverse.jmacro.commands.base.commands.moment;
    exports com.itquasar.multiverse.jmacro.commands.base.commands.parallel;
}
