package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.RemoteWebElement

@CompileStatic
class WebElementWrapper {

    static WebElementWrapper NONE = new WebElementWrapper(null, null)

    private def webElement
    By by

    def getWebElement() {
        return webElement
    }

    WebElementWrapper(By by, webElement) {
        this.webElement = webElement
        this.by = by
    }

    def unwrap() {
        return webElement
    }

    boolean exists() {
        return webElement != null && webElement
    }

    def ifEnabled(Closure closure) {
        if (webElement != null && ((WebElement) webElement).isEnabled()) {
            closure.delegate = this
            closure.resolveStrategy = Closure.DELEGATE_FIRST
            return closure(this)
        }
    }

    def then(Closure closure) {
        return closure(this)
    }

    def ifExists(Closure closure) {
        if (exists()) {
            return closure(this)
        }
    }

    def ifNotExists(Closure closure) {
        if (!exists()) {
            return closure(this)
        }
    }

    @CompileDynamic
    def get(String propOrAttrName) {
        return webElement?.hasProperty(propOrAttrName)
            ? webElement?."$propOrAttrName"
            : webElement?.getAttribute(propOrAttrName)
    }

    def forceValidation(BigDecimal beforeCleanDelay = null, BigDecimal afterCleanDelay = null) {
        sendKeys(' ')
        delay(beforeCleanDelay)
        sendKeys(Keys.BACK_SPACE)
        delay(afterCleanDelay)
    }

    def delay(BigDecimal seconds = 0.2) {
        if (seconds && webElement) {
            Thread.sleep((seconds * 1000).longValue())
        }
        return this
    }

    def sendKeys(keys, BigDecimal delay, jumpKey = null) {
        return sendKeys(keys, delay, null, jumpKey)
    }

    def sendKeys(keys, Closure transform = null, jumpKey = null) {
        return sendKeys(keys, null, transform, jumpKey)
    }

    @CompileDynamic
    def sendKeys(keys, BigDecimal delay, Closure transform, jumpKey = null) {
        if (keys != null) {
            transform = transform ?: Closure.IDENTITY
            this.webElement.sendKeys(transform(keys.toString()))
        } else {
            log.warn('Send key was called with null value. Nothing sended!')
        }
        this.delay(delay)
        return this
    }

    @CompileDynamic
    def attr(String name) {
        return webElement.respondsTo('getAttribute') ? webElement.getAttribute(name) : null
    }


    @CompileDynamic
    def attr(String name, String value) {
        this.passOrRaiseNullElement()
        driver.executeScript(
            "arguments[0].setAttribute(arguments[1], arguments[2]);",
            webElement, name, value
        )
        return this
    }

    WebDriver getDriver() {
        return ((RemoteWebElement) webElement).wrappedDriver
    }

    @CompileDynamic
    boolean isEmpty() {
        return this.webElement?.text?.isEmpty() ?: true
    }

    boolean hasContent() {
        return !isEmpty()
    }

    @CompileDynamic
    def find(Map<String, ?> params, boolean multi = false) {
        def entry = params.find()
        def key = entry.key
        def value = entry.value
        switch (key) {
            case 'tag':
                key = 'tagName'
                break
            case 'css':
                key = 'cssSelector'
                break
        }
        key = key.capitalize()
        if (multi) {
            return this.webElement."findElementsBy${key}"(value).collect {
                new WebElementWrapper(null, it)
            }
        }
        return new WebElementWrapper(null, this.webElement."findElementBy${key}"(value))
    }

    @CompileDynamic
    def findAll(Map<String, ?> params) {
        return find(params, true)
    }

    @CompileDynamic
    def methodMissing(String name, args) {
        this.passOrRaiseNullElement("Invoking method $name on element $element")
        def result
        try {
            //noinspection GroovyAssignabilityCheck
            result = this.webElement."$name"(*args)
        } catch (Exception ex) {
            if (this.webElement.hasProperty('element')) {
                //noinspection GroovyAssignabilityCheck
                result = this.webElement.element?."$name"(*args)
            } else {
                if (args) {
                    result = attr(name, String.valueOf(args))
                } else {
                    result = attr(name)
                }
            }
        }
        if (result == null) {
            return this
        }
        return result
    }

    private void passOrRaiseNullElement(message = null) {
        if (!webElement) {
            throw new JMacroException('Element is null' + (message ? ": $message" : ''))
        }
    }

}
