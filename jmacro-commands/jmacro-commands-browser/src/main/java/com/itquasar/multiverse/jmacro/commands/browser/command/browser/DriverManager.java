package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
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
        WebDriverManager webDriverManager = manager.avoidUseChromiumDriverSnap()
            .useLocalVersionsPropertiesFirst()
            .useLocalCommandsPropertiesFirst();

        URL versionsUrl = DriverManager.class.getResource("/webdrivermanager/versions.properties");
        LOGGER.warn("webdrivermanager versions url: " + versionsUrl);
        if (versionsUrl != null) {
            webDriverManager = webDriverManager.versionsPropertiesUrl(versionsUrl);
        }

        URL commandsUrl = ClassLoader.getSystemResource("webdrivermanager/commands.properties");
        LOGGER.warn("webdrivermanager commands url: " + commandsUrl);
        if (commandsUrl != null) {
            webDriverManager = webDriverManager.commandsPropertiesUrl(commandsUrl);
        }

        return webDriverManager
            .cachePath(cacheDir.toString())
            .resolutionCachePath(cacheDir.toString())
            .ttl(TTL.intValue())
            .ttlBrowsers(TTL.intValue())
            .clearResolutionCache()
            .avoidResolutionCache();
    }

    public RemoteWebDriver getDriver(String browserName, Capabilities capabilities) {
        DriverManagerType type = DriverManagerType.valueOf(browserName.toUpperCase());
        WebDriverManager manager = webdriverManagerHook(WebDriverManager.getInstance(type));
        if (capabilities != null) {
            manager.capabilities(capabilities);
        }
        manager.setup();
        WebDriver webDriver = manager.create();
        return (RemoteWebDriver) webDriver;
    }

}
