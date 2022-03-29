module jmacro.installer {
    requires static lombok;

    requires java.logging;

    requires org.update4j;
    requires info.picocli;
    opens com.itquasar.multiverse.jmacro.installer to info.picocli;
}
