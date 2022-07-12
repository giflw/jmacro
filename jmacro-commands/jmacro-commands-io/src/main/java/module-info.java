module jmacro.commands.io {
    requires static lombok;


    requires groovycsv;
    requires org.apache.groovy;
    requires org.apache.groovy.json;
    requires org.apache.groovy.xml;
    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.jsoup;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires org.apache.httpcomponents.client5.httpclient5.fluent;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires zip4j;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;

    uses com.itquasar.multiverse.jmacro.core.command.CommandProvider;

    exports com.itquasar.multiverse.jmacro.commands.io;
    exports com.itquasar.multiverse.jmacro.commands.io.providers;
    exports com.itquasar.multiverse.jmacro.commands.io.commands;
    exports com.itquasar.multiverse.jmacro.commands.io.commands.request;
    exports com.itquasar.multiverse.jmacro.commands.io.commands.zip;
}
