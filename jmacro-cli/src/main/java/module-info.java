module jmacro.cli {
    requires jmacro.core;

    requires static lombok;

    requires info.picocli;

    requires org.checkerframework.checker.qual;

    opens com.itquasar.multiverse.jmacro.cli to info.picocli;
}
