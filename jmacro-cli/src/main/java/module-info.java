module jmacro.cli {
    requires jmacro.core;

    requires static lombok;

    requires java.scripting;

    requires org.jnrproject.posix;
    requires org.jnrproject.constants;
    requires com.sun.jna.platform;
    requires info.picocli;
    requires org.checkerframework.checker.qual;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;

    opens com.itquasar.multiverse.jmacro.cli to info.picocli;
    exports com.itquasar.multiverse.jmacro.cli;
}
