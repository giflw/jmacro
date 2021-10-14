package com.itquasar.multiverse.jmacro.commands.base

import com.itquasar.multiverse.jmacro.commands.base.commands.Functions
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2

import javax.script.ScriptContext

@Log4j2
@CompileDynamic
trait Command implements Functions {

    ScriptContext context

    def propertyMissing(String name) {
        int scope = this.context.getAttributesScope(name)
        if (scope > -1) {
            return this.context.getAttribute(name, scope)
        }
        throw new MissingPropertyException("Property $name not found!")
    }

    def call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }
}
