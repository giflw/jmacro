package com.itquasar.multiverse.jmacro.commands.io

import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.util.logging.Log4j2

import java.nio.charset.Charset

@Log4j2
trait OutputSerializers {

    String name
    String type
    String charset = Charset.defaultCharset().name()
    def raw
    String outputContent

    String text(raw) {
        type = 'plain/text'
        this.raw = raw
        this.outputContent = raw?.toString()
        return outputContent
    }

    String json(raw) {
        log.debug("Using ${JsonBuilder.class} to serialize output")
        type = 'application/json'
        this.raw = raw
        this.outputContent = JsonOutput.toJson(raw)
        return outputContent
    }

    String csv(Iterable<Map<String, ?>> raw, separator = ';', enclosing = "\"") {
        log.debug("Using ${this.class} to serialize output")
        type = 'text/csv'
        this.raw = raw
        String csv = raw.first().collect { "${enclosing}${it.key.replace(enclosing, enclosing + enclosing)}${enclosing}" }.join(separator) + "\n"
        csv += raw.collect { line ->
            line.collect { "${enclosing}${it.value}${enclosing}" }.join(separator)
        }.join("\n")
        this.outputContent = csv
        return outputContent
    }

}
