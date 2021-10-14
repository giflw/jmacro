package com.itquasar.multiverse.jmacro.commands.base

import com.itquasar.multiverse.jmacro.commands.base.commands.moment.LocalDateTimeWrapper
import groovy.transform.CompileDynamic

import java.nio.charset.StandardCharsets
import java.time.LocalDateTime
import java.time.Period
import java.time.temporal.TemporalAmount

@CompileDynamic
class BaseExtensionMethods {

    //////////////////////////////////////////////////////////////////////////////////////
    // STRING
    //////////////////////////////////////////////////////////////////////////////////////

    static urlEncode(String self) {
        return URLEncoder.encode(self, StandardCharsets.UTF_8)
    }

    static urlDecode(String self) {
        return URLDecoder.decode(self, StandardCharsets.UTF_8)
    }

    //////////////////////////////////////////////////////////////////////////////////////
    // INTEGER
    //////////////////////////////////////////////////////////////////////////////////////

    static TemporalAmount day(Integer self) {
        return Period.ofDays(self)
    }

    static TemporalAmount days(Integer self) {
        return Period.ofDays(self)
    }

    static TemporalAmount week(Integer self) {
        return Period.ofWeeks(self)
    }

    static TemporalAmount weeks(Integer self) {
        return Period.ofWeeks(self)
    }

    static TemporalAmount month(Integer self) {
        return Period.ofMonths(self)
    }

    static TemporalAmount months(Integer self) {
        return Period.ofMonths(self)
    }

    static TemporalAmount year(Integer self) {
        return Period.ofYears(self)
    }

    static TemporalAmount years(Integer self) {
        return Period.ofYears(self)
    }

    //////////////////////////////////////////////////////////////////////////////////////
    // LOCAL DATE TIME
    //////////////////////////////////////////////////////////////////////////////////////

    static LocalDateTimeWrapper wrap(LocalDateTime self) {
        return LocalDateTimeWrapper.of(self)
    }
}
