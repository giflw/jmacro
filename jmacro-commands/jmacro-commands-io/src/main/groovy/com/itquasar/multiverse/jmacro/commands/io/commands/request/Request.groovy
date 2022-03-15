package com.itquasar.multiverse.jmacro.commands.io.commands.request

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
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

import javax.script.Bindings
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

    private Bindings bindings

    private String method
    private String url
    private Map<String, String> headers = new LinkedHashMap<>()
    private Body body = new Body()
    private HTTPFluentRequest httpRequest
    private HttpEntity entity
    private Response response
    private boolean prepared = false
    boolean skipExecution = false
    private boolean executed = false

    Request(Bindings bindings) {
        Objects.requireNonNull(bindings, "Bindings must be not null")
        this.bindings = bindings
    }

    Request call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        if (this.skipExecution) {
            logger.warn("Skipping execution: skipExecution = ${skipExecution}")
        } else {
            if (!this.executed) {
                this.execute()
            }
        }
        return this
    }

    Response getResponse() {
        if(!this.executed) {
            raise 'Request not executed yet'
        }
        return response
    }
/**
     *
     * @param name HTTP header name
     * @return HTTP header value
     */
    def propertyMissing(String name) {
        def header = name.replace('_', '-')
        if (this.headers.containsKey(header)) {
            def value = this.headers[header]
            return value
        }
        return Command.propertyMissingOn(bindings, name)
    }

    /**
     *
     * @param name HTTP header name
     * @param arg HTTP header value
     * @return HTTP header value
     */
    def propertyMissing(String name, def arg) {
        String header = name.replace('_', '-')
        this.headers[header] = arg
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
            return Command.methodMissingOnOrChainToContext(bindings, body, name, args)
        }
        throw new JMacroException(this, "HTTP Methods should be uppercase: GET, POST, etc. $name given.")
    }

    // FIXME need unit test
    String urlEncode(String str, boolean percent20 = false) {
        String encoded = URLEncoder.encode(str, StandardCharsets.UTF_8)
        return percent20 ? encoded.replace('+', '%20') : encoded
    }

    // FIXME need unit test
    String urlDecode(String str, boolean percent20 = false) {
        String decoded = percent20 ? str.replace('%20', '+') : str
        return URLDecoder.decode(decoded, StandardCharsets.UTF_8)
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

        def credentials = this.bindings.get('credentials') as CredentialsProvider
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
