package com.itquasar.multiverse.jmacro.core.command


import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.transform.CompileDynamic
import lombok.Getter
import org.apache.logging.log4j.Logger

import javax.script.Bindings
import javax.script.ScriptContext
import javax.script.ScriptEngine

abstract class AbstractCommand implements Command, Constants {

    @Getter
    private final String name
    private final Core core
    private final ScriptEngineAware scriptEngineAware
    private final ScriptContext context
    private final Bindings bindings

    /**
     * Logger instance to use. This is got from script engine context attribute, or explicitly given.
     */
    private final Logger scriptLogger


    /**
     * @param name Injected from command provider
     * @param core Injected from command provider
     * @param scriptEngineAware Script engine aware instance to get context, from which we get logger attribute.
     */
    AbstractCommand(String name, final Core core, final ScriptEngineAware scriptEngineAware) {
        if (name == '') {
            name = this.getClass().name
        }
        Objects.requireNonNull(name, "Name must be not null")
        Objects.requireNonNull(core, "Core must be not null")
        Objects.requireNonNull(scriptEngine, "Script engine must be not null")
        this.name = name
        this.core = core
        this.scriptEngineAware = scriptEngineAware

        this.context = scriptEngine.getContext()
        Objects.requireNonNull(this.context, "Script context must be not null")

        this.bindings = this.context.getBindings(ScriptContext.ENGINE_SCOPE)
        Objects.requireNonNull(this.bindings, "Bindings must be not null")

        this.scriptLogger = this.scriptEngineAware.logger()
        Objects.requireNonNull(this.scriptLogger, "Logger must be not null")
    }

    @CompileDynamic
    def dynamicMethodCall(String name, def args) {
        return this.invokeMethod(name, args)
    }


    @CompileDynamic
    def propertyMissing(String name) {
        return this.bindings."$name"
    }

    def propertyMissing(String name, def arg) {
        throw new JMacroException("Unsupported operation: propertyMissing(name, value)")
    }

    @Override
    String getName() {
        return name
    }

    @Override
    Core getCore() {
        return core
    }

    @Override
    ScriptEngineAware getScriptEngineAware() {
        return scriptEngineAware
    }

    @Override
    ScriptEngine getScriptEngine() {
        return scriptEngineAware.scriptEngine()
    }

    @Override
    ScriptContext getContext() {
        return context
    }

    @Override
    Bindings getBindings() {
        return bindings
    }

    @Override
    Logger getScriptLogger() {
        return scriptLogger
    }
}
