package com.itquasar.multiverse.jmacro.commands.browser


import groovy.transform.CompileDynamic
import org.openqa.selenium.By

@CompileDynamic
class BrowserExtensionMethods {
    static {
        By.metaClass.static.css = { String selector -> By.cssSelector(selector) }
    }
    static Class<By> by = By

}
