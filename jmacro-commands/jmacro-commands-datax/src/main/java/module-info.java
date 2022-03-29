module jmacro.commands.datax {
    requires static lombok;


    requires org.apache.groovy;
    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.apache.pdfbox;
    requires tess4j;
    requires jacob;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;

    uses com.itquasar.multiverse.jmacro.core.command.CommandProvider;

    exports com.itquasar.multiverse.jmacro.commands.datax.providers;
    exports com.itquasar.multiverse.jmacro.commands.datax.commands;
    exports com.itquasar.multiverse.jmacro.commands.datax.commands.pdf;

}
