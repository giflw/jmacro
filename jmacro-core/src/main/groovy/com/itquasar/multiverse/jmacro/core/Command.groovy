package com.itquasar.multiverse.jmacro.core

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import io.vavr.control.Try
import org.apache.logging.log4j.Logger

import javax.script.Bindings
import javax.script.ScriptContext
import javax.script.ScriptEngine

abstract class Command implements Constants {

    private final String name
    private final JMacroCore core
    private final ScriptEngine scriptEngine
    private final ScriptContext context
    private final Bindings bindings

    /**
     * Logger instance to use. This is got from script engine context attribute, or explicitly given.
     */
    private final Logger logger

    /**
     * @param name Injected from command provider
     * @param core Injected from command provider
     * @param scriptEngine Script engine instance to get context, from which we get logger attribute.
     */
    Command(String name, final JMacroCore core, final ScriptEngine scriptEngine) {
        if (name == '') {
            name = this.getClass().name
        }
        Objects.requireNonNull(name, "Name must be not null")
        Objects.requireNonNull(core, "Core must be not null")
        Objects.requireNonNull(scriptEngine, "Script engine must be not null")
        this.name = name
        this.core = core
        this.scriptEngine = scriptEngine

        this.context = scriptEngine.getContext()
        Objects.requireNonNull(this.context, "Script context must be not null")

        this.bindings = this.context.getBindings(ScriptContext.ENGINE_SCOPE)
        Objects.requireNonNull(this.bindings, "Bindings must be not null")

        this.logger = (Logger) this.context.getBindings(ScriptContext.GLOBAL_SCOPE).get("logger")
        Objects.requireNonNull(this.logger, "Logger must be not null")
    }

    void allCommandsRegistered() {
        // called after command is registered
    }

    @CompileDynamic
    def methodMissing(String name, def args) {
        return this.bindings."$name"(*args)
    }

    @CompileDynamic
    def propertyMissing(String name) {
        return this.bindings."$name"
    }

    def propertyMissing(String name, def arg) {
        // no op
    }

    static methodMissingOn(def object, String name, def args) {
        return methodMissingOn(object, name, args, null)
    }

    // FIXME refactor to throw JMacroException, or change missingPropertyOn
    @CompileDynamic
    static methodMissingOn(def object, String name, def args, Bindings bindings) {
        return args != null ? object."$name"(*args) : object."$name"()
    }

    static methodMissingOnOrChainToContext(Command command, def target, String name, def args) {
        return methodMissingOnOrChainToContext(command.bindings, target, name, args)
    }

    static methodMissingOnOrChainToContext(ScriptContext context, def target, String name, def args) {
        return methodMissingOnOrChainToContext(context.getBindings(ScriptContext.ENGINE_SCOPE), target, name, args)
    }

    static methodMissingOnOrChainToContext(Bindings bindings, def target, String name, def args) {
        Try.of({ it -> methodMissingOn(target, name, args, bindings) })
            .orElse(Try.of({ methodMissingOn(bindings, name, args, bindings) }))
            .getOrElseThrow({ it -> throw new JMacroException("Method missing redirection error: $name ($args)", it) })
    }

    static propertyMissingOn(Command command, String name) {
        return propertyMissingOn(command.bindings, name)
    }

    static propertyMissingOn(ScriptContext context, String name) {
        return propertyMissingOn(context.getBindings(ScriptContext.ENGINE_SCOPE), name)
    }

    @CompileDynamic
    static propertyMissingOn(def target, String name) {
        return Try.of({ target."$name" })
            .getOrElseThrow({ it -> new JMacroException("Property missing (get) redirection error: $name", it) })
    }

    static propertyMissingOnOrChainToContext(Command command, def target, String name) {
        return propertyMissingOnOrChainToContext(command.context, target, name)
    }

    static propertyMissingOnOrChainToContext(ScriptContext context, def target, String name) {
        return Try.of({ propertyMissingOn(target, name) })
            .orElse(Try.of({ propertyMissingOn(context.getBindings(ScriptContext.ENGINE_SCOPE), name) }))
            .getOrElseThrow({ it -> new JMacroException("Property missing (get) redirection error: $name", it) })
    }

    static propertyMissingOn(Command command, String name, def arg) {
        return propertyMissingOn(command.bindings, name, arg)
    }

    static propertyMissingOn(ScriptContext context, String name, def arg) {
        return propertyMissingOn(context.getBindings(ScriptContext.ENGINE_SCOPE), name, arg)
    }

    @CompileDynamic
    static propertyMissingOn(def target, String name, def arg) {
        return Try.of({ target."$name" = arg })
            .getOrElseThrow({ it -> new JMacroException("Property missing (set) redirection error: $name = $arg", it) })

    }

    static propertyMissingOnOrChainToContext(Command command, def target, String name, def arg) {
        return propertyMissingOnOrChainToContext(command.context, target, name, arg)
    }

    static propertyMissingOnOrChainToContext(ScriptContext context, def target, String name, def arg) {
        return Try.of({ propertyMissingOn(target, name, arg) })
            .orElse(Try.of({ propertyMissingOn(context, name, arg) }))
            .getOrElseThrow({ it -> new JMacroException("Property missing (set) redirection error: $name = $arg", it) })
    }


    void echo(Object message) {
        echo(bindings, message)
    }

    void raise(String message) {
        raise(bindings, message)
    }

    static callDelegating(Object delegate, Closure closure) {
        closure.delegate = delegate
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        return closure()
    }

    static callOn(Bindings bindings, String name, def object) {
        return bindings.get(name).invokeMethod('call', object)
    }

    static echo(Bindings bindings, String message) {
        return callOn(bindings, 'echo', message)
    }

    static echo(Bindings bindings, Object message) {
        return callOn(bindings, 'echo', message)
    }

    static raise(Bindings bindings, String message) {
        return callOn(bindings, 'raise', message)
    }

    static log(ScriptContext scriptContext, String level = DEBUG, String message, Throwable throwable = null) {
        log(scriptContext.getBindings(ScriptContext.ENGINE_SCOPE), level, message, throwable)
    }

    static log(Bindings bindings, String level = DEBUG, String message, Throwable throwable = null) {
        if (level == ERROR) {
            bindings.get('logger').invokeMethod(level, [message, throwable])
        } else {
            bindings.get('logger').invokeMethod(level, message)
        }
    }

    String getName() {
        return name
    }

    JMacroCore getCore() {
        return core
    }

    ScriptEngine getScriptEngine() {
        return scriptEngine
    }

    ScriptContext getContext() {
        return context
    }

    Bindings getBindings() {
        return bindings
    }

    Logger getLogger() {
        return logger
    }
}
