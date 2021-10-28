package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.base.commands.Configuration
import com.itquasar.multiverse.jmacro.commands.browser.BrowserExtensionMethods
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserElements
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.BrowserWait
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.WebElementWrapper
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand
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
import javax.script.ScriptContext
import java.io.File as JFile

@CompileStatic
@ToString(includePackage = false, includeNames = true)
class Browser extends LoggingCommand implements GroovyCommand, AutoCloseable {

    // FIXME
//    static {
//        System.setProperty("webdriver.gecko.driver", Engine.FOLDERS.vendor.resolve('browser/firefox/win_x64/geckodriver.exe').toString())
//        System.setProperty("webdriver.chrome.driver", Engine.FOLDERS.vendor.resolve('browser/chrome/win_x32/chromedriver.exe').toString())
//    }

    static Class<By> by = BrowserExtensionMethods.by

    static enum Vendor {
        CHROME, FIREFOX;

        static boolean contains(String name) {
            return values().find { it.name() == name }
        }
    }

    Map<String, ?> config = [:]
    DesiredCapabilities proxyCapabilities
    RemoteWebDriver driver = null
    BrowserWait wait = null
    Map<String, ?> elements = [:]
    Vendor vendor = Vendor.CHROME

    Browser(ScriptContext scriptContext) {
        super(scriptContext)
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

    Browser start() {
        if (driver == null || driver.sessionId == null) {
            if (vendor == Vendor.FIREFOX) {
                ServerSocket serverSocket = new ServerSocket(0)
                int port = serverSocket?.getLocalPort() ?: 0
                if (port == 0) {
                    throw new JMacroException(this, "Error allocating free port")
                }
                this.logger.fatal("WebDriver port: $port")


                FirefoxOptions firefoxOptions = proxyCapabilities ? new FirefoxOptions(proxyCapabilities) : new FirefoxOptions()
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

    def configure(Configuration configuration) {
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

    Browser open(String url) {
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${vendor.name().toLowerCase().capitalize()}.", ex)
        }
    }

    void close() {
        if (driver) {
            this.logger.warn("Closing browser...")
            driver.quit()
            this.logger.warn("...browser closed.")
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
