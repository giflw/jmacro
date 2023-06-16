package com.itquasar.multiverse.jmacro.commands.server.commands.httpd

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import io.javalin.Javalin

class Httpd implements AutoCloseable {

    private final List<String> serverMethods = [
        'before', 'after',
        'get', 'post', 'put', 'patch', 'delete',
        'head', 'options', 'trace', 'connect',
        'ws', 'wsBefore', 'wsAfter', 'wsException'
    ]
    private final HttpdConfig config
    private final Javalin server

    Httpd(HttpdConfig config) {
        this.config = config
        this.server = Javalin.create(javalingConfig -> {
            javalingConfig.showJavalinBanner = false
            javalingConfig.contextPath = config.getContext()
            javalingConfig.defaultContentType = config.getDefaultContentType()
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
