package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import org.openqa.selenium.By

class SelectBrowserElement extends BrowserElements<WebElementWrapper> {

    SelectBrowserElement(Browser browser, String name) {
        super(browser, name)
    }

    WebElementWrapper find(By by) {
        return this.findSelectElement(by)
    }
}
