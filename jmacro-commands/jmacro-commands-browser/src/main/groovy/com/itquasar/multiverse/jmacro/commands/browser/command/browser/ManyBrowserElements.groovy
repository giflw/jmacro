package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import org.openqa.selenium.By

class ManyBrowserElements extends BrowserElements<List<WebElementWrapper>> {

    ManyBrowserElements(BrowserCommand browser, String name) {
        super(browser, name)
    }

    List<WebElementWrapper> find(By by) {
        return this.findElements(by)
    }

}
