package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import groovy.transform.CompileDynamic
import groovy.transform.ToString
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

@ToString(includeNames = true, includeFields = true, includePackage = false, includes = ['name'])
class BrowserElements<T> {

    Browser browser

    String name = null
    By by = null

    BrowserElements(Browser browser) {
        this.browser = browser
    }

    BrowserElements(Browser browser, String name) {
        this(browser)
        this.name = name
    }

    private T setField(T element) {
        browser.elements.put(this.name, (Object) element)
        return element
    }

    T id(String id) {
        return setField(_find(By.id(id)))
    }

    T name(String name) {
        return setField(_find(By.name(name)))
    }

    T xpath(String xpath) {
        return setField(_find(By.xpath(xpath)))
    }

    T css(String cssSelector) {
        return setField(_find(By.cssSelector(cssSelector)))
    }

    BrowserElements call(BrowserElements arg) {
        return arg
    }

    private T _find(By by) {
        this.by = by
        return (T) this.find(by)
    }

    protected T find(By by) {
        throw new Error('Please, use one of the implementations: One or Many')
    }

    protected WebElementWrapper findSelectElement(By by) {
        def elements = browser.driver.findElements(by)
        return new WebElementWrapper(by, elements ? new Select(elements.first()) : null)
    }

    protected WebElementWrapper findElement(By by) {
        def elements = browser.driver.findElements(by)
        return new WebElementWrapper(by, elements ? elements.first() : null)
    }

    protected List<WebElementWrapper> findElements(By by) {
        return browser.driver.findElements(by).collect { new WebElementWrapper(by, it) }
    }

    def propertyMissing(String name) {
        switch (name) {
            case 'one':
                return new OneBrowserElement(browser, this.name)
            case 'many':
                return new ManyBrowserElements(browser, this.name)
            case 'select':
                return new SelectBrowserElement(browser, this.name)
        }
        throw new MissingPropertyException(name, BrowserElements.class)
    }

    @CompileDynamic
    def methodMissing(String name, args) {
        BrowserElements obj = args[0]
        obj.name = name
        return obj
    }

}
