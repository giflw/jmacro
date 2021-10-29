module jmacro.cli {
    requires jmacro.core;
    requires jmacro.commands.base;

    requires static lombok;

    requires java.scripting;

    requires info.picocli;
    requires org.checkerframework.checker.qual;

    opens com.itquasar.multiverse.jmacro.cli to info.picocli;
}
