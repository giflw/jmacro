package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.commands.moment.LocalDateTimeWrapper
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

import java.time.LocalDate
import java.time.LocalDateTime

@CompileStatic
class Moment implements GroovyCommand {

    LocalDateTimeWrapper today() {
        return LocalDateTimeWrapper.of(LocalDate.now().atStartOfDay())
    }

    LocalDateTimeWrapper now() {
        return LocalDateTimeWrapper.of(LocalDateTime.now())
    }

    @CompileDynamic
    def propertyMissing(String name) {
        if (respondsTo(name, null)) {
            return this."$name"()
        }
        throw new JMacroException(this, "Property $name not found even as method with no arguments.")
    }

}
