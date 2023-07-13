package com.itquasar.multiverse.jmacro.core


import javax.script.ScriptEngine

abstract class SelfClosureCallableCommand<T> extends CallableCommand<T> {

    SelfClosureCallableCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    T call(Closure closure) {
        scriptLogger.debug("Calling with Closure parameter and delegate to this first")
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure.call()
        return (T) this
    }

}
