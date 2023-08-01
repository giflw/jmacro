package com.itquasar.multiverse.jmacro.commands.browser.command.browser


import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import com.itquasar.multiverse.jmacro.core.interfaces.TriConsumer
import groovy.transform.CompileDynamic
import org.openqa.selenium.devtools.DevTools
import org.openqa.selenium.devtools.HasDevTools
import org.openqa.selenium.devtools.v85.network.Network
import org.openqa.selenium.devtools.v85.network.model.Request
import org.openqa.selenium.devtools.v85.network.model.RequestWillBeSent
import org.openqa.selenium.devtools.v85.network.model.Response
import org.openqa.selenium.devtools.v85.network.model.ResponseReceived

import javax.script.Bindings

class BrowserDevTools implements Constants, AutoCloseable {

    private final Bindings bindings
    private final Browser browser
    private DevTools devTools

    BrowserDevTools(Bindings bindings, Browser browser) {
        this.bindings = bindings
        if (HasDevTools.class.isInstance(browser.driver)) {
            this.browser = browser
            this.devTools = ((HasDevTools) browser.driver).getDevTools()
            this.devTools.createSession()
        } else {
            throw new JMacroException("Dev tools not supported by this web driver (${browser.driver})")
        }
    }

    DevTools getDevTools() {
        return devTools
    }

    @CompileDynamic
    void enable(String... features) {
        for (String feature : features) {
            switch (feature) {
                case NETWORK -> devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()))
                default -> throw new JMacroException("Feature $feature not supported")
            }
        }
    }

    @CompileDynamic
    void disable(String... features) {
        for (String feature : features) {
            switch (feature) {
                case NETWORK -> devTools.send(Network.disable())
                default -> throw new JMacroException("Feature $feature not supported")
            }
        }
    }

    void close() {
        if (this.devTools) {
            try {
                this.devTools.clearListeners()
            } catch (Exception ex) {
                CommandUtils.log(bindings, ERROR, ex.getMessage())
            }
            this.devTools.disconnectSession()
        }
    }

    def listen(String direction = ALL) {
        return listen(direction, null, null)
    }

    def sent(TriConsumer<Request, String, RequestWillBeSent> requestConsumer) {
        return listen(SENT, requestConsumer, null)
    }

    def received(TriConsumer<Response, Network.GetResponseBodyResponse, ResponseReceived> responseConsumer) {
        return listen(RECEIVED, null, responseConsumer)
    }

    def listen(String direction = ALL, TriConsumer<Request, String, RequestWillBeSent> requestConsumer, TriConsumer<Response, Network.GetResponseBodyResponse, ResponseReceived> responseConsumer) {
        if ([ALL, SENT].contains(direction)) {
            def callback
            if (requestConsumer) {
                callback = { RequestWillBeSent requestWillBeSent ->
                    requestConsumer.accept(requestWillBeSent.request, postData(requestWillBeSent), requestWillBeSent)
                }
            } else {
                callback = { RequestWillBeSent requestWillBeSent ->
                    def request = requestWillBeSent.getRequest()
                    def postData = postData(requestWillBeSent) ?: ''
                    CommandUtils.log(
                        bindings,
                        """
                        ------------------------------------------------------
                        Request URL        => ${request.getUrl()}
                        Request Method     => ${request.getMethod()}
                        Request Headers    => ${request.getHeaders()}
                        Request PostData   => ${postData.stripLeading().take(100).replaceAll("[\r\n]+", '').take(50)}
                        ------------------------------------------------------""".stripIndent()
                    )
                }
            }

            this.devTools.addListener(Network.requestWillBeSent(), callback)
        }

        if ([ALL, RECEIVED].contains(direction)) {
            def callback
            if (callback) {
                callback = { ResponseReceived responseReceived ->
                    responseConsumer.accept(responseReceived.response, body(responseReceived), responseReceived)
                }
            } else {
                callback = { ResponseReceived responseReceived ->
                    def response = responseReceived.getResponse()
                    def body = body(responseReceived)?.body ?: ''
                    CommandUtils.log(
                        bindings,
                        """
                        ------------------------------------------------------
                        Response Url       => ${response.getUrl()}
                        Response Status    => ${response.getStatus()}
                        Response Headers   => ${response.getHeaders()}
                        Response MIME Type => ${response.getMimeType()}
                        Response Body      => ${body.stripLeading().take(100).replaceAll("[\r\n]+", '').take(50)}
                        ------------------------------------------------------""".stripIndent()
                    )
                }
            }
            this.devTools.addListener(Network.responseReceived(), callback)
        }
    }

    String postData(RequestWillBeSent requestWillBeSent) {
        try {
            return this.devTools.send(Network.getRequestPostData(requestWillBeSent.requestId))
        } catch (Exception ex) {
            browser.getScriptLogger().debug("No post data sent/found with request ${requestWillBeSent.requestId}", ex)
            return null
        }
    }

    Network.GetResponseBodyResponse body(ResponseReceived responseReceieved) {
        try {
            return this.devTools.send(Network.getResponseBody(responseReceieved.requestId))
        } catch (Exception ex) {
            browser.getScriptLogger().debug("No body received/found in request ${responseReceieved.requestId}", ex)
            return null
        }
    }

    def methodMissing(String name, def args) {
        return CommandUtils.methodMissingOn(devTools, name, args, browser.bindings)
    }
}
