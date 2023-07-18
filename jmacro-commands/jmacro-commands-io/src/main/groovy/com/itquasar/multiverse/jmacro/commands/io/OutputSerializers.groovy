package com.itquasar.multiverse.jmacro.commands.io


import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.json.JsonOutput

import java.nio.charset.Charset

trait OutputSerializers implements Constants {

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
        type = 'application/json'
        this.raw = raw
        this.outputContent = JsonOutput.toJson(raw)
        return outputContent
    }

    String csv(Iterable<Map<String, ?>> raw, String separator = ';', String enclosing = "\"") {
        type = 'text/csv'
        this.raw = raw
        List<String> colHeaders = raw.first().collect { Map.Entry<String, ?> it ->
            "${enclosing}${it.key.replace(enclosing, enclosing + enclosing)}${enclosing}".toString()
        }
        String csv = colHeaders.join(separator) + "\n"
        csv += raw.collect { row ->
            row.collect { "${enclosing}${it.value}${enclosing}" }.join(separator)
        }.join("\n")
        this.outputContent = csv
        return outputContent
    }

}
