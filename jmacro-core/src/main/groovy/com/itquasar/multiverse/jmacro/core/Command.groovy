package com.itquasar.multiverse.jmacro.core

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import io.vavr.control.Try
import org.apache.logging.log4j.Logger

import javax.script.Bindings
import javax.script.ScriptContext
import javax.script.ScriptEngine

@CompileDynamic
abstract class Command {

    private final JMacroCore core
    private final ScriptEngine scriptEngine
    private final ScriptContext context

    /**
     * Logger instance to use. This is got from script engine context attribute, or explicitly given.
     */
    private final Logger logger

    /**
     * @param scriptEngine Script engine instance to get context, from which we get logger attribute.
     */
    @CompileStatic
    Command(final JMacroCore core, final ScriptEngine scriptEngine) {
        this.core = core
        this.scriptEngine = scriptEngine
        this.context = scriptEngine.getContext()
        this.logger = (Logger) this.context.getAttribute("logger")
    }

    def call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }

    def methodMissing(String name, def args) {
        return methodMissingOn(this.context, name, args)
    }

    def propertyMissing(String name) {
        return this.context."$name"
    }

    def propertyMissing(String name, def arg) {
        return this.context."$name" = arg
    }

    static methodMissingOn(def target, def name, def args) {
        if (target.respondsTo(name)) {
            if (args) {
                return target."$name"(*args)
            }
            return target."$name"()
        }
    }

    static methodMissingOnOrChainToContext(Command owner, def target, def name, def args) {
        Try.of({ methodMissingOn(target, name, args) })
            .onFailure(MissingMethodException.class, { methodMissingOn(owner.context, name, args) })
            .getOrElseThrow({ new JMacroException("Method mising redirection error: $name ($args)") })
    }

    static propertyMissingOn(def target, def name) {
        return target."$name"
    }

    static propertyMissingOnOrChainToContext(Command owner, def target, def name) {
        Try.of({ propertyMissingOn(target, name) })
            .onFailure(MissingPropertyException.class, { propertyMissingOn(owner.context, name) })
            .getOrElseThrow({ new JMacroException("Property missing (get) redirection error: $name") })
    }

    static propertyMissing(def target, String name, def arg) {
        return target."$name" = arg
    }

    static propertyMissingOnOrChainToContext(Command owner, def target, def name, def args) {
        Try.of({ propertyMissing(target, name, args) })
            .onFailure(MissingPropertyException.class, { propertyMissing(owner.context, name, args) })
            .getOrElseThrow({ new JMacroException("Property missing (set) redirection error: $name = $args") })
    }

    @CompileStatic
    JMacroCore getCore() {
        return core
    }

    @CompileStatic
    ScriptEngine getScriptEngine() {
        return scriptEngine
    }

    @CompileStatic
    ScriptContext getContext() {
        return context
    }

    @CompileStatic
    Logger getLogger() {
        return logger
    }

    @CompileStatic
    Bindings getBindings() {
        return this.getContext().getBindings(ScriptContext.ENGINE_SCOPE)
    }
}
