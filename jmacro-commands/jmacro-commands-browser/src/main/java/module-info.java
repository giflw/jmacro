module jmacro.commands.browser {
    requires static lombok;

    requires org.apache.logging.log4j;
    requires org.checkerframework.checker.qual;
    requires org.apache.groovy;
    requires org.seleniumhq.selenium.support;
    requires org.seleniumhq.selenium.chrome_driver;
    requires org.seleniumhq.selenium.edge_driver;
    requires org.seleniumhq.selenium.firefox_driver;
    requires org.seleniumhq.selenium.remote_driver;
    requires org.seleniumhq.selenium.devtools_v85;
    requires io.github.bonigarcia.webdrivermanager;
    requires org.apache.commons.io;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires ashot;

    requires java.desktop;
    requires java.scripting;

    requires jmacro.core;
    requires jmacro.commands.base;

    exports com.itquasar.multiverse.jmacro.commands.browser;
}
