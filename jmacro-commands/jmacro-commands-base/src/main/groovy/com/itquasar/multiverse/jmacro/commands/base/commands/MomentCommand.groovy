package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.commands.moment.LocalDateTimeWrapper
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.Doc
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

import javax.script.ScriptEngine
import java.time.LocalDate
import java.time.LocalDateTime

@Doc("Date and time command")
@CompileStatic
class MomentCommand extends Command {

    MomentCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Doc("Return LocalDateTimeWrapper with date as today and time at start of day.")
    LocalDateTimeWrapper today() {
        return LocalDateTimeWrapper.of(LocalDate.now().atStartOfDay())
    }

    @Doc("Return LocalDateTimeWrapper with date and time as now.")
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
