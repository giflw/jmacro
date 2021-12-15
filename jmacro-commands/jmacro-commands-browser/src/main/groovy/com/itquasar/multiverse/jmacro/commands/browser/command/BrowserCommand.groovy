package com.itquasar.multiverse.jmacro.commands.browser.command


import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserElements
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserWait
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.DriverManager
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.WebElementWrapper
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.commons.io.FileUtils
import org.openqa.selenium.By
import org.openqa.selenium.Capabilities
import org.openqa.selenium.Keys
import org.openqa.selenium.OutputType
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

@CompileStatic
class BrowserCommand extends Command implements AutoCloseable, Constants {

    static final Map<String, ?> UTILS = [
        by: (Object) By
    ]

    Map<String, ?> config = [
        vendor : FIREFOX,
        port   : 0, // random
        visible: false, //  true -> visible;  false -> headless
        driver : null, // driver binary path
        binary : null // browser binary path
    ]
    RemoteWebDriver driver = null
    BrowserWait wait = null
    Map<String, ?> elements = [:]

    BrowserCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
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

    @CompileDynamic
    private void postConfig() {
        if (this.config.port == 0) {
            ServerSocket serverSocket = new ServerSocket(0)
            int port = serverSocket?.getLocalPort()
            if (port == -1) {
                throw new JMacroException(this, "Error allocating free port")
            }
            this.logger.fatal("WebDriver port: $port")
            this.config.port = port
        }

        this.config.visible = this.config.visible ?: false
        this.config.vendor = this.config.vendor ?: FIREFOX
    }

    BrowserCommand start() {
        if (driver == null || driver.sessionId == null) {
            this.postConfig()
            Capabilities capabilities = null
            switch (config.vendor) {
                case FIREFOX:
                    capabilities = new FirefoxOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    capabilities.setHeadless(!config.visible)
                    break
                case CHROMIUM:
                case CHROME:
                    capabilities = new ChromeOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    capabilities.setHeadless(!config.visible)
                    break
                case EDGE:
                    capabilities = new EdgeOptions()
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    capabilities.setHeadless(!config.visible)
                    break
            }

            logger.warn("Starting browser ${config.vendor.toString().capitalize()}")
            this.config.forEach { key, value ->
                logger.warn("Browser config ${key}=${value}")
            }
            def driverManager = new DriverManager(core.configuration.folders.tools().resolve("webdriver"))
            this.driver = driverManager.getDriver(config.vendor.toString(), capabilities)
            getLogger().warn("Web driver instance ${this.driver}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            driver.manage().window().maximize()
            logger.warn("Browser ${config.vender.toString().capitalize()} started")
        }
    }

    BrowserCommand configure(Map<String, Object> config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    @CompileDynamic
    BrowserCommand configure(ConfigObject config) {
        this.config.putAll(config)
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

    @CompileDynamic
    BrowserCommand open(String url) {
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${config.vendor.capitalize()}.", ex)
        }
    }

    void close() {
        if (driver) {
            this.logger.warn("Closing browser...")
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
            return name
        }
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

}
