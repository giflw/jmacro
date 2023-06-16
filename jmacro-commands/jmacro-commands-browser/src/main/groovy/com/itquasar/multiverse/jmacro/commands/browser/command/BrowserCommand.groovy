package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand
import com.itquasar.multiverse.jmacro.commands.browser.command.browser.*
import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.OnShutdown;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
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
import java.util.concurrent.ConcurrentList

class BrowserCommand extends CallableCommand implements AutoCloseable, Constants, OnShutdown {

    private final List<Browser> INSTANCES = new ConcurrentList<>()

    BrowserCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.postConfig()
    }

    @Override
    void onShutdown() {
        close()
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
        INSTANCES.each { (browser) ->
            {
                close(browser.driver, browser._devTools)
                INSTANCES.remove(browser)
            }
        }
    }

}
