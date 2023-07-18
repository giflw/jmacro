module jmacro.commands.server {
    requires static lombok;

    requires java.scripting;
    requires java.desktop;
    requires org.apache.groovy;
    requires org.apache.logging.log4j;

    requires jmacro.core;

    requires io.javalin;
    requires org.eclipse.jetty.server;
}
