module jmacro.core {
    requires static lombok;

    requires java.scripting;
    requires java.management;
    requires java.desktop;

    requires simplejmx;
    requires org.apache.groovy;
    requires org.apache.groovy.jsr223;
    requires org.yaml.snakeyaml;
    requires org.checkerframework.checker.qual;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    requires io.vavr;
    requires gethostname4j;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires org.apache.httpcomponents.client5.httpclient5;

    exports com.itquasar.multiverse.jmacro.core.exception;
    exports com.itquasar.multiverse.jmacro.core.jmx;
    exports com.itquasar.multiverse.jmacro.core.script;
    exports com.itquasar.multiverse.jmacro.core.configuration;

    uses com.itquasar.multiverse.jmacro.core.repository.ScriptRepositoryFactory;
    uses com.itquasar.multiverse.jmacro.core.engine.LanguageAdaptor;
    uses com.itquasar.multiverse.jmacro.core.command.CommandProvider;
    uses com.itquasar.multiverse.jmacro.core.jmx.JMXBeanIFace;

    provides com.itquasar.multiverse.jmacro.core.repository.ScriptRepositoryFactory with com.itquasar.multiverse.jmacro.core.repository.FileScriptRepositoryFactory;
    provides com.itquasar.multiverse.jmacro.core.engine.LanguageAdaptor with com.itquasar.multiverse.jmacro.core.engine.ScalaLanguageAdaptor;

    opens com.itquasar.multiverse.jmacro.core.configuration to org.yaml.snakeyaml;
    exports com.itquasar.multiverse.jmacro.core.repository;
    exports com.itquasar.multiverse.jmacro.core.interfaces;
    exports com.itquasar.multiverse.jmacro.core.engine;
    exports com.itquasar.multiverse.jmacro.core.util;
    exports com.itquasar.multiverse.jmacro.core.command;
}
