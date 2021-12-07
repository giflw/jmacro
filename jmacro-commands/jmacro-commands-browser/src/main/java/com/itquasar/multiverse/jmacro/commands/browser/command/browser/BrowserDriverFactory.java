package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.Map;

public interface BrowserDriverFactory {

    List<String> browserNames();

    RemoteWebDriver create(Map<String, ?> config);

    default void checkVendor(Map<String, ?> config) {
        String vendor = (String) config.get("vendor");
        if (!browserNames().contains(vendor)) {
            new JMacroException("Browser " + vendor + " not supported by this driver factory");
        }
    }
}
