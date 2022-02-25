package com.itquasar.multiverse.jmacro.commands.io

import com.xlson.groovycsv.CsvParser
import groovy.json.JsonSlurper
import groovy.util.logging.Log4j2
import groovy.xml.XmlSlurper
import groovy.xml.slurpersupport.GPathResult
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

import java.nio.charset.Charset

//@Log4j2()
trait InputParsers {

    String name
    String type
    String charset = Charset.defaultCharset().name()
    def data

    abstract String getText();

    List<String> getLines() {
        //log.debug("Using readLines to parse input")
        return text.split(/\r\n+/)
    }

    Object getJson() {
        //log.debug("Using ${JsonSlurper.class} to parse input")
        JsonSlurper jsonSlurper = new JsonSlurper()
        return jsonSlurper.parseText(text)
    }

    List getCsv() {
        //log.debug("Using ${CsvParser.class} to parse input")
        return CsvParser.parseCsv(text, autoDetect: true).toList()
    }

    GPathResult getXml() {
        //log.debug("Using ${XmlSlurper.class} to parse input")
        return new XmlSlurper().parseText(text)
    }

    Document getHtml() {
        //log.debug("Using ${Jsoup.class} to parse input")
        return Jsoup.parse(text, charset)
    }
}
