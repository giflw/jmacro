package com.itquasar.multiverse.jmacro.commands.server.commands.httpd

import com.itquasar.multiverse.jmacro.core.configuration.Credentials
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.util.LockUtils
import groovy.transform.CompileDynamic
import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.http.HttpStatus
import org.apache.logging.log4j.Logger

import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.ReentrantLock
import java.util.function.BiConsumer
import java.util.function.Consumer

class Httpd implements AutoCloseable {

    private final ReentrantLock lock = new ReentrantLock()
    private final Condition keepAlive = lock.newCondition();

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
            javalinConfig.routing.contextPath = config.getContext()
            javalinConfig.routing.ignoreTrailingSlashes = true
            javalinConfig.routing.treatMultipleSlashesAsSingleSlash = true
            javalinConfig.compression.brotliAndGzip()
            javalinConfig.http.defaultContentType = config.getDefaultContentType()
            javalinConfig.http.prefer405over404 = true
            // FIXME
            javalinConfig.plugins.enableCors { cors ->
                cors.add { conf ->
                    conf.reflectClientOrigin = true
                    conf.allowCredentials = true
                }
            }
            // FIXME
            javalinConfig.plugins.enableRouteOverview('/routes')
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

    /**
     * <pre>
     *      httpd { server ->
     *          server.exit().keepAlive()
     *      }
     * </pre>
     *
     * or
     *
     * <pre>
     *      httpd { server ->
     *           server.exit { ctx ->
     *           ctx.json([hi: 'ho'])
     *           pause.signal()
     *           }
     *      }
     *      pause.await()
     * </pre>
     * @param route
     * @param consumer
     * @return
     */
    Httpd exit(String route = '/exit', Consumer<Context> consumer) {
        scriptLogger.info("Registering httpd exit route at '${route}'")
        this.server.get(route) { ctx ->
            consumer.accept(ctx)
            try {
                Thread.sleep(1000)
            } finally {
                LockUtils.runLocked(lock, keepAlive::signalAll);
            }
        }
        return this
    }

    void keepAlive() {
        this.server.events(event -> {
            event.serverStarted {
                LockUtils.runLocked(lock, keepAlive::await, ex -> scriptLogger.warn("Exiting httpd server (${ex.getCause()})"))
            }
        })
    }

    void basic(String route = '/*', BiConsumer<Context, Credentials> consumer) {
        basic(DEFAULT_REALM, route, consumer)
    }

    void basic(String realm, String route, BiConsumer<Context, Credentials> consumer) {
        scriptLogger.info("Registering httpd basic authentication 'before' callback")
        String headerAuthName = 'Authorization'
        String headerWWWName = 'WWW-Authenticate'
        String headerWWWValue = "Basic realm=\"${realm}\""
        scriptLogger.debug("${headerWWWName}: ${headerWWWValue}")
        this.server.before(route) { Context context ->
            String authorization = context.header(headerAuthName)
            scriptLogger.trace("Authorization: ${authorization}")
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
        def status = HttpStatus.values().find {it.name() == name }
        if (status != null) {
            return status
        }
        if (this.config.hasProperty(name)) {
            return this.config."${name}"
        }
        throw new JMacroException("Property ${name} not found either in Httpd nor HttpdConfig")
    }

}
