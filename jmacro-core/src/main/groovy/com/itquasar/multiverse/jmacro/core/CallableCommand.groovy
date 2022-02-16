package com.itquasar.multiverse.jmacro.core


import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

@CompileDynamic
abstract class CallableCommand extends Command {

    CallableCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    def call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }
}
