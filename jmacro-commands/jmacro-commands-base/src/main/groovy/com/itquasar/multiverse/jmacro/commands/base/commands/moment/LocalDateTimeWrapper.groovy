package com.itquasar.multiverse.jmacro.commands.base.commands.moment

import com.itquasar.multiverse.jmacro.commands.base.BaseExtensionMethods
import groovy.transform.CompileDynamic

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.time.temporal.TemporalAdjusters
import java.time.temporal.TemporalAmount

/**
 * @author c101054
 *
 */
class LocalDateTimeWrapper implements Comparable<LocalDateTimeWrapper> {

    private LocalDateTime localDateTime

    static LocalDateTimeWrapper of(Temporal temporal) {
        return new LocalDateTimeWrapper(temporal)
    }

    LocalDateTimeWrapper(Temporal localDateTime) {
        this.localDateTime = LocalDateTime.from(localDateTime)
    }

    LocalDateTimeWrapper minus(TemporalAmount amount) {
        return of(localDateTime - amount)
    }

    LocalDateTimeWrapper plus(TemporalAmount amount) {
        return of(localDateTime + amount)
    }

    LocalDateTimeWrapper workDayOrNext() {
        switch (localDateTime.dayOfWeek) {
            case DayOfWeek.SUNDAY:
                return this + BaseExtensionMethods.day(1)
            case DayOfWeek.SATURDAY:
                return this + BaseExtensionMethods.days(2)
            default:
                return this
        }
    }

    LocalDateTimeWrapper workDayOrPrevious() {
        switch (localDateTime.dayOfWeek) {
            case DayOfWeek.SATURDAY:
                return this - BaseExtensionMethods.day(1)
            case DayOfWeek.SUNDAY:
                return this - BaseExtensionMethods.days(2)
            default:
                return this
        }
    }

    LocalDateTimeWrapper lastDayOfMonth() {
        return of(this.localDateTime.with(TemporalAdjusters.lastDayOfMonth()))
    }

    LocalDate date() {
        return LocalDate.from(localDateTime)
    }

    LocalDateTime dateTime() {
        return LocalDateTime.from(localDateTime instanceof LocalDate ? localDateTime.atStartOfDay() : localDateTime)
    }

    @CompileDynamic
    def propertyMissing(String name) {
        switch (name) {
            case 'month':
                name = 'monthValue'
                break
            case 'monthName':
                name = 'month'
                break
            case 'day':
                name = 'dayOfMonth'
                break
        }
        if (this.localDateTime.hasProperty(name)) {
            return this.localDateTime."$name"
        }
        if (this.respondsTo(name, null)) {
            return this."$name"()
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(name)
        return formatter.format(localDateTime)
    }

    @Override
    String toString() {
        return this.localDateTime.toString()
    }

    int compareTo(LocalDateTimeWrapper other) {
        return this.localDateTime.compareTo(other.localDateTime)
    }
}
