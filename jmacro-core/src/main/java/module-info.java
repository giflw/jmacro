module jmacro.core {
    requires static lombok;

    requires java.scripting;
    requires java.management;
    requires java.desktop;

    requires simplejmx;
    requires org.apache.groovy;
    requires org.yaml.snakeyaml;
    requires org.checkerframework.checker.qual;
    requires org.apache.logging.log4j;

    exports com.itquasar.multiverse.jmacro.core;
    exports com.itquasar.multiverse.jmacro.core.exceptions;
    exports com.itquasar.multiverse.jmacro.core.jmx;
    exports com.itquasar.multiverse.jmacro.core.command;
    exports com.itquasar.multiverse.jmacro.core.script;
    exports com.itquasar.multiverse.jmacro.core.configuration;

    uses com.itquasar.multiverse.jmacro.core.script.ScriptRepositoryFactory;
    provides com.itquasar.multiverse.jmacro.core.script.ScriptRepositoryFactory with com.itquasar.multiverse.jmacro.core.script.FileScriptRepositoryFactory;
    opens com.itquasar.multiverse.jmacro.core.configuration to org.yaml.snakeyaml;
}
