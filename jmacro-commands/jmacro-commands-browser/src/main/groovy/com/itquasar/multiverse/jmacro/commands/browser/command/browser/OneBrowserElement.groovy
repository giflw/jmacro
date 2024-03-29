package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import org.openqa.selenium.By

class OneBrowserElement extends BrowserElements<WebElementWrapper> {

    OneBrowserElement(Browser browser, String name) {
        super(browser, name)
    }

    WebElementWrapper find(By by) {
        return this.findElement(by)
    }

}
