module jmacro.engine {
    requires static lombok;

    requires jmacro.core;

    requires java.scripting;
    requires java.desktop;

    requires org.yaml.snakeyaml;
    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;

    exports com.itquasar.multiverse.jmacro.engine;
}
