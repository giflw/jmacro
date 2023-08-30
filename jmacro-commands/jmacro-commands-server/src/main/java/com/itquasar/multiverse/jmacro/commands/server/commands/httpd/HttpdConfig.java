package com.itquasar.multiverse.jmacro.commands.server.commands.httpd;

import io.javalin.util.ConcurrencyUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.Map;

@Data
public class HttpdConfig {

    public static final String PORT = "port";
    public static final int DEFAULT_PORT = 6789;
    public static final String HOST = "host";
    public static final String DEFAULT_HOST = "127.0.0.1";
    public static final String CONTEXT = "context";
    public static final String DEFAULT_CONTEXT = "/";
    public static final String DEFAULT_CONTENT_TYPE = "defaultContentType";
    public static final String DEFAULT_DEFAULT_CONTENT_TYPE = "text/plain";

    public static final Map<String, Object> DEFAULTS = Map.of(
        PORT, DEFAULT_PORT,
        HOST, DEFAULT_HOST,
        CONTEXT, DEFAULT_CONTEXT,
        DEFAULT_CONTENT_TYPE, DEFAULT_DEFAULT_CONTENT_TYPE
    );

    private int port;
    private String host;
    private String context;
    private String defaultContentType;
    private String address;
    private String url;
    private URI uri;
    private boolean virtualThreads = true;

    public HttpdConfig() {
        this(DEFAULT_PORT);
    }

    public HttpdConfig(int port) {
        this(DEFAULT_HOST, port);
    }

    public HttpdConfig(String host, int port) {
        this(host, port, DEFAULT_DEFAULT_CONTENT_TYPE);
    }

    public HttpdConfig(String host, int port, String defaultContentType) {
        this(host, port, DEFAULT_CONTEXT, defaultContentType);
    }

    public HttpdConfig(String host, int port, String context, String defaultContentType) {
        this.host = host;
        this.port = port;
        context = context.endsWith("/") ? context : context + '/';
        this.context = context.startsWith("/") ? context : "/" + context;
        this.defaultContentType = defaultContentType;
        this.address = host + ':' + port;
        this.url = "http://" + this.address + context;
        this.uri = URI.create(this.url);
        this.setVirtualThreads(this.virtualThreads);
    }

    public void setVirtualThreads(boolean virtualThreads) {
        this.virtualThreads = this.virtualThreads && Boolean.parseBoolean(System.getProperty("httpd.virtualThreads", "true"));
        ConcurrencyUtil.INSTANCE.setUseLoom(this.virtualThreads);
    }

    public static HttpdConfig of(Map<String, Object> options) {
        DEFAULTS.forEach(options::putIfAbsent);
        return new HttpdConfig((String) options.get(HOST), (int) options.get(PORT), (String) options.get(CONTEXT), (String) options.get(DEFAULT_CONTENT_TYPE));
    }
}
