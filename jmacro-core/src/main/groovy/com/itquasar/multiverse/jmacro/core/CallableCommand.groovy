package com.itquasar.multiverse.jmacro.core

import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.util.function.Consumer

abstract class CallableCommand<T> extends Command {

    private static final String[] CALL_ALTERNATIVES = ['apply', 'invoke']

    CallableCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    /**
     * Invoking commands:
     * <pre>
     * // Groovy way
     * command {
     *    it.method args
     * }
     * // JVM way
     * command { c ->
     *    c.method args
     * }
     * // Groovy way
     * command.with {
     *    method args
     * }
     * </pre>
     *
     * @param consumer Block to be executed/consume the command or its object implementation
     * @return Consumer parameter
     */
    T call(Consumer<T> consumer) {
        scriptLogger.debug("Calling with Consumer parameter and argument this")
        T t = this as T
        consumer.accept(t)
        return t
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
        if (name in CALL_ALTERNATIVES && this.respondsTo(name, args)) {
            return this.call(*args)
        }
        return this.bindings."$name"(*args)
    }
}
