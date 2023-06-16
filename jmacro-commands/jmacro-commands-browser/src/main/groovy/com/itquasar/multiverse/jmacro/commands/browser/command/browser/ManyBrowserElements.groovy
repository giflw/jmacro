package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import org.openqa.selenium.By

class ManyBrowserElements extends BrowserElements<List<WebElementWrapper>> {

    ManyBrowserElements(Browser browser, String name) {
        super(browser, name)
    }

    List<WebElementWrapper> find(By by) {
        return this.findElements(by)
    }

}
