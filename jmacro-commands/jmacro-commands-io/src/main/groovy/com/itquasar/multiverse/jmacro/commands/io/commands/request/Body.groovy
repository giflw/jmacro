package com.itquasar.multiverse.jmacro.commands.io.commands.request

import com.itquasar.multiverse.jmacro.commands.io.OutputSerializers
import com.itquasar.multiverse.jmacro.core.Command
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
import org.apache.hc.core5.http.ContentType
import org.apache.hc.core5.http.HttpEntity
import org.apache.hc.core5.http.NameValuePair
import org.apache.hc.core5.http.io.entity.StringEntity
import org.apache.hc.core5.http.message.BasicNameValuePair

import javax.script.Bindings
import java.nio.charset.StandardCharsets
import java.nio.file.Path

class Body implements OutputSerializers {

    private Bindings bindings
    HttpEntity entity

    Body(Bindings bindings) {
        this.bindings = bindings
    }

    String csv(Iterable<Map<String, ?>> raw, Object separator, Object enclosing) {
        String csv = OutputSerializers.super.csv(raw, separator, enclosing)
        Command.log(bindings, DEBUG, "[Body|csv] ${raw?.toString().take(100)}")
        entity = new StringEntity(csv, ContentType.TEXT_PLAIN, StandardCharsets.UTF_8.name(), false)
    }

    @Override
    String text(Object raw) {
        Command.log(bindings, DEBUG, "[Body|text] ${raw?.toString().take(100)}")
        entity = new StringEntity(OutputSerializers.super.text(raw), ContentType.TEXT_PLAIN, StandardCharsets.UTF_8.name(), false)
    }

    @Override
    String json(Object raw) {
        String json = OutputSerializers.super.json(raw)
        Command.log(bindings, DEBUG, "[Body|json] ${raw?.toString().take(100)}")
        entity = new StringEntity(json, ContentType.APPLICATION_JSON, StandardCharsets.UTF_8.name(), false)
    }

    void form(Map<String, ?> fields) {
        List<NameValuePair> urlParameters = fields.collect { name, value ->
            (NameValuePair) new BasicNameValuePair(name, value?.toString())
        }
        urlParameters.each {
            Command.log(bindings, DEBUG, "[Body|form] ${it.name}: ${it.value}")
        }
        entity = new UrlEncodedFormEntity(urlParameters, StandardCharsets.UTF_8)
    }

    void multipart(Map<String, ?> fields) {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create()
        fields.each { name, value ->
            if (Path.isInstance(value)) {
                value = ((Path) value).toFile()
            }
            if (File.isInstance(value)) {
                File file = (File) value
                ContentType octetStreamType = ContentType.APPLICATION_OCTET_STREAM
                builder.addBinaryBody(name, file, octetStreamType, file.name)
            } else {
                builder.addTextBody(name, value?.toString())
            }
        }
        entity = builder.build()
    }
}
