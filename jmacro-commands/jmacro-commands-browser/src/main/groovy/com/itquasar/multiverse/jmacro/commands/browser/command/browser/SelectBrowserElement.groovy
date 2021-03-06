package com.itquasar.multiverse.jmacro.commands.browser.command.browser

import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import org.openqa.selenium.By

class SelectBrowserElement extends BrowserElements<WebElementWrapper> {

    SelectBrowserElement(BrowserCommand browser, String name) {
        super(browser, name)
    }

    WebElementWrapper find(By by) {
        return this.findSelectElement(by)
    }
}
