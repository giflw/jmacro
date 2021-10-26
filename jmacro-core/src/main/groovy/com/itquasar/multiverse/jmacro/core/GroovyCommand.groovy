package com.itquasar.multiverse.jmacro.core


import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2

import javax.script.ScriptContext

@Log4j2
@CompileDynamic
trait GroovyCommand {

    def call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }
}
