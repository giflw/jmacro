package com.itquasar.multiverse.jmacro.core

import com.itquasar.multiverse.jmacro.core.annotations.NotInherited
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

abstract class SelfClosureCallableCommand<T> extends CallableCommand<T> {

    SelfClosureCallableCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    T call(Closure closure) {
        scriptLogger.debug("Calling with Closure parameter and delegate to this first")
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure.call()
        return (T) this
    }

    @NotInherited
    def propertyMissing(String name) {
        return propertyMissingOn(this.bindings, name)
    }

    @NotInherited
    def methodMissing(String name, def args) {
        return callMethodAliasOrOnBindings(this, name, args)
    }

}
