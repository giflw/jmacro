package com.itquasar.multiverse.jmacro.commands.io.commands.request

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
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
class Request implements Constants {

    private Bindings bindings

    private String method
    private String url
    private Map<String, String> headers = new LinkedHashMap<>()
    private Body _body = null
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
            Command.log(bindings, WARNING, "Skipping execution: skipExecution = ${skipExecution}")
        } else {
            if (!this.executed) {
                this.execute()
            }
        }
        return this
    }

    Body getBody() {
        if (_body == null) {
            this._body = new Body(bindings)
        }
        return _body
    }

    Response getResponse() {
        if (!this.executed) {
            Command.raise(bindings, 'Request not executed yet')
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
        this.headers[header] = arg?.toString()
    }

    /**
     * Redirect missing method call to body or HTTP method
     * @param name HTTP method or body method
     * @param args Method arg
     * @return According method called
     */
    def methodMissing(String name, def args) {
        if (HttpMethod.valuesMap().containsKey(name)) {
            this.method = name
            this.url = ((String[]) args)[0].toString()
            this.httpRequest = HTTPFluentRequest.create(method, url)
            return this
        } else {
            return Command.methodMissingOnOrChainToContext(bindings, body, name, args)
        }
    }

    // FIXME need unit test
    static String urlEncode(String str, boolean percent20 = false) {
        String encoded = URLEncoder.encode(str, StandardCharsets.UTF_8)
        return percent20 ? encoded.replace('+', '%20') : encoded
    }

    // FIXME need unit test
    static String urlDecode(String str, boolean percent20 = false) {
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
            Command.log(bindings, ERROR, "Error ${ex.statusCode}: ${ex.reasonPhrase}", ex)
        } catch (NoHttpResponseException ex) {
            Command.log(bindings, ERROR, "Error: no response received", ex)
        } catch (Exception ex) {
            throw new JMacroException(this, "Error requesting $method $url: ${ex?.message}", ex)
        }
        return this
    }

    protected Request process() {
        Command.log(bindings, INFO, "Connecting to $method $url")
        headers.each {
            Command.log(bindings, DEBUG, "[HTTP Header] ${it.key}: ${it.value}")
        }

        Command.log(bindings, DEBUG, 'Creating new response object')

        def credentials = this.bindings.get('credentials') as CredentialsProvider
        Command.log(bindings, WARNING, "HTTP Credentials: $credentials")
        CloseableHttpClient client = HttpClients.custom()
            .setDefaultCredentialsProvider(credentials)
            .build()
        HTTPFluentResponse fluentResponse = httpRequest.execute(client)
        Tuple tuple = fluentResponse.handleResponse(new ResponseAndContentHttpresponseHandler()) as Tuple

        HttpResponse httpResponse = (HttpResponse) tuple.get(0)
        Content content = (Content) tuple.get(1)

        Response response = new Response("$method $url",
            httpResponse,
            content)
        if (httpResponse.code >= 400) {
            Command.log(bindings, ERROR, "Request returned ${httpResponse.code}: ${Response.HTTP_STATUS[httpResponse.code]}")
            def message = response?.data
            if (message) {
                message = message.respondsTo('text') ? message.invokeMethod('text', null) : message
                message = message.hasProperty('message') ? message['message'] : message
            }
            Command.log(bindings, ERROR, "Server message $message")
        } else {
            Command.log(bindings, INFO, "Request returned ${httpResponse.code}: ${Response.HTTP_STATUS[httpResponse.code]}")
        }
        Command.log(bindings, DEBUG, 'New response object created')
        this.response = response
        return this
    }

}
