package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.browser.command.browser.*
import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import org.apache.commons.io.FileUtils
import org.openqa.selenium.*
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeDriverService
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import javax.script.ScriptEngine
import java.io.File as JFile
import java.nio.file.Files
import java.nio.file.Path

class BrowserCommand extends CallableCommand implements AutoCloseable, Constants {

    static final Map<String, ?> UTILS = [
        by: (Object) By
    ]

    Map<String, ?> config = [
        mode   : EMBEDDED,
        vendor : CHROMIUM,
        port   : 0, // random
        visible: false, //  true -> visible;  false -> headless
        driver : null, // driver binary path
        binary : null, // browser binary path or path#version
        version: null // browser binary version
    ]

    RemoteWebDriver driver = null
    private BrowserDevTools _devTools = null
    BrowserWait wait = null
    Map<String, ?> elements = [:]

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
        return _devTools
    }

    @CompileDynamic
    private void postConfig() {
        if (this.config.port == 0) {
            ServerSocket serverSocket = new ServerSocket(0)
            int port = serverSocket?.getLocalPort()
            if (port == -1) {
                throw new JMacroException(this, "Error allocating free port")
            }
            this.logger.debug("WebDriver port: $port")
            this.config.port = port
        }
        if (this.config.binary?.contains('#')) {
            Collection parts = this.config.binary.split('#')
            this.config.binary = parts[0]
            this.config.version = parts[1]
        }
        this.config.visible = this.config.visible ?: false
        this.config.vendor = this.config.vendor ?: EMBEDDED
    }

    BrowserCommand start() {
        if (driver == null || driver.sessionId == null) {
            this.postConfig()
            Capabilities capabilities = null
            switch (config.vendor) {
                case FIREFOX:
                    if (config.mode == EMBEDDED) {
                        Path ffDir = core.configuration.folders.tools().resolve('firefox')
                        config.binary = ffDir.resolve(IS_WINDOWS ? 'firefox.exe' : 'firefox')
                        // Version=95.0 -> 95
                        config.version = Files.readAllLines(ffDir.resolve("application.ini"))
                            .find { it.startsWith('Version=') }
                            .split('[=.]')[1]
                    }
                    capabilities = new FirefoxOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    if (config.visible) {
                        capabilities.addArguments("-headless")
                    }
                    break
                case CHROMIUM:
                    if (config.mode == EMBEDDED) {
                        Path chromeDir = core.configuration.folders.tools().resolve('chromium')
                        config.binary = chromeDir.resolve(IS_WINDOWS ? 'chrome.exe' : 'chrome')
                        // 99.0.4844.51 -> 99
                        config.version = Files.list(chromeDir).filter {
                            it.fileName.toString().matches(".*[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+.*")
                        }.findFirst().get()
                            .fileName.toString()
                            .split('_')[1]
                            .split('[.]').first()
                    }
                    capabilities = new ChromeOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    if (config.visible) {
                        capabilities.addArguments("--headless=new")
                    }
                    break
                case CHROME:
                    if (config.mode == EMBEDDED) {
                        Path chromeDir = core.configuration.folders.tools().resolve('chrome')
                        config.binary = chromeDir.resolve(IS_WINDOWS ? 'chrome.exe' : 'chrome')
                        // 99.0.4844.51 -> 99
                        config.version = Files.list(chromeDir).filter {
                            it.fileName.toString().matches("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+")
                        }.findFirst().get()
                            .fileName.toString()
                            .split('[.]').first()
                    }
                    capabilities = new ChromeOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    if (config.visible) {
                        capabilities.addArguments("--headless=new")
                    }
                    break
                case EDGE:
                    capabilities = new EdgeOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    if (config.visible) {
                        capabilities.addArguments("--headless=new")
                    }
                    //capabilities.addArguments("--disable-extensions")
                    break
            }
            //capabilities.addArguments("--ignore-certificate-errors")

            logger.warn("Starting browser ${config.vendor.toString().capitalize()}")
            this.config.forEach { key, value ->
                logger.warn("Browser config ${key}=${value}")
            }
            def driverManager = new DriverManager(core.configuration.folders.cache().resolve("webdriver"))
            def manager = driverManager.getManager(config.vendor.toString())
            if (this.config.binary) {
                getLogger().warn("Binary path given. Avoiding browser detection and using ${this.config.version} as browser version.")
                manager = manager.avoidBrowserDetection().browserVersion((String) this.config.version)
                if (capabilities) {
                    manager.capabilities(capabilities)
                }
                manager.setup()
                this.driver = (RemoteWebDriver) manager.create()
            } else {
                getLogger().warn("Binary path not given. Trying browser detection with no specific version.")
                this.driver = driverManager.getDriver(config.vendor.toString(), capabilities)
            }

            getLogger().warn("Web driver instance ${this.driver} with ${capabilities.asMap()}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            // driver.manage().window().maximize()
            logger.warn("Browser ${config.vendor.toString().capitalize()} started")
        }
    }

    BrowserCommand configure(Map<String, Object> config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    BrowserCommand configure(ConfigObject config) {
        this.config.putAll(config.spread())
        this.postConfig()
        return this
    }

    @CompileDynamic
    BrowserCommand configure(def configuration) {
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

    BrowserCommand open(String url) {
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${config.vendor.toString().capitalize()}.", ex)
        }
    }

    void close() {
        if (driver) {
            this.logger.warn("Closing browser...")
            if (this._devTools) {
                this._devTools.close()
            }
            driver.quit()
            this.logger.warn("...browser closed.")
        }
    }

    BrowserCommand elements(Closure closure) {
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

    def el(element) { return element }

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
        return Command.methodMissingOn(context, name, args)
    }

    JFile screenshot(Path destinationFile) {
        return screenshot(destinationFile.toString())
    }

    JFile screenshot(String destinationFile) {
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("Screenshot: $destFile")
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
        this.logger.info("FullPage screenshot: $destFile")
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

}
