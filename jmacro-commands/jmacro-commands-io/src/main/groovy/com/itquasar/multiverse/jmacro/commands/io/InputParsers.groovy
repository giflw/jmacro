package com.itquasar.multiverse.jmacro.commands.io

import com.xlson.groovycsv.CsvParser
import groovy.json.JsonSlurper
import groovy.util.logging.Log4j2
import groovy.xml.XmlSlurper
import groovy.xml.XmlUtil
import groovy.xml.slurpersupport.GPathResult
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

import java.nio.charset.Charset

@Log4j2
trait InputParsers {

    String name
    String type
    String charset = Charset.defaultCharset().name()
    def data

    abstract String getRaw();

    String getText() {
        return type == 'application/xml' || type == 'xml' ? XmlUtil.serialize((GPathResult) data) : data.toString()
    }

    List<String> getLines() {
        log.debug("Using readLines to parse input")
        return raw.split(/\r\n+/)
    }

    Object getJson() {
        log.debug("Using ${JsonSlurper.class} to parse input")
        JsonSlurper jsonSlurper = new JsonSlurper()
        Object object = jsonSlurper.parseText(raw)
        return object
    }

    List getCsv() {
        log.debug("Using ${CsvParser.class} to parse input")
        data = CsvParser.parseCsv(raw, autoDetect: true).toList()
        return data
    }

    GPathResult getXml() {
        log.debug("Using ${XmlSlurper.class} to parse input")
        GPathResult xml = new XmlSlurper().parseText(raw)
        data = xml
        return data
    }

    Document getHtml() {
        log.debug("Using ${Jsoup.class} to parse input")
        Document html = Jsoup.parse(raw, charset);
        data = html
        return data
    }
}
