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


    public static WebDriverManager getWebDriverManager(Capabilities capabilities) {
        getLogger().warn("Initializing web driver manager")
        def driverManager = new DriverManager(core.configuration.folders.cache().resolve("webdriver"))
        getLogger().info("Driver manager initialized")
        def manager = driverManager.getManager(config.vendor.toString())
        getLogger().info("Web driver manager created. Configuring it...")

        ConfigurationCommand configuration = (ConfigurationCommand) scriptEngine.get('configuration')
        getLogger().info("Using engine script configuration: ${configuration}")

        Map<String, ?> proxyConfig = [:]
        if (configuration['proxy'] !== false && configuration['proxy'] instanceof Map<String, ?>) {
            proxyConfig = (Map<String, ?>) configuration['proxy']
        }

        getLogger().info("Proxy configuration ${proxyConfig}")
        getLogger().info("Proxy credentials ${proxyConfig.crendentials}")
        if (!proxyConfig.isEmpty()) {
            getLogger().warn("Checking manager proxy configuration")
            managerProxy(manager, proxyConfig)
        }
        if (this.config.binary) {
            getLogger().warn("Binary path given. Avoiding browser detection and using ${this.config.version} as browser version.")
            manager.avoidBrowserDetection().browserVersion((String) this.config.version)
        }
        if (capabilities) {
            getLogger().warn("Setting manager capabilities")
            manager.capabilities(capabilities)
        }
        getLogger().warn("Web driver manager initialized")
        return manager
    }


    //@CompileDynamic
    public static void managerProxy(WebDriverManager manager, Map<String, ?> proxyConfig) {
        touch()
        CredentialsCommand credentials = (CredentialsCommand) proxyConfig?.credentials
        if (credentials) {
            getLogger().info("Setting up proxy for web driver manager using ${credentials.fullUser}")
        } else {
            getLogger().warn("Setting up proxy for web driver manager using anonymous")
        }

        String proxyAddress = proxyConfig.address
        if (!proxyAddress) {
            getLogger().warn("Getting proxy from platform")
            InetSocketAddress proxy = (InetSocketAddress) ProxySelector.default.select(URI.create('http://google.com.br/'))
                .each { getLogger().warn("proxy each: $it}") }
                .find { it.type() == java.net.Proxy.Type.HTTP }
                .each { getLogger().warn("proxy found: $it}") }
                ?.address()
            proxyAddress = proxy ? "${proxy.hostName}:${proxy.port}" : null
        }
        getLogger().info("Proxy address: ${proxyAddress}")

        if (proxyAddress != null) {
            getLogger().warn("Setting manager proxy")
            manager.proxy(proxyAddress)
        }
        if (credentials != null) {
            getLogger().warn("Setting manager proxy credentials")
            manager.proxyUser(credentials.fullUser)
                .proxyPass(credentials.password)
        }
    }


}
