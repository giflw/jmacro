package com.itquasar.multiverse.jmacro.commands.browser.command.browser

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand
import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import io.github.bonigarcia.wdm.WebDriverManager
import org.apache.commons.io.FileUtils
import org.apache.logging.log4j.Logger
import org.openqa.selenium.*
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.safari.SafariOptions
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import javax.script.Bindings
import javax.script.ScriptEngine
import java.io.File as JFile
import java.nio.file.Path
import java.util.function.Consumer
import java.util.logging.Level

@Log4j2
class Browser implements Constants {

    static final Map<String, ?> UTILS = [
        by: (Object) By
    ]

    final String instanceName

    Core core
    ScriptEngine scriptEngine
    Bindings bindings
    Logger scriptLogger

    RemoteWebDriver driver
    BrowserDevTools _devTools
    BrowserWait wait
    Map<String, Object> elements = [:] as Map<String, Object>


    public static final VENDORS_MAC = List.of(CHROMIUM, CHROME, FIREFOX, SAFARI)
    public static final VENDORS_UNIX = List.of(CHROMIUM, CHROME, FIREFOX)
    public static final VENDORS_WINDOWS = List.of(CHROMIUM, CHROME, FIREFOX, EDGE)

    public static final VENDORS = switch (System.getProperty("os.name").toUpperCase().substring(0, 3)) {
        case 'MAC':
            yield VENDORS_MAC
        case 'WIN':
            yield VENDORS_WINDOWS
        default:
            yield VENDORS_UNIX
    }

    Map<String, ?> config = [
        vendor      : AUTO,
        visible     : false, //  true -> visible;  false -> headless
        driver      : null, // driver binary path
        binary      : null, // browser binary path or path#version
        version     : null, // browser binary version
        debug       : false, // driver debug
        ignoreSSL   : false, // ignore SSL errors
        capabilities: []
    ]

    Browser(String instanceName, Core core, ScriptEngine scriptEngine, Bindings bindings, Logger scriptLogger) {
        this.instanceName = instanceName
        this.core = core
        this.scriptEngine = scriptEngine
        this.bindings = bindings
        this.scriptLogger = scriptLogger

        autoConfigFromContext()
    }

    BrowserDevTools getDevTools() {
        if (this._devTools == null) {
            this._devTools = new BrowserDevTools(bindings, this)
        }
        return this._devTools
    }

    BrowserDevTools devTools(Consumer<BrowserDevTools> consumer) {
        def tools = getDevTools()
        consumer.accept(tools)
        return tools
    }

    @CompileDynamic
    private void postConfig() {
        if (((String) this.config.binary)?.contains('#')) {
            Collection parts = ((String) this.config.binary).split('#')
            this.config.binary = parts[0]
            this.config.version = parts[1]
        }
        this.config.visible = this.config.visible ?: false
    }

