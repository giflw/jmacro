package com.itquasar.multiverse.jmacro.commands.io.commands.request


import com.itquasar.multiverse.jmacro.commands.io.commands.Request
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

@Log4j2
@CompileStatic
class Headers {

    Request request

    Headers(Request request) {
        this.request = request
    }

    def methodMissing(String name, Object args) {
        String value = (args as Object[])[0].toString()
        log.trace("Seting header $name: $value")
        this.request.headers.put(name, value)
    }
}
