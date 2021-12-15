package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileStatic
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import java.time.Duration

@CompileStatic
class BrowserWait {

    static Map<String, Closure<? extends ExpectedCondition<? extends Object>>> EXPECTED_CONDITIONS = [
        present      : { By by -> ExpectedConditions.presenceOfElementLocated(by) },
        visible      : { By by -> ExpectedConditions.visibilityOfElementLocated(by) },
        invisible    : { By by -> ExpectedConditions.invisibilityOfElementLocated(by) },
        clickable    : { By by -> ExpectedConditions.elementToBeClickable(by) },
        textPresent  : { By by -> ExpectedConditions.not(ExpectedConditions.textToBe(by, '')) },
        noTextPresent: { By by -> ExpectedConditions.textToBe(by, '') }
    ]

    private static final long DEFAULT_TIMEOUT = 30
    private BrowserCommand browser
    private WebDriverWait driverWait
    private String cssSelector
    private WebElementWrapper element

    BrowserWait(BrowserCommand browser) {
        this.browser = browser
        driverWait = new WebDriverWait(browser.driver, Duration.ofSeconds(DEFAULT_TIMEOUT.longValue()))
    }

    BrowserWait(BrowserCommand browser, WebDriverWait driverWait, String cssSelector) {
        this.browser = browser
        this.driverWait = driverWait
        this.cssSelector = cssSelector
    }

    BrowserWait(BrowserCommand browser, WebDriverWait driverWait, WebElementWrapper element) {
        this.browser = browser
        this.driverWait = driverWait
        this.element = element
    }

    private WebDriverWait waitWithtimeout(BigDecimal timeout) {
        long millis = ((timeout?.longValue() ?: DEFAULT_TIMEOUT) * 1000).longValue()
        return driverWait.withTimeout(Duration.ofMillis(millis)) as WebDriverWait
    }

    BrowserWait call(BrowserCommand browser, String cssSelector, BigDecimal timeout = DEFAULT_TIMEOUT) {
        return new BrowserWait(browser, waitWithtimeout(timeout), cssSelector)
    }

    BrowserWait call(BrowserCommand browser, WebElementWrapper element, BigDecimal timeout = DEFAULT_TIMEOUT) {
        return new BrowserWait(browser, waitWithtimeout(timeout), element)
    }

    // FIXME allow ExpectedCondition instance
    WebElementWrapper has(String expectedCondition) {
        return applyCondition(expectedCondition, false)
    }

    WebElementWrapper have(String expectedCondition) {
        return applyCondition(expectedCondition, false)
    }

    WebElementWrapper be(String expectedCondition) {
        return applyCondition(expectedCondition, false)
    }

    WebElementWrapper not(String expectedCondition) {
        return applyCondition(expectedCondition, true)
    }

    private WebElementWrapper applyCondition(String expectedCondition, boolean not) {
        ExpectedCondition condition
        By by = cssSelector ? By.cssSelector(cssSelector) : null
        element = new WebElementWrapper(by, element?.webElement ?: browser.driver.findElements(by).find())

        if (!(expectedCondition instanceof String)) {
            expectedCondition = expectedCondition[0]
        }

        condition = EXPECTED_CONDITIONS[expectedCondition]?.call(element?.by)
        if (!condition) {
            throw new JMacroException("Wait until expected condition '$expectedCondition' is unknown!")
        }
        driverWait.until(not ? ExpectedConditions.not(condition) : condition)
        return element
    }

}
