package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import org.openqa.selenium.By

class OneBrowserElement extends BrowserElements<WebElementWrapper> {

    OneBrowserElement(BrowserCommand browser, String name) {
        super(browser, name)
    }

    WebElementWrapper find(By by) {
        return this.findElement(by)
    }

}
