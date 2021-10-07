module jmacro.core {
    requires static lombok;

    requires java.scripting;
    requires java.management;

    requires simplejmx;
    requires org.yaml.snakeyaml;
    requires org.checkerframework.checker.qual;
    requires org.apache.logging.log4j;

    exports com.itquasar.multiverse.jmacro.core;
    exports com.itquasar.multiverse.jmacro.core.exceptions;
}
