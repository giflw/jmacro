package com.itquasar.multiverse.jmacro.commands.io.commands.request

import com.itquasar.multiverse.jmacro.commands.io.commands.request.Body
import com.itquasar.multiverse.jmacro.commands.io.commands.request.Response
import com.itquasar.multiverse.jmacro.commands.io.commands.request.ResponseAndContentHttpresponseHandler
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import org.apache.hc.client5.http.HttpResponseException
import org.apache.hc.client5.http.auth.AuthScope
import org.apache.hc.client5.http.auth.CredentialsProvider
import org.apache.hc.client5.http.fluent.Content
import org.apache.hc.client5.http.fluent.Request as HTTPFluentRequest
import org.apache.hc.client5.http.fluent.Response as HTTPFluentResponse
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient
import org.apache.hc.client5.http.impl.classic.HttpClients
import org.apache.hc.core5.http.HttpEntity
import org.apache.hc.core5.http.HttpResponse
import org.apache.hc.core5.http.NoHttpResponseException

import javax.script.ScriptContext
import java.nio.charset.StandardCharsets

/**
 * Request is used to make HTTP requests.
 * Request block are executed automatically at the end of the block,
 * or can be executed at any time using {@link Request#execute()}.
 *
 * Syntax:
 *
 * <pre>
 *     request {*       // METHOD and url must be before body calls
 *       POST|GET url
 *       // code
 *}* </pre>*/
@Log4j2
class Request {

    private ScriptContext context

    private String method
    private String url
    private Map<String, String> headers = new LinkedHashMap<>()
    private Body body = new Body()
    private HTTPFluentRequest httpRequest
    private HttpEntity entity
    private Response response
    private boolean prepared = false
    private boolean executed = false

    Request(ScriptContext context) {
        this.context = context
    }

    Request call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        if (!this.executed) {
            this.execute()
        }
        return this
    }

    /**
     *
     * @param name HTTP header name
     * @return HTTP header value
     */
    def propertyMissing(String name) {
        return this.headers[name.replace('_', '-')]
    }

    /**
     *
     * @param name HTTP header name
     * @param arg HTTP header value
     * @return HTTP header value
     */
    def propertyMissing(String name, def arg) {
        this.headers[name.replace('_', '-')] = arg
    }

    /**
     * Redirect missing method call to body or HTTP method
     * @param name HTTP method or body method
     * @param args Method arg
     * @return According method called
     */
    @CompileDynamic
    def methodMissing(String name, args) {
        if (HttpMethod.valuesMap().containsKey(name)) {
            this.method = name
            this.url = args[0].toString()
            this.httpRequest = HTTPFluentRequest.create(method, url)
            return this
        } else {
            return body.invokeMethod(name, args)
        }
        throw new JMacroException(this, "HTTP Methods should be uppercase: GET, POST, etc. $name given.")
    }

    String urlEncode(String str) {
        return URLEncoder.encode(str, StandardCharsets.UTF_8)
    }

    String urlDecode(String str) {
        return URLDecoder.decode(str, StandardCharsets.UTF_8)
    }

    /**
     * Prepare this request to be executed filling headers and body.
     * @return This request.
     */
    Request prepare() {
        if (!this.prepared) {
            this.prepared = true

            if (httpRequest) {
                this.entity = body.entity
                if (entity) {
                    httpRequest.body(this.entity)
                }
                headers.each {
                    key, value -> httpRequest.addHeader(key, value?.toString())
                }
            }
        }
        return this
    }

    Request execute() {
        if (this.executed) {
            throw new JMacroException("Request already executed!")
        }
        this.prepare()

        this.executed = true

        if (!this.httpRequest) {
            throw new JMacroException(this, 'No method/url provided!')
        }
        try {
            this.process()
        } catch (HttpResponseException ex) {
            log.error("Error ${ex.statusCode}: ${ex.reasonPhrase}", ex)
        } catch (NoHttpResponseException ex) {
            log.error("Error: no response received", ex)
        } catch (Exception ex) {
            throw new JMacroException(this, "Error requesting $method $url: ${ex?.message}", ex)
        }
        return this
    }

    @CompileDynamic
    protected Request process() {
        HttpResponse httpResponse
        Content content
        log.info("Connecting to $method $url")
        if (log.isDebugEnabled()) {
            headers.each {
                log.debug("[HTTP Header] ${it.key}: ${it.value}")
            }
        }

        log.debug('Creating new response object')

        def credentials = this.context.getBindings(ScriptContext.ENGINE_SCOPE).get('credentials') as CredentialsProvider
        log.warn("HTTP Credentials: $credentials")
        CloseableHttpClient client = HttpClients.custom()
            .setDefaultCredentialsProvider(credentials)
            .build()
        HTTPFluentResponse fluentResponse = httpRequest.execute(client)
        (httpResponse, content) = fluentResponse.handleResponse(new ResponseAndContentHttpresponseHandler()) as Tuple
        Response response = new Response("$method $url",
            httpResponse,
            content)
        if (httpResponse.code >= 400) {
            log.error("Request returned ${httpResponse.code}: ${Response.HTTP_STATUS[httpResponse.code]}")
            def message = response?.data
            if (message) {
                message = message.respondsTo('text') ? message.text() : message
                message = message.hasProperty('message') ? message.message : message
            }
            log.error("Server message $message")
        } else {
            log.info("Request returned ${httpResponse.code}: ${Response.HTTP_STATUS[httpResponse.code]}")
        }
        log.debug('New response object created')
        this.response = response
        return this
    }

}
