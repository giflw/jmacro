package com.itquasar.multiverse.jmacro.commands.io.commands.request

import com.itquasar.multiverse.jmacro.commands.io.OutputSerializers
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
import org.apache.hc.core5.http.ContentType
import org.apache.hc.core5.http.HttpEntity
import org.apache.hc.core5.http.NameValuePair
import org.apache.hc.core5.http.io.entity.StringEntity
import org.apache.hc.core5.http.message.BasicNameValuePair

import java.nio.charset.StandardCharsets
import java.nio.file.Path

@Log4j2
@CompileDynamic
class Body implements OutputSerializers {

//    private ScriptContext context
    HttpEntity entity

//    Body(ScriptContext bindings) {
//        this.context = context
//    }

    @Override
    String csv(Iterable<Map<String, ?>> raw, Object separator, Object enclosing) {
        String csv = OutputSerializers.super.csv(raw, separator, enclosing)
        log.debug("[Body|csv] ${raw?.toString().substring(0, 100)}")
        entity = new StringEntity(csv, ContentType.TEXT_PLAIN, StandardCharsets.UTF_8.name(), false)
    }

    @Override
    String text(Object raw) {
        log.debug("[Body|text] ${raw?.toString().substring(0, 100)}")
        entity = new StringEntity(OutputSerializers.super.text(raw), ContentType.TEXT_PLAIN, StandardCharsets.UTF_8.name(), false)
    }

    @Override
    String json(Object raw) {
        String json = OutputSerializers.super.json(raw)
        log.debug("[Body|json] ${raw?.toString().substring(0, 100)}")
        entity = new StringEntity(json, ContentType.APPLICATION_JSON, StandardCharsets.UTF_8.name(), false)
    }

//    void xml(Closure xmlDefinition) {
//        def writer = new StringWriter()
//        def xml = new MarkupBuilder(writer)
//        xmlDefinition.delegate = xml
//        xmlDefinition.resolveStrategy = Closure.DELEGATE_FIRST
//        xmlDefinition()
//        entity = new StringEntity(writer.toString(), ContentType.APPLICATION_XML, StandardCharsets.UTF_8.name(), false)
//    }

    void form(Map<String, ?> fields) {
        List<NameValuePair> urlParameters = fields.collect { name, value ->
            new BasicNameValuePair(name, value?.toString())
        }
        if (log.isDebugEnabled()) {
            urlParameters.each {
                log.debug("[Body|form] ${it.name}: ${it.value}")
            }
        }
        entity = new UrlEncodedFormEntity(urlParameters, StandardCharsets.UTF_8)
    }

    void multipart(Map<String, ?> fields) {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create()
        fields.each { name, value ->
            if (Path.isInstance(value)) {
                value = value.toFile()
            }
            if (File.isInstance(value)) {
                def octetStreamType = ContentType.APPLICATION_OCTET_STREAM
                builder.addBinaryBody(name, value, octetStreamType, value.name)
            } else {
                builder.addTextBody(name, value)
            }
        }
        entity = builder.build()
    }
//
//    def methodMissing(String name, def args) {
//        Command.methodMissingOn(this.context, name, args)
//    }
//
//    def propertyMissing(String name) {
//        Command.propertyMissingOn(this.context, name)
//    }
//
//    def propertyMissing(String name, def arg) {
//        Command.propertyMissingOn(this.context, name, arg)
//    }
}
