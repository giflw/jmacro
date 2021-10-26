package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.request.Body
import com.itquasar.multiverse.jmacro.commands.io.commands.request.Headers
import com.itquasar.multiverse.jmacro.commands.io.commands.request.Response
import com.itquasar.multiverse.jmacro.commands.io.commands.request.ResponseAndContentHttpresponseHandler
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.transform.ToString
import groovy.util.logging.Log4j2
import org.apache.hc.client5.http.HttpResponseException
import org.apache.hc.client5.http.auth.CredentialsProvider
import org.apache.hc.client5.http.fluent.Content
import org.apache.hc.client5.http.fluent.Request as HTTPFluentRequest
import org.apache.hc.client5.http.fluent.Response as HTTPFluentResponse
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient
import org.apache.hc.client5.http.impl.classic.HttpClients
import org.apache.hc.core5.http.HttpEntity
import org.apache.hc.core5.http.HttpResponse
import org.apache.hc.core5.http.NoHttpResponseException

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
 *}* </pre>
 */
@Log4j2
@CompileStatic
@ToString(includePackage = false, includeNames = true, includeFields = true, includes = ['method', 'url'])
class Request implements GroovyCommand {

    static private Map<String, Object> defaultHeaders = [
        'JMacro-Version': '0.1.0-SNAPSHOT-000e0c8-dirty' //Engine.version()
    ] as Map<String, Object>

    Map<String, Object> getDefaultHeaders() {
        return new LinkedHashMap<String, Object>(defaultHeaders)
    }

    void setDefaultHeaders(Map<String, Object> defaultHeaders) {
        this.defaultHeaders = defaultHeaders
    }

    String method
    String url
    HTTPFluentRequest httpRequest
    Map<String, Object> headers = defaultHeaders
    private HttpEntity entity
    private boolean executed = false

    Request() {
    }

    /**
     *  Create new Request on each call
     * @param closure
     * @return
     */
    def call(Closure closure) {
        Request request = new Request()
        closure = closure.rehydrate(request, request, request)
        closure()
        if (!request.executed) {
            request.execute()
        }
        return request
    }

    private Request delegate(Closure closure, Object delegate) {
        closure = closure.rehydrate(delegate, this, this)
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        return this
    }

    Request headers(Closure closure) {
        this.headers = getDefaultHeaders()
        closure.delegate = new Headers(this)
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        return this
    }

    Request body(Closure closure) {
        Body body = new Body()
        closure.delegate = body
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this.entity = body.entity
        return this
    }

    Response execute() {
        if (this.executed) {
            throw new JMacroException("Request already executed!")
        }
        this.executed = true
        if (!this.httpRequest) {
            throw new JMacroException(this, 'No method/url provided!')
        }
        try {
            this.fillRequest()
            return this.process()
        } catch (HttpResponseException ex) {
            log.error("Error ${ex.statusCode}: ${ex.reasonPhrase}", ex)
        } catch (NoHttpResponseException ex) {
            log.error("Error: no response received", ex)
        } catch (Exception ex) {
            throw new JMacroException(this, "Error requesting $method $url: ${ex?.message}", ex)
        }
    }

    @CompileDynamic
    protected Response process() {
        HttpResponse httpResponse
        Content content
        log.info("Connecting to $method $url")
        if (log.isDebugEnabled()) {
            headers.each {
                log.debug("[HTTP Header] ${it.key}: ${it.value}")
            }
        }

        log.debug('Creating new response object')
        CloseableHttpClient client = HttpClients.custom()
            .setDefaultCredentialsProvider(this.context.getVariable('credentials') as CredentialsProvider)
            .build()
        HTTPFluentResponse fluentResponse = httpRequest.execute(client)
        (httpResponse, content) = fluentResponse.handleResponse(new ResponseAndContentHttpresponseHandler()) as Tuple
        Response response = new Response(
            "$method $url",
            httpResponse,
            content
        )
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
        this.context.setProperty('response', response)
        log.debug('Response property updated')
        return response
    }

    /**
     * Redirect missing method call to body
     * @param name
     * @param args
     * @return
     */
    @CompileDynamic
    def methodMissing(String name, args) {
        if (HttpMethod.valuesMap().containsKey(name)) {
            this.method = name
            this.url = args[0].toString()
            this.httpRequest = HTTPFluentRequest.create(method, url)
            return this
        }
        throw new JMacroException(this, "HTTP Methods should be uppercase: GET, POST, etc")
    }

    private void fillRequest() {
        if (httpRequest) {
            if (entity) {
                httpRequest.body(entity)
            }
            headers.each { key, value ->
                httpRequest.addHeader(key, value?.toString())
            }
        }
    }

}
