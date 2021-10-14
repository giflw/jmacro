package com.itquasar.multiverse.jmacro.commands.base.commands.moment

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.time.temporal.TemporalAmount

class LocalDateTimeWrapper {

    private LocalDateTime localDateTime

    static LocalDateTimeWrapper of(Temporal temporal) {
        return new LocalDateTimeWrapper(temporal)
    }

    LocalDateTimeWrapper(Temporal localDateTime) {
        this.localDateTime = localDateTime
    }

    LocalDateTimeWrapper minus(TemporalAmount amount) {
        return LocalDateTimeWrapper.of(localDateTime.minus(amount))
    }

    LocalDateTimeWrapper plus(TemporalAmount amount) {
        return LocalDateTimeWrapper.of(localDateTime.plus(amount))
    }

    LocalDateTimeWrapper workDayOrNext() {
        switch (localDateTime.dayOfWeek) {
            case DayOfWeek.SUNDAY:
                return this.plus(1.day())
            case DayOfWeek.SATURDAY:
                return this.plus(2.days())
            default:
                return this
        }
    }

    LocalDateTimeWrapper workDayOrPrevious() {
        switch (localDateTime.dayOfWeek) {
            case DayOfWeek.SATURDAY:
                return this.minus(1.day())
            case DayOfWeek.SUNDAY:
                return this.minus(2.days())
            default:
                return this
        }
    }

    LocalDate date() {
        return LocalDate.from(localDateTime)
    }

    LocalDateTime dateTime() {
        return LocalDateTime.from(localDateTime instanceof LocalDate ? localDateTime.atStartOfDay() : localDateTime)
    }

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(name)
        return formatter.format(localDateTime)
    }
}