    Browser start() {
        if (driver == null || driver.sessionId == null) {
            this.postConfig()
            this.config.forEach { key, value ->
                scriptLogger.debug("Browser config ${key}=${value}")
            }

            def vendors = this.config.vendor == AUTO ? VENDORS : [this.config.vendor]
            MutableCapabilities capabilities = null
            String vendor = null
            WebDriverManager driverManager = (WebDriverManager) vendors.findResult { it ->
                vendor = it
                scriptLogger.warn("Trying to start browser ${vendor}")
                capabilities = getCapabilities(vendor)
                def manager = getWebDriverManager(vendor, capabilities)
                return manager.orElse(null)
            }
            if (driverManager == null) {
                throw new JMacroException("No browser found from given vendors: ${vendors} (config.vendor=${this.config.vendor})")
            }
            this.driver = (RemoteWebDriver) driverManager.create()
            this.driver.setLogLevel(this.config.debug ? Level.FINE : Level.OFF)

            scriptLogger.warn("Web driver instance ${this.driver} with ${capabilities.asMap()}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${vendor}")
            }
            this.wait = new BrowserWait(this)
            scriptLogger.warn("Browser ${vendor} started")
        }
        return this
    }

    @CompileDynamic
    void autoConfigFromContext() {
        def configuration = getBindings().get("configuration")
        configure((configuration.browser ?: Collections.emptyMap()) as Map)
    }

    void configure(Map<String, Object> config) {
        scriptLogger.warn("Configuring browser with ${config}")
        this.config.putAll(config)
    }

    void configure(ConfigObject config) {
        configure(config.spread())
    }

    def wait(String cssSelector) {
        return this.wait.call(this, cssSelector)
    }

    def wait(String cssSelector, BigDecimal timeout) {
        return this.wait.call(this, cssSelector, timeout)
    }

    def wait(WebElementWrapper element) {
        return this.wait.call(this, element)
    }

    def wait(WebElementWrapper element, BigDecimal timeout) {
        return this.wait.call(this, element, timeout)
    }

    void open(String url) {
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${config.vendor.toString().capitalize()}.", ex)
        }
    }


    Browser elements(Closure closure) {
        BrowserElements fields = new BrowserElements(this)
        closure.delegate = fields
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
        return this
    }

    def el(String name) {
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            def elements = this.driver.findElements(by)
            return new WebElementWrapper(by, elements ? elements.first() : null)
        }
        return this.elements[name]
    }

    def el(element) {
        return element
    }

    def els(String name) {
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            return this.driver.findElements(by).collect { new WebElementWrapper(by, it) }
        }
        return this.elements[name]
    }

    def els(elements) {
        return elements
    }

    @CompileDynamic
    def check(String element, Closure checkLogic) {
        def elements = this.els(element)?.first()
        if (elements) {
            return checkLogic(elements)
        }
    }

    def checks(String element, Closure checkLogic) {
        def elements = this.els(element)
        if (elements) {
            return checkLogic(elements)
        }
    }


    @CompileDynamic
    def propertyMissing(String name) {
        if (this.elements.containsKey(name)) {
            return this.elements[name]
        }
        if (this.bindings.containsKey(name)) {
            return this.bindings."$name"
        }
        if (BrowserWait.EXPECTED_CONDITIONS.containsKey(name)) {
            return name
        }
        if (UTILS.containsKey(name)) {
            return UTILS.get(name)
        }
        try {
            return Keys."$name"
        } catch (Exception ex) {
            scriptLogger.warn("$name not found on Browser. Trying context.")
            try {
                CommandUtils.propertyMissingOn(getBindings(), name)
            } catch (Exception ex2) {
                throw new JMacroException("$name not found on Browser nor context", ex2)
            }
        }
    }


    @CompileDynamic
    def methodMissing(String name, def args) {
        if (driver.respondsTo(name, args)) {
            return driver."${name}"(*args)
        }
        return AbstractCommand.methodMissingOn(getBindings(), name, args)
    }

    JFile screenshot(Path destinationFile) {
        return screenshot(destinationFile.toString())
    }

    JFile screenshot(String destinationFile) {
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.scriptLogger.info("Screenshot: $destFile")
        FileUtils.copyFile(scrFile, destFile)
        return destFile
    }

    JFile fullpage(Path destinationFile) {
        return fullpage(destinationFile.toString())
    }

    JFile fullpage(String destinationFile) {
        Screenshot screenshot = new AShot()
            .shootingStrategy(ShootingStrategies.viewportPasting(1000))
            .takeScreenshot(driver)
        JFile destFile = new JFile(destinationFile)
        this.scriptLogger.info("FullPage screenshot: $destFile")
        ImageIO.write(screenshot.getImage(), 'PNG', destFile)
        return destFile
    }

    Dimension windowSize(int width, int height) {
        Dimension dimension = new Dimension(width, height)
        driver.manage().window().setSize(dimension)
        return dimension
    }

    void maximize() {
        driver.manage().window().maximize()
    }

    private MutableCapabilities getCapabilities(String vendor) {
        MutableCapabilities capabilities = null
        //noinspection GroovyFallthrough
        switch (vendor) {
            case FIREFOX:
                capabilities = new FirefoxOptions()
                if (!config.visible) {
                    capabilities.addArguments("-headless")
                }
                if (config.binary != null) {
                    capabilities.setBinary(config.binary.toString())
                }
                break
            case SAFARI:
                capabilities = new SafariOptions()
                break
            case CHROMIUM:
            case CHROME:
            case EDGE:
                if (config.debug) {
                    System.setProperty("webdriver.chrome.verboseLogging", "true")
                }
                capabilities = EDGE == vendor ? new EdgeOptions() : new ChromeOptions()
                if (!config.visible) {
                    capabilities.addArguments("--headless=new")
                }
                if (config.binary != null) {
                    capabilities.setBinary(config.binary.toString())
                }
                break
        }
        capabilities?.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, config.ignoreSSL)
        return capabilities
    }

    private Optional<WebDriverManager> getWebDriverManager(String vendor, Capabilities capabilities) {
        scriptLogger.warn("Initializing web driver manager")
        def driverManager = new DriverManager(core.configuration.folders.cache().resolve("webdriver"))
        scriptLogger.info("Driver manager initialized (vendor=${vendor}).")
        def manager = driverManager.getManager(vendor)
        scriptLogger.info("Web driver manager created for vendor ${vendor}. Configuring it...")


        def browserPath = manager.getBrowserPath()
        if (browserPath.isEmpty()) {
            return Optional.empty()
        }

        scriptLogger.info("Browser ${vendor} found at ${browserPath}")

        ConfigurationCommand configuration = (ConfigurationCommand) scriptEngine.get('configuration')
        scriptLogger.info("Using engine script configuration: ${configuration}")

        Map<String, ?> proxyConfig = [:]
        if (configuration['proxy'] == true) {
            proxyConfig['credentials'] = (CredentialsCommand) scriptEngine.get('credentials')
        } else if (configuration['proxy'] != false && configuration['proxy'] instanceof Map<String, ?>) {
            proxyConfig = (Map<String, ?>) configuration['proxy']
        }

        scriptLogger.info("Proxy configuration ${proxyConfig}")
        scriptLogger.info("Proxy credentials ${proxyConfig.credentials}")
        if (!proxyConfig.isEmpty()) {
            scriptLogger.warn("Checking manager proxy configuration")
            managerProxy(manager, proxyConfig, vendor)
        }
        if (this.config.binary) {
            scriptLogger.warn("Binary path given. Avoiding browser detection and using ${this.config.version} as browser version.")
            manager.avoidBrowserDetection().browserVersion((String) this.config.version)
        }
        if (capabilities) {
            scriptLogger.warn("Setting manager capabilities")
            manager.capabilities(capabilities)
        }

        scriptLogger.warn("Web driver manager initialized for ${vendor} (${manager})")

        return Optional.of(manager)
    }

    @CompileDynamic
    private void managerProxy(WebDriverManager manager, Map<String, ?> proxyConfig, String vendor) {
        String proxyAddress = proxyConfig.address
        if (!proxyAddress) {
            scriptLogger.warn("Getting proxy from platform")
            String driverUrl = manager.config()."get${vendor}DriverUrl"()
            scriptLogger.warn("Searching proxy configuration using ${driverUrl} as driver url")
            def proxy = ProxySelector.default.select(URI.create(driverUrl))
                .each { scriptLogger.trace("Browser driver manager proxy available: ${it}") }
                .find { it.type() == java.net.Proxy.Type.HTTP }
                .each { scriptLogger.debug("Browser driver manager proxy found: ${it}") }
            if (proxy != null && proxy.address() != null && proxy.address() instanceof InetSocketAddress) {
                InetSocketAddress address = (InetSocketAddress) proxy.address()
                proxyAddress = "${address.hostName}:${address.port}"
                scriptLogger.warn("Using proxy address ${proxyAddress}")
            } else {
                proxyAddress = null
            }
        }
        scriptLogger.info("Proxy address: ${proxyAddress}")

        if (proxyAddress != null) {
            scriptLogger.warn("Setting manager proxy")
            manager.proxy(proxyAddress)
        }
        CredentialsCommand credentials = (CredentialsCommand) proxyConfig?.credentials
        if (credentials) {
            scriptLogger.info("Setting up proxy for web driver manager using ${credentials.fullUser}")
            manager.proxyUser(credentials.fullUser)
                .proxyPass(credentials.password)
        } else {
            scriptLogger.warn("Setting up proxy for web driver manager using anonymous")
        }
    }

    void close() {
        BrowserCommand.INSTANCES.remove(instanceName)
        if (driver) {
            scriptLogger.warn("Closing browser...")
            if (_devTools) {
                _devTools.close()
            }
            driver.quit()
            scriptLogger.warn("...browser closed.")
        }
    }

}
