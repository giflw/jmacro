package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Command
import com.itquasar.multiverse.jmacro.commands.base.commands.moment.LocalDateTimeWrapper
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import java.time.LocalDate
import java.time.LocalDateTime

@CompileStatic
@Log4j2
class Moment implements Command {

    LocalDateTimeWrapper today() {
        return LocalDateTimeWrapper.of(LocalDate.now().atStartOfDay())
    }

    LocalDateTimeWrapper now() {
        return LocalDateTimeWrapper.of(LocalDateTime.now())
    }
}
