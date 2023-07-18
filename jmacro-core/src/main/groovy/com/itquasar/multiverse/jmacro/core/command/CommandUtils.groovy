package com.itquasar.multiverse.jmacro.core.command

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.transform.CompileDynamic
import io.vavr.control.Try

import javax.script.Bindings
import javax.script.ScriptContext

class CommandUtils implements Constants {

    private CommandUtils() {
        throw new UnsupportedOperationException("Utility class should be instantiated")
    }

    static methodMissingOn(def object, String name, def args) {
        return methodMissingOn(object, name, args, null)
    }

    // FIXME refactor to throw JMacroException, or change missingPropertyOn
    @CompileDynamic
    static methodMissingOn(def object, String name, def args, Bindings bindings) {
        return args != null ? object."$name"(*args) : object."$name"()
    }

    static methodMissingOnOrChainToContext(AbstractCommand command, def target, String name, def args) {
        return methodMissingOnOrChainToContext(command.bindings, target, name, args)
    }

    static methodMissingOnOrChainToContext(ScriptContext context, def target, String name, def args) {
        return methodMissingOnOrChainToContext(context.getBindings(ScriptContext.ENGINE_SCOPE), target, name, args)
    }

    static methodMissingOnOrChainToContext(Bindings bindings, def target, String name, def args) {
        Try.of({ -> methodMissingOn(target, name, args, bindings) })
            .orElse(Try.of({ methodMissingOn(bindings, name, args, bindings) }))
            .getOrElseThrow({ it ->
                throw new JMacroException("Method missing redirection error: $name ($args)", it)
            })
    }

    static propertyMissingOn(AbstractCommand command, String name) {
        return propertyMissingOn(command.bindings, name)
    }

    static propertyMissingOn(ScriptContext context, String name) {
        return propertyMissingOn(context.getBindings(ScriptContext.ENGINE_SCOPE), name)
    }

    @CompileDynamic
    static propertyMissingOn(def target, String name) {
        // FIXME is there a way to check if value exists or is undefined?
        return Try.of({ target."$name" })
            .getOrElseThrow({ it -> new JMacroException("Property missing (get) redirection error: $name", it) })
    }

    static propertyMissingOnOrChainToContext(AbstractCommand command, def target, String name) {
        return propertyMissingOnOrChainToContext(command.context, target, name)
    }

    static propertyMissingOnOrChainToContext(ScriptContext context, def target, String name) {
        return Try.of({ propertyMissingOn(target, name) })
            .orElse(Try.of({ propertyMissingOn(context.getBindings(ScriptContext.ENGINE_SCOPE), name) }))
            .getOrElseThrow({ it -> new JMacroException("Property missing (get) redirection error: $name", it) })
    }

    static propertyMissingOn(AbstractCommand command, String name, def arg) {
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

    static propertyMissingOnOrChainToContext(AbstractCommand command, def target, String name, def arg) {
        return propertyMissingOnOrChainToContext(command.context, target, name, arg)
    }

    static propertyMissingOnOrChainToContext(ScriptContext context, def target, String name, def arg) {
        return Try.of({ propertyMissingOn(target, name, arg) })
            .orElse(Try.of({ propertyMissingOn(context, name, arg) }))
            .getOrElseThrow({ it -> new JMacroException("Property missing (set) redirection error: $name = $arg", it) })
    }


    static callDelegating(Object delegate, Closure closure) {
        closure.delegate = delegate
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        return closure()
    }

    static callOn(Bindings bindings, String name, def object) {
        return bindings.get(name).invokeMethod('call', object)
    }

    static raise(String message) {
        throw new JMacroException(message);
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

    @CompileDynamic
    static def callMethodAliasOrElse(Command command, String name, def args, Closure orElse) {
        if (command instanceof AbstractCommand && name in ConsumerCommand.CALL_ALTERNATIVES && command.respondsTo("call", args)) {
            return command.dynamicMethodCall("call", args)
        } else {
            return orElse()
        }
    }

    static def callMethodAliasOrOnBindings(Command command, String name, def args) {
        return callMethodAliasOrElse(command, name, args) { methodMissingOn(command.bindings, name, args) }
    }
}
