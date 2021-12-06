package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserElements
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserWait
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.WebElementWrapper
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.transform.ToString
import org.apache.commons.io.FileUtils
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.OutputType
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import javax.script.ScriptEngine
import java.io.File as JFile

@CompileStatic
@ToString(includePackage = false, includeNames = true)
class BrowserCommand extends Command implements AutoCloseable, Constants {

    static final Closure DRIVER_TEMPLATE = { String vendor -> core.configuration.folders.tools().resolve(vendor).resolve("${vendor}driver${BIN_EXT}").toString() }
    static final Closure BINARY_TEMPLATE = { String vendor -> core.configuration.folders.tools().resolve(vendor).resolve("${vendor}${BIN_EXT}").toString() }

    Map<String, ?> config = [
        visible   : false,
        vendor    : FIREFOX,
        driver    : DRIVER_TEMPLATE(FIREFOX),
        binary    : BINARY_TEMPLATE(FIREFOX),
        randomPort: true,
    ]
    DesiredCapabilities desiredCapabilities
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
    }


    BrowserCommand config(Closure closure) {
        closure.setDelegate(this.config)
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        return this
    }

    BrowserCommand config(Map<String, Object> configMap) {
        this.config.putAll(config)
        return this
    }

    BrowserCommand start() {
        if (driver == null || driver.sessionId == null) {
            if (config.vendor == FIREFOX) {
                ServerSocket serverSocket = new ServerSocket(0)
                int port = serverSocket?.getLocalPort() ?: 0
                if (port == 0) {
                    throw new JMacroException(this, "Error allocating free port")
                }
                this.logger.fatal("WebDriver port: $port")


                FirefoxOptions firefoxOptions = desiredCapabilities ? new FirefoxOptions(desiredCapabilities) : new FirefoxOptions()
                // HEADLESS
                if (!config.visible) {
                    firefoxOptions.addArguments("--headless")
                }
                // BINARY PATH
                // FIXME
//                firefoxOptions.setBinary(
//                        Engine.FOLDERS.vendor.resolve('browser/firefox/win_x64/firefox.exe').toString()
//                )
                // MARIONETTE
                firefoxOptions.setCapability(FirefoxDriver.MARIONETTE, true)

                FirefoxProfile profile = firefoxOptions.getProfile() ?: new FirefoxProfile()
                profile.setPreference(FirefoxProfile.PORT_PREFERENCE, port)
                firefoxOptions.setProfile(profile)

                this.driver = new FirefoxDriver(firefoxOptions)
            } else {
                ChromeOptions chromeOptions = new ChromeOptions()
                chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")
                // HEADLESS
                if (!config.visible) {
                    chromeOptions.setHeadless(true)
                }
//                 chromeOptions.setExperimentalOption("debuggerAddress", "127.0.0.1:${port}")
//                ChromeDriverService chromeDriverService = new ChromeDriverService.Builder()
//                        .usingDriverExecutable(new java.io.File(System.getProperty("webdriver.chrome.driver")))
//                        .withVerbose(true)
//                        .usingPort(port)
//                        .build()
                this.driver = new ChromeDriver(/*chromeDriverService,*/ chromeOptions)
            }
            this.wait = new BrowserWait(this)

            driver.manage().window().maximize()
        }
    }

    def configure(ConfigurationCommand configuration) {
        configure(configuration.configs)
    }

    @CompileDynamic
    def configure(ConfigObject configuration) {
        config.putAll(configuration)
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
        if (Vendor.contains(name)) {
            return Vendor.valueOf(name)
        }
        if (this.elements.containsKey(name)) {
            return this.elements[name]
        }
        if (this.context.hasVariable(name)) {
            return this.context.getVariable(name)
        }
        try {
            return Keys."$name"
        } catch (Exception ex) {
            return name
        }
    }

    JFile takeScreenShot(String destinationFile) {
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("Screenshot: $destFile")
        FileUtils.copyFile(scrFile, destFile)
        return destFile
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
