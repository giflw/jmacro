package com.itquasar.multiverse.jmacro.commands.io.commands.request


import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileStatic
import groovy.transform.ToString
import groovy.util.logging.Log4j2
import org.apache.hc.client5.http.fluent.Content
import org.apache.hc.core5.http.ContentType
import org.apache.hc.core5.http.HttpResponse

import java.nio.charset.StandardCharsets

import static org.apache.hc.core5.http.ContentType.*

@Log4j2
@CompileStatic
@ToString(includePackage = false, includeNames = true, includeFields = true, includes = ['name', 'type'])
class Response implements InputParsers {

    static final Map<Integer, String> HTTP_STATUS = Collections.unmodifiableMap([
        100: 'Continue',
        101: 'Switching Protocols',
        102: 'Processing (WebDAV; RFC 2518)',
        103: 'Checkpoint',
        103: 'Early Hints (RFC 8297)',
        200: 'OK',
        201: 'Created',
        202: 'Accepted',
        203: 'Non-Authoritative Information (since HTTP/1.1)',
        204: 'No Content',
        205: 'Reset Content',
        206: 'Partial Content (RFC 7233)',
        207: 'Multi-Status (WebDAV; RFC 4918)',
        208: 'Already Reported (WebDAV; RFC 5842)',
        218: 'This is fine (Apache Web Server)',
        226: 'IM Used (RFC 3229)',
        300: 'Multiple Choices',
        301: 'Moved Permanently',
        302: 'Found (Previously "Moved temporarily")',
        303: 'See Other (since HTTP/1.1)',
        304: 'Not Modified (RFC 7232)',
        305: 'Use Proxy (since HTTP/1.1)',
        306: 'Switch Proxy',
        307: 'Temporary Redirect (since HTTP/1.1)',
        308: 'Permanent Redirect (RFC 7538)',
        400: 'Bad Request',
        401: 'Unauthorized (RFC 7235)',
        402: 'Payment Required',
        403: 'Forbidden',
        404: 'Not Found',
        405: 'Method Not Allowed',
        406: 'Not Acceptable',
        407: 'Proxy Authentication Required (RFC 7235)',
        408: 'Request Timeout',
        409: 'Conflict',
        410: 'Gone',
        411: 'Length Required',
        412: 'Precondition Failed (RFC 7232)',
        413: 'Payload Too Large (RFC 7231)',
        414: 'URI Too Long (RFC 7231)',
        415: 'Unsupported Media Type (RFC 7231)',
        416: 'Range Not Satisfiable (RFC 7233)',
        417: 'Expectation Failed',
        418: 'I\'m a teapot (RFC 2324, RFC 7168)',
        419: 'Page Expired (Laravel Framework)',
        420: 'Enhance Your Calm (Twitter) / Method Failure (Spring Framework)',
        421: 'Misdirected Request (RFC 7540)',
        422: 'Unprocessable Entity (WebDAV; RFC 4918)',
        423: 'Locked (WebDAV; RFC 4918)',
        424: 'Failed Dependency (WebDAV; RFC 4918)',
        425: 'Too Early (RFC 8470)',
        426: 'Upgrade Required',
        428: 'Precondition Required (RFC 6585)',
        429: 'Too Many Requests (RFC 6585)',
        430: 'Request Header Fields Too Large (Shopify)',
        431: 'Request Header Fields Too Large (RFC 6585)',
        440: 'Login Time-out',
        444: 'No Response',
        449: 'Retry With',
        450: 'Blocked by Windows Parental Controls (Microsoft)',
        451: 'Redirect / Unavailable For Legal Reasons (RFC 7725)',
        460: 'Client closed the connection with the load balancer before the idle timeout period elapsed',
        463: 'The load balancer received an X-Forwarded-For request header with more than 30 IP addresses',
        494: 'Request header too large',
        495: 'SSL Certificate Error',
        496: 'SSL Certificate Required',
        497: 'HTTP Request Sent to HTTPS Port',
        498: 'Invalid Token (Esri)',
        499: 'Client Closed Request / Token Required (Esri)',
        500: 'Internal Server Error',
        501: 'Not Implemented',
        502: 'Bad Gateway',
        503: 'Service Unavailable',
        504: 'Gateway Timeout',
        505: 'HTTP Version Not Supported',
        506: 'Variant Also Negotiates (RFC 2295)',
        507: 'Insufficient Storage (WebDAV; RFC 4918)',
        508: 'Loop Detected (WebDAV; RFC 5842)',
        509: 'Bandwidth Limit Exceeded (Apache Web Server/cPanel)',
        510: 'Not Extended (RFC 2774)',
        511: 'Network Authentication Required (RFC 6585)',
        520: 'Web Server Returned an Unknown Error',
        521: 'Web Server Is Down',
        522: 'Connection Timed Out',
        523: 'Origin Is Unreachable',
        524: 'A Timeout Occurred',
        525: 'SSL Handshake Failed',
        526: 'Invalid SSL Certificate',
        527: 'Railgun Error',
        529: 'Site is overloaded',
        530: 'Site is frozen',
        598: '(Informal convention) Network read timeout error'
    ])

    int statusCode = -1
    ContentType contentType
    private String raw
    InputStream inputStream

    Response(String name, HttpResponse httpResponse, Content content) {
        this.raw = raw
        this.name = name
        this.data = null
        this.statusCode = httpResponse.code
        this.contentType = content.type
        this.type = content.type?.mimeType
        this.charset = content?.type?.charset?.name() ?: StandardCharsets.UTF_8.name()
        this.inputStream = content.asStream()

        switch (this.type) {
            case APPLICATION_OCTET_STREAM.mimeType:
                this.data = this.inputStream
                break
            case APPLICATION_XML.mimeType:
                this.data = this.getXml()
                break
            case APPLICATION_JSON.mimeType:
                this.data = this.getJson()
                break
            case 'text/csv':
                this.data = this.getCsv()
                break
            case TEXT_HTML.mimeType:
                this.data = this.getHtml()
                break
            case TEXT_PLAIN.mimeType:
                this.data = raw
                break
            default:
                this.data = raw
                log.warn("Content-Type $type unknow!")
        }
    }

    String getRaw() {
        if (this.raw == null) {
            this.raw = inputStream?.getText(charset)
        }
        return this.raw
    }

    boolean isSuccess() {
        return this.statusCode >= 200 && this.statusCode < 400
    }

    void raise() {
        throw new JMacroException("Server response returned $statusCode: ${HTTP_STATUS[statusCode]}")
    }

    def dataOrRaise() {
        return success ? data : raise()
    }

}
