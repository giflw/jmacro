package com.itquasar.multiverse.jmacro.commands.browser.command.browser

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.RemoteWebElement

import java.util.function.Consumer
import java.util.function.Function

@Log4j2
class WebElementWrapper {

    static WebElementWrapper NONE = new WebElementWrapper(null, null)

    private def webElement
    By by

    def getWebElement() {
        return webElement
    }

    WebElementWrapper(By by, def webElement) {
        this.webElement = webElement
        this.by = by
    }

    def unwrap() {
        return webElement
    }

    boolean exists() {
        return webElement != null && webElement
    }

    // FIXME is this necessary??? usage???
//    WebElementWrapper then(Consumer<WebElementWrapper> consumer) {
//        consumer(this)
//        return this
//    }

    void ifEnabled(Consumer<WebElementWrapper> consumer) {
        if (webElement != null && ((WebElement) webElement).isEnabled()) {
            consumer.accept(this)
        }
    }

    void ifExists(Consumer<WebElementWrapper> consumer) {
        if (exists()) {
            consumer.accept(this)
        }
    }

    void ifNotExists(Consumer<WebElementWrapper> consumer) {
        if (!exists()) {
            consumer.accept(this)
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

    def sendKeys(keys, Function<String, CharSequence> transform = null, jumpKey = null) {
        return sendKeys(keys, null, transform, jumpKey)
    }

    @CompileDynamic
    def sendKeys(keys, BigDecimal delay, Function<String, CharSequence> transform, jumpKey = null) {
        if (keys != null) {
            transform = transform ?: Closure.IDENTITY as Function<String, CharSequence>
            this.webElement.sendKeys(transform(keys.toString()))
        } else {
            log.warn('Send key was called with null value. Nothing sent!')
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
        String key = entry.key
        def value = entry.value
        switch (key) {
            case 'tag':
                key = 'tagName'
                break
            case 'css':
                key = 'cssSelector'
                break
        }
        if (multi) {
            return this.webElement.findElements(By.invokeMethod(key, value)).collect {
                new WebElementWrapper(null, it)
            }
        }
        return new WebElementWrapper(null, this.webElement.findElement(By.invokeMethod(key, value)))
    }

    def findAll(Map<String, ?> params) {
        return find(params, true)
    }

    @CompileDynamic
    def methodMissing(String name, args) {
        this.passOrRaiseNullElement("Invoking method $name on element $webElement")
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
