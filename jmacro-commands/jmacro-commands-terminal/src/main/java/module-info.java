module jmacro.commands.terminal {
    requires static lombok;

    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.apache.groovy;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires org.apache.httpcomponents.client5.httpclient5;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;

    exports com.itquasar.multiverse.jmacro.commands.terminal;
}
