package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

@Log4j2
public class DriverManager {

    private final Long TTL;
    private final Path cacheDir;

    public DriverManager(Path driversDir) {
        this(TimeUnit.SECONDS.convert(0, TimeUnit.DAYS), driversDir);
    }

    public DriverManager(Long TTL, Path cacheDir) {
        this.TTL = TTL;
        this.cacheDir = cacheDir;
        File file = cacheDir.toFile();
        if (!file.exists()) {
            file.mkdir();
        }
    }

    protected WebDriverManager webdriverManagerHook(WebDriverManager manager) {
        WebDriverManager webDriverManager = manager
            .avoidUseChromiumDriverSnap()
            .avoidReadReleaseFromRepository()
            .useLocalVersionsPropertiesFirst()
            .useLocalCommandsPropertiesFirst();
        return webDriverManager
            .cachePath(cacheDir.resolve("cache").toString())
            .resolutionCachePath(cacheDir.resolve("resolution-cache").toString())
            .ttl(TTL.intValue())
            .ttlBrowsers(TTL.intValue());
    }

    public WebDriverManager getManager(String browserName) {
        return getManager(browserName, false);
    }

    public WebDriverManager getManager(String browserName, boolean avoidDefaultManagerSetup) {
        DriverManagerType type = DriverManagerType.valueOf(browserName.toUpperCase());
        WebDriverManager manager = WebDriverManager.getInstance(type);
        manager = avoidDefaultManagerSetup ? manager : webdriverManagerHook(manager);
        return manager;
    }

    public RemoteWebDriver getDriver(String browserName, Capabilities capabilities) {
        return getDriver(browserName, capabilities, false);
    }

    public RemoteWebDriver getDriver(String browserName, Capabilities capabilities, boolean avoidDefaultManagerSetup) {
        WebDriverManager manager = getManager(browserName, avoidDefaultManagerSetup);
        if (capabilities != null) {
            LOGGER.warn("Adding driver capabilities: " + capabilities);
            manager.capabilities(capabilities);
        }
        manager.setup();
        WebDriver webDriver = manager.create();
        return (RemoteWebDriver) webDriver;
    }
}
