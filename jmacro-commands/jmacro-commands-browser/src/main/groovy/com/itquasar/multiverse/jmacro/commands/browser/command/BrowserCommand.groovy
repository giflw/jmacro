package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.*
import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import io.github.bonigarcia.wdm.WebDriverManager
import org.apache.commons.io.FileUtils
import org.openqa.selenium.*
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import javax.script.ScriptEngine
import java.io.File as JFile
import java.nio.file.Path
import java.util.concurrent.ConcurrentLinkedQueue

class BrowserCommand extends CallableCommand implements AutoCloseable, Constants {

    static final Map<String, ?> UTILS = [
        by: (Object) By
    ]

    static class LocalHolder {
        ThreadLocal<Long> lastUsed = ThreadLocal.withInitial { System.currentTimeMillis() }
        ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>()
        ThreadLocal<BrowserDevTools> _devTools = new ThreadLocal<>()
        ThreadLocal<BrowserWait> wait = new ThreadLocal<>()
        ThreadLocal<Map<String, Object>> elements = ThreadLocal.withInitial { [:] as Map<String, Object> }

        void touch() {
            this.lastUsed.set(System.currentTimeMillis())
        }

        @CompileDynamic
        void clear() {
            driver.remove()
            _devTools.remove()
            wait.remove()
            elements.remove()
        }
    }

    private final LocalHolder local = new LocalHolder()

    private final Queue<LocalHolder> INSTANCES = new ConcurrentLinkedQueue<>()

    Map<String, ?> config = [
        vendor : CHROMIUM,
        visible: false, //  true -> visible;  false -> headless
        driver : null, // driver binary path
        binary : null, // browser binary path or path#version
        version: null, // browser binary version
        debug  : false // driver debug
    ]

    void touch() {
        this.local.touch()
    }

    RemoteWebDriver getDriver() {
        return this.local.driver.get()
    }

    void setDriver(RemoteWebDriver driver) {
        this.local.driver.set(driver)
    }

    BrowserDevTools get_devTools() {
        return this.local._devTools.get()
    }

    void set_devTools(BrowserDevTools _devTools) {
        this.local._devTools.set(_devTools)
    }

    BrowserWait getWait() {
        return this.local.wait.get()
    }

    void setWait(BrowserWait wait) {
        this.local.wait.set(wait)
    }

    Map<String, Object> getElements() {
        return this.local.elements.get()
    }

    BrowserCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        Runtime.getRuntime().addShutdownHook(
            new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        close()
                    }
                }
            )
        )
        this.postConfig()
    }

    BrowserDevTools getDevTools() {
        if (this._devTools == null) {
            this._devTools = new BrowserDevTools(bindings, this)
        }
        return this._devTools
    }

    @CompileDynamic
    private void postConfig() {
        if (this.config.binary?.contains('#')) {
            Collection parts = this.config.binary.split('#')
            this.config.binary = parts[0]
            this.config.version = parts[1]
        }
        this.config.visible = this.config.visible ?: false
    }

    BrowserCommand start() {
        touch()
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

            logger.warn("Starting browser ${config.vendor.toString().capitalize()}")
            this.config.forEach { key, value ->
                logger.warn("Browser config ${key}=${value}")
            }

            this.driver = (RemoteWebDriver) getWebDriverManager(capabilities).create()

            getLogger().warn("Web driver instance ${this.driver} with ${capabilities.asMap()}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            // driver.manage().window().maximize()
            logger.warn("Browser ${config.vendor.toString().capitalize()} started")
        }
        return this
    }

    private WebDriverManager getWebDriverManager(Capabilities capabilities) {
        touch()
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

    @CompileDynamic
    private void managerProxy(WebDriverManager manager, Map<String, ?> proxyConfig) {
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

    BrowserCommand configure(Map<String, Object> config) {
        touch()
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    BrowserCommand configure(ConfigObject config) {
        touch()
        this.config.putAll(config.spread())
        this.postConfig()
        return this
    }

    @CompileDynamic
    BrowserCommand configure(def configuration) {
        touch()
        return configure(configuration.contains('browser') ? configuration.browser : configuration.configs)
    }

    def wait(String cssSelector) {
        touch()
        return this.wait.call(this, cssSelector)
    }

    def wait(String cssSelector, BigDecimal timeout) {
        touch()
        return this.wait.call(this, cssSelector, timeout)
    }

    def wait(WebElementWrapper element) {
        touch()
        return this.wait.call(this, element)
    }

    def wait(WebElementWrapper element, BigDecimal timeout) {
        touch()
        return this.wait.call(this, element, timeout)
    }

    BrowserCommand open(String url) {
        touch()
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${config.vendor.toString().capitalize()}.", ex)
        }
    }

    void close(RemoteWebDriver driver, BrowserDevTools devTools) {
        if (driver) {
            getLogger().warn("Closing browser...")
            if (devTools) {
                devTools.close()
            }
            driver.quit()
            getLogger().warn("...browser closed.")
        }
    }

    void close() {
        closeAll(0)
    }

    void closeAll(Number timeout = 60000) {
        INSTANCES.each { localHolder ->
            {
                if (localHolder.lastUsed.get() < (System.currentTimeMillis() - timeout.longValue())) {
                    close(localHolder.driver.get(), localHolder._devTools.get())
                    INSTANCES.remove(localHolder)
                }
            }
        }
    }

    BrowserCommand elements(Closure closure) {
        touch()
        BrowserElements fields = new BrowserElements(this)
        closure.delegate = fields
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
        return this
    }

    def el(String name) {
        touch()
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            def elements = this.driver.findElements(by)
            return new WebElementWrapper(by, elements ? elements.first() : null)
        }
        return this.elements[name]
    }

    def el(element) {
        touch()
        return element
    }

    def els(String name) {
        touch()
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            return this.driver.findElements(by).collect { new WebElementWrapper(by, it) }
        }
        return this.elements[name]
    }

    def els(elements) {
        touch()
        return elements
    }

    @CompileDynamic
    def check(String element, Closure checkLogic) {
        touch()
        def elements = this.els(element)?.first()
        if (elements) {
            return checkLogic(elements)
        }
    }

    def checks(String element, Closure checkLogic) {
        touch()
        def elements = this.els(element)
        if (elements) {
            return checkLogic(elements)
        }
    }

    @CompileDynamic
    def propertyMissing(String name) {
        touch()
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
        touch()
        if (driver.respondsTo(name, args)) {
            return driver."${name}"(*args)
        }
        return methodMissingOn(context, name, args)
    }

    JFile screenshot(Path destinationFile) {
        touch()
        return screenshot(destinationFile.toString())
    }

    JFile screenshot(String destinationFile) {
        touch()
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("Screenshot: $destFile")
        FileUtils.copyFile(scrFile, destFile)
        return destFile
    }

    JFile fullpage(Path destinationFile) {
        touch()
        return fullpage(destinationFile.toString())
    }

    JFile fullpage(String destinationFile) {
        touch()
        Screenshot screenshot = new AShot()
            .shootingStrategy(ShootingStrategies.viewportPasting(1000))
            .takeScreenshot(driver)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("FullPage screenshot: $destFile")
        ImageIO.write(screenshot.getImage(), 'PNG', destFile)
        return destFile
    }

    Dimension windowSize(int width, int height) {
        touch()
        Dimension dimension = new Dimension(width, height)
        driver.manage().window().setSize(dimension)
        return dimension
    }

    void maximize() {
        touch()
        driver.manage().window().maximize()
    }

}
