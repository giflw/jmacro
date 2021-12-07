package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.Map;

/**
 * Gecko/Firefox
 */
public class GeckoBrowserDriverFactory implements BrowserDriverFactory, Constants {

    @Override
    public List<String> browserNames() {
        return List.of(FIREFOX, GECKO);
    }

    @Override
    public RemoteWebDriver create(Map<String, ?> config) {
        checkVendor(config);

        String vendor = (String) config.get("vendor");
        if (!browserNames().contains(vendor)) {
            new JMacroException("Browser " + vendor + " not supported by this driver factory");
        }
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        if (!(boolean) config.get("visible")) {
            firefoxOptions.addArguments("--headless");
        }
        firefoxOptions.setBinary(config.get("binary").toString());
        firefoxOptions.setCapability(FirefoxDriver.Capability.MARIONETTE, true);

        FirefoxProfile profile = firefoxOptions.getProfile();
        profile = profile != null ? profile : new FirefoxProfile();
        profile.setPreference(FirefoxProfile.PORT_PREFERENCE, config.get("port"));
        firefoxOptions.setProfile(profile);

        return new FirefoxDriver(firefoxOptions);
    }
}
