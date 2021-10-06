module jmacro.core {
    requires static lombok;

    requires java.scripting;
    requires org.apache.logging.log4j;

    exports com.itquasar.multiverse.jmacro.core;
    exports com.itquasar.multiverse.jmacro.core.exceptions;
}
