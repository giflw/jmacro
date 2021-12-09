package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private final Long TTL;
    private final Path cacheDir;

    public DriverManager(Path cacheDir) {
        this(TimeUnit.SECONDS.convert(365, TimeUnit.DAYS), cacheDir);
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
        return manager.avoidUseChromiumDriverSnap()
            .useLocalVersionsPropertiesFirst()
            .useLocalCommandsPropertiesFirst();
    }

    public RemoteWebDriver getDriver(String browserName) {
        DriverManagerType type = DriverManagerType.valueOf(browserName.toUpperCase());
        WebDriverManager manager = webdriverManagerHook(WebDriverManager.getInstance(type))
            .cachePath(cacheDir.toString())
            .resolutionCachePath(cacheDir.toString())
            .ttl(TTL.intValue())
            .ttlBrowsers(TTL.intValue());
        manager.setup();
        WebDriver webDriver = manager.create();
        return (RemoteWebDriver) webDriver;
    }

}
