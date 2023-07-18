package com.itquasar.multiverse.jmacro.commands.server.commands.httpd

import com.itquasar.multiverse.jmacro.core.configuration.Credentials
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import io.javalin.Javalin
import io.javalin.http.Context
import org.apache.logging.log4j.Logger

import java.util.function.BiConsumer
import java.util.function.Consumer

class Httpd implements AutoCloseable {

    public static final String DEFAULT_REALM = 'JMacro'
    private final List<String> serverMethods = [
        'before', 'after',
        'get', 'post', 'put', 'patch', 'delete',
        'head', 'options', 'trace', 'connect',
        'ws', 'wsBefore', 'wsAfter', 'wsException'
    ]
    private final Logger scriptLogger
    private final HttpdConfig config
    private final Javalin server

    Httpd(HttpdConfig config, Logger scriptLogger) {
        this.config = config
        this.scriptLogger = scriptLogger
        this.server = Javalin.create(javalinConfig -> {
            javalinConfig.showJavalinBanner = false
            javalinConfig.contextPath = config.getContext()
            javalinConfig.defaultContentType = config.getDefaultContentType()
        })
    }

    Httpd start() {
        this.server.start(this.config.getHost(), this.config.getPort())
        return this
    }

    void stop() {
        this.server.stop()
    }

    @Override
    void close() {
        this.stop()
    }

    Httpd exit(String route = '/exit', String message = 'Bye') {
        exit(route, { ctx -> ctx.json([message: message]) })
    }

    Httpd exit(String route = '/exit', Consumer<Context> consumer) {
        scriptLogger.info("Registering httpd exit route at '${route}'")
        Thread mainThread = Thread.currentThread()
        this.server.get(route) { ctx ->
            consumer.accept(ctx)
            try {
                Thread.sleep(1000)
            } finally {
                mainThread.interrupt()
            }
        }
        this.server.events(event -> {
            event.serverStarted {
                try {
                    mainThread.join()
                } catch (InterruptedException ex) {
                    scriptLogger.warn("Exiting httpd server (${ex.getCause()})")
                }
            }
        })
        return this
    }

    void basic(String realm = DEFAULT_REALM, BiConsumer<Context, Credentials> consumer) {
        scriptLogger.info("Registering httpd basic authentication 'before' callback")
        String headerAuthName = 'Authorization'
        String headerWWWName = 'WWW-Authenticate'
        String headerWWWValue = "Basic realm=\"${realm}\""
        scriptLogger.debug("${headerWWWName}: ${headerWWWValue}")
        this.server.before { Context context ->
            String authorization = context.header(headerAuthName)
            scriptLogger.debug("Authorization: ${authorization}")
            if (authorization && authorization.startsWith('Basic')) {
                authorization = authorization.substring(5).trim()
                List<String> pair = new String(Base64.decoder.decode(authorization)).split(':') as List<String>
                if (pair.size() == 2) {
                    consumer.accept(context, Credentials.of(pair.first(), pair.last()))
                    return
                }
            }
            context.status(401)
            context.header(headerWWWName, headerWWWValue)
        }
    }

    @CompileDynamic
    def methodMissing(String name, def args) {
        if (name in serverMethods) {
            this.server."${name}"(*args)
        } else {
            throw new JMacroException("Unknown HTTPD method ${name} (using ${server.class.name} as server implementation)")
        }
    }

    @CompileDynamic
    def propertyMissing(String name) {
        if (this.config.hasProperty(name)) {
            return this.config."${name}"
        }
        throw new JMacroException("Property ${name} not found either in Httpd nor HttpdConfig")
    }

}
