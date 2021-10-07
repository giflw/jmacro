module jmacro.engine {
    requires static lombok;

    requires jmacro.core;

    requires java.scripting;
    requires java.desktop;

    requires org.apache.logging.log4j;

    exports com.itquasar.multiverse.jmacro.engine;
}
