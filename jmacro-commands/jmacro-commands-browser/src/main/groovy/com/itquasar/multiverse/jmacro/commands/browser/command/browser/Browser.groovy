package com.itquasar.multiverse.jmacro.commands.browser.command.browser

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import io.github.bonigarcia.wdm.WebDriverManager
import org.apache.commons.io.FileUtils
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.spi.AbstractLogger
import org.openqa.selenium.By
import org.openqa.selenium.Capabilities
import org.openqa.selenium.Dimension
import org.openqa.selenium.OutputType
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import javax.script.Bindings
import javax.script.ScriptEngine
import java.io.File as JFile
import java.nio.file.Path

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

    Map<String, ?> config = [
        vendor : CHROMIUM,
        visible: false, //  true -> visible;  false -> headless
        driver : null, // driver binary path
        binary : null, // browser binary path or path#version
        version: null, // browser binary version
        debug  : false // driver debug
    ]

    Browser(String instanceName, Core core, ScriptEngine scriptEngine, Bindings bindings, Logger scriptLogger) {
        this.instanceName = instanceName
        this.core = core
        this.scriptEngine = scriptEngine
        this.bindings = bindings
        this.scriptLogger = scriptLogger
    }

    BrowserDevTools getDevtools() {
        if (this._devTools == null) {
            this._devTools = new BrowserDevTools(bindings, this)
        }
        return this._devTools
    }

    BrowserDevTools devtools() {
        return this.getDevtools()
    }


    @CompileDynamic
    private void postConfig() {
        if (((String) this.config.binary)?.contains('#')) {
            Collection parts = this.config.binary.split('#')
            this.config.binary = parts[0]
            this.config.version = parts[1]
        }
        this.config.visible = this.config.visible ?: false
    }

    Browser start() {
        if (driver == null || driver.sessionId == null) {
            this.postConfig()
            Capabilities capabilities = null
            switch (config.vendor) {
                case FIREFOX:
                    capabilities = new FirefoxOptions()
                    if (!config.visible) {
                        capabilities.addArguments("-headless")
                    }
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    break
                case CHROMIUM:
                case CHROME:
                case EDGE:
                    if (config.debug) {
                        System.setProperty("webdriver.chrome.verboseLogging", "true")
                    }
                    capabilities = EDGE == config.vendor ? new EdgeOptions() : new ChromeOptions()
                    if (!config.visible) {
                        capabilities.addArguments("--headless=new")
                    }
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    //capabilities.addArguments("--disable-extensions")
                    break
            }
            //capabilities.addArguments("--ignore-certificate-errors")

            scriptLogger.warn("Starting browser ${config.vendor.toString().capitalize()}")
            this.config.forEach { key, value ->
                scriptLogger.warn("Browser config ${key}=${value}")
            }

            this.driver = (RemoteWebDriver) getWebDriverManager(capabilities).create()

            scriptLogger.warn("Web driver instance ${this.driver} with ${capabilities.asMap()}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            // driver.manage().window().maximize()
            scriptLogger.warn("Browser ${config.vendor.toString().capitalize()} started")
        }
        return this
    }

    Browser configure(Map<String, Object> config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    Browser configure(ConfigObject config) {
        this.config.putAll(config.spread())
        this.postConfig()
        return this
    }

    @CompileDynamic
    Browser configure(def configuration) {
        return configure(configuration.contains('browser') ? configuration.browser : configuration.configs)
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

    Browser open(String url) {
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
            // FIXME ADD debug logger
            try {
                Command.propertyMissingOn(context, name)
            } catch (Exception ex2) {
                // FIXME ADD debug logger
                return name
            }
        }
    }


    @CompileDynamic
    def methodMissing(String name, def args) {
        if (driver.respondsTo(name, args)) {
            return driver."${name}"(*args)
        }
        return methodMissingOn(context, name, args)
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


    WebDriverManager getWebDriverManager(Capabilities capabilities) {
        scriptLogger.warn("Initializing web driver manager")
        def driverManager = new DriverManager(core.configuration.folders.cache().resolve("webdriver"))
        scriptLogger.info("Driver manager initialized")
        def manager = driverManager.getManager(config.vendor.toString())
        scriptLogger.info("Web driver manager created. Configuring it...")

        ConfigurationCommand configuration = (ConfigurationCommand) scriptEngine.get('configuration')
        scriptLogger.info("Using engine script configuration: ${configuration}")

        Map<String, ?> proxyConfig = [:]
        if (configuration['proxy'] !== false && configuration['proxy'] instanceof Map<String, ?>) {
            proxyConfig = (Map<String, ?>) configuration['proxy']
        }

        scriptLogger.info("Proxy configuration ${proxyConfig}")
        scriptLogger.info("Proxy credentials ${proxyConfig.crendentials}")
        if (!proxyConfig.isEmpty()) {
            scriptLogger.warn("Checking manager proxy configuration")
            managerProxy(manager, proxyConfig)
        }
        if (this.config.binary) {
            scriptLogger.warn("Binary path given. Avoiding browser detection and using ${this.config.version} as browser version.")
            manager.avoidBrowserDetection().browserVersion((String) this.config.version)
        }
        if (capabilities) {
            scriptLogger.warn("Setting manager capabilities")
            manager.capabilities(capabilities)
        }
        scriptLogger.warn("Web driver manager initialized")
        return manager
    }


    //@CompileDynamic
    void managerProxy(WebDriverManager manager, Map<String, ?> proxyConfig) {
        CredentialsCommand credentials = (CredentialsCommand) proxyConfig?.credentials
        if (credentials) {
            scriptLogger.info("Setting up proxy for web driver manager using ${credentials.fullUser}")
        } else {
            scriptLogger.warn("Setting up proxy for web driver manager using anonymous")
        }

        String proxyAddress = proxyConfig.address
        if (!proxyAddress) {
            scriptLogger.warn("Getting proxy from platform")
            InetSocketAddress proxy = (InetSocketAddress) ProxySelector.default.select(URI.create('http://google.com.br/'))
                .each { scriptLogger.debug("Browser driver manager proxy available: ${it}") }
                .find { it.type() == java.net.Proxy.Type.HTTP }
                .each { scriptLogger.debug("Browser driver manager proxy found: ${it}") }
                ?.address()
            proxyAddress = proxy ? "${proxy.hostName}:${proxy.port}" : null
        }
        scriptLogger.info("Proxy address: ${proxyAddress}")

        if (proxyAddress != null) {
            scriptLogger.warn("Setting manager proxy")
            manager.proxy(proxyAddress)
        }
        if (credentials != null) {
            scriptLogger.warn("Setting manager proxy credentials")
            manager.proxyUser(credentials.fullUser)
                .proxyPass(credentials.password)
        }
    }

    void close() {
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
