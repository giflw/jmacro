package com.itquasar.multiverse.jmacro.commands.browser.command.browser

import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import org.openqa.selenium.devtools.DevTools
import org.openqa.selenium.devtools.HasDevTools
import org.openqa.selenium.devtools.v97.network.Network
import org.openqa.selenium.devtools.v97.network.model.RequestWillBeSent
import org.openqa.selenium.devtools.v97.network.model.ResponseReceived

class BrowserDevTools implements Constants, AutoCloseable {

    private final BrowserCommand browser
    private DevTools devTools

    BrowserDevTools(BrowserCommand browser) {
        if (HasDevTools.class.isInstance(browser.driver)) {
            this.browser = browser
            this.devTools = browser.driver.getDevTools()
            this.devTools.createSession()
        }
    }

    DevTools getDevTools() {
        return devTools
    }

    def enable(String feature) {
        switch (feature) {
            case NETWORK -> devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()))
            default -> throw new JMacroException("Feature $feature not supported")
        }
    }

    def disable(String feature) {
        switch (feature) {
            case NETWORK -> devTools.send(Network.disable())
            default -> throw new JMacroException("Feature $feature not supported")
        }
    }


    void close() {
        this.devTools.clearListeners()
        this.devTools.disconnectSession()
    }

    def listen(Closure closure) {
        return listen(ALL, closure)
    }

    def listen(String direction = ALL, Closure closure = null) {
        if ([ALL, SENT].contains(direction)) {
            def callback = closure
            if (callback) {
                callback = { RequestWillBeSent requestWillBeSent ->
                    closure.call(requestWillBeSent.request, postData(requestWillBeSent), requestWillBeSent)
                }
            } else {
                callback = { RequestWillBeSent requestWillBeSent ->
                    def request = requestWillBeSent.getRequest()
                    def postData = postData(requestWillBeSent)?: ''
                    echo """
                    ------------------------------------------------------
                    Request URL        => ${request.getUrl()}
                    Request Method     => ${request.getMethod()}
                    Request Headers    => ${request.getHeaders()}
                    Request PostData   => ${postData.stripLeading().take(100).replaceAll("[\r\n]+", '').take(50)}
                    ------------------------------------------------------""".stripIndent()
                }
            }

            this.devTools.addListener(Network.requestWillBeSent(), callback)
        }

        if ([ALL, RECEIVED].contains(direction)) {
            def callback = closure
            if (callback) {
                callback = { ResponseReceived responseReceived ->
                    closure.call(responseReceived.response, body(responseReceived), responseReceived)
                }
            } else {
                callback = { ResponseReceived responseReceived ->
                    def response = responseReceived.getResponse()
                    def body = body(responseReceived)?.body ?: ''
                    echo """
                    ------------------------------------------------------
                    Response Url       => ${response.getUrl()}
                    Response Status    => ${response.getStatus()}
                    Response Headers   => ${response.getHeaders()}
                    Response MIME Type => ${response.getMimeType()}
                    Response Body      => ${body.stripLeading().take(100).replaceAll("[\r\n]+", '').take(50)}
                    ------------------------------------------------------""".stripIndent()
                }
            }
            this.devTools.addListener(Network.responseReceived(), callback)
        }
    }

    String postData(RequestWillBeSent requestWillBeSent) {
        try {
            return this.devTools.send(Network.getRequestPostData(requestWillBeSent.requestId))
        } catch (Exception e) {
            browser.getLogger().debug("No post data sent/found with request ${requestWillBeSent.requestId}")
            return null
        }
    }

    Network.GetResponseBodyResponse body(ResponseReceived responseReceieved) {
        try {
            return this.devTools.send(Network.getResponseBody(responseReceieved.requestId))
        } catch (Exception e) {
            browser.getLogger().debug("No body received/found in request ${responseReceieved.requestId}")
            return null
        }
    }


    def methodMissing(String name, def args) {
        return Command.methodMissingOnOrChainToContext(browser, browser, name, args)
    }
}
