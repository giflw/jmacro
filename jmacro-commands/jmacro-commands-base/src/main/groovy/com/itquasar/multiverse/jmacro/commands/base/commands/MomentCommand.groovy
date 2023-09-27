package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.commands.moment.LocalDateTimeWrapper
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic

import java.time.LocalDate
import java.time.LocalDateTime

class MomentCommand extends AbstractCommand {

    MomentCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
    }


    LocalDateTimeWrapper today() {
        return LocalDateTimeWrapper.of(LocalDate.now().atStartOfDay())
    }


    LocalDateTimeWrapper now() {
        return LocalDateTimeWrapper.of(LocalDateTime.now())
    }

    @CompileDynamic
    def propertyMissing(String name) {
        if (this.respondsTo(name, null)) {
            return this."$name"()
        }
        def now = this.now()
        if (now.hasProperty(name)) {
            return now."$name"
        }
        if (now.respondsTo(name, null)) {
            return now."$name"()
        }
        throw new JMacroException(this, "Property $name not found even as method with no arguments.")
    }

}
