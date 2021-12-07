package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserDriverFactory
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserElements
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserWait
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.WebElementWrapper
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.SPILoader
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.commons.io.FileUtils
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.OutputType
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

    static Map<String, BrowserDriverFactory> DRIVER_FACTORIES = new LinkedHashMap<>()
    static {
        new SPILoader<>(BrowserDriverFactory.class).load().forEachRemaining(factory -> {
            factory.browserNames().forEach(name ->
                DRIVER_FACTORIES.put(name, factory)
            )
        })
    }

    Map<String, ?> config = [:]
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

        this.config.driverTemplate = this.config.driverTemplate ?: { String vendor -> this.core.configuration.folders.tools().resolve(vendor).resolve("${vendor}driver${BIN_EXT}").toString() }
        this.config.binaryTemplate = this.config.binaryTemplate ?: { String vendor -> this.core.configuration.folders.tools().resolve(vendor).resolve("${vendor}${BIN_EXT}").toString() }
        this.config.visible = this.config.visible ?: false
        this.config.vendor = this.config.vendor ?: FIREFOX
        this.config.driver = this.config.driver ?: config.driverTemplate(this.config.vendor)
        this.config.binary = this.config.binary ?: config.binaryTemplate(this.config.vendor)
    }

    BrowserCommand start() {
        if (driver == null || driver.sessionId == null) {
            if (this.DRIVER_FACTORIES.containsKey(config.vendor)) {
                this.driver = this.DRIVER_FACTORIES[config.vendor].create(this.config)
            } else {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            driver.manage().window().maximize()
        }
    }

    BrowserCommand config(Map<String, Object> config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    @CompileDynamic
    BrowserCommand config(ConfigObject config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    @CompileDynamic
    BrowserCommand config(def configuration) {
        if (configuration.hasProperty("configs")) {
            return config(configuration.configs.browser ?: configuration.configs)
        }
        throw new JMacroException("Object of type ${configuration.class} has no property configs of type Map<String, Object> or ConfigObjec")
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
        if (this.context.name) {
            return this.context.name
        }
        try {
            return Keys."$name"
        } catch (Exception ex) {
            return name
        }
    }

    JFile takeScreenShot(Path destinationFile) {
        return takeScreenShot(destinationFile.toString())
    }

    JFile takeScreenShot(String destinationFile) {
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("Screenshot: $destFile")
        FileUtils.copyFile(scrFile, destFile)
        return destFile
    }

    JFile takeFullPage(Path destinationFile) {
        return takeFullPage(destinationFile.toString())
    }

    JFile takeFullPage(String destinationFile) {
        Screenshot screenshot = new AShot()
            .shootingStrategy(ShootingStrategies.viewportPasting(1000))
            .takeScreenshot(driver)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("FullPage screenshot: $destFile")
        ImageIO.write(screenshot.getImage(), 'PNG', destFile)
        return destFile
    }

}
