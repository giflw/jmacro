package com.itquasar.multiverse.jmacro.core

import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.lang.reflect.Proxy
import java.util.function.Consumer

abstract class CallableCommand<T> extends Command {

    private static final String[] CALL_ALTERNATIVES = ['apply', 'invoke']

    CallableCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @CompileDynamic
    T call(Consumer<T> consumer) {
        consumer.accept((T) this)
        return (T) this
    }

    T invoke(Consumer<T> consumer) {
        this.call(consumer)
    }

    T apply(Consumer<T> consumer) {
        this.call(consumer)
    }

    @Override
    @CompileDynamic
    def methodMissing(String name, def args) {
        if (name in CALL_ALTERNATIVES) {
            return this.call(*args)
        }
        return this.bindings."$name"(*args)
    }
}
