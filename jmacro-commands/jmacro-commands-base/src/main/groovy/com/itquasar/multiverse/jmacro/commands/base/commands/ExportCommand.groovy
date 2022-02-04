package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore

import javax.script.ScriptContext
import javax.script.ScriptEngine

class ExportCommand extends Command {

    public static final String EXPORTS_KEY = "__EXPORTS__"

    private final JMacroCore core;
    private final ScriptEngine scriptEngine;

    ExportCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.scriptEngine = scriptEngine
        this.core = core

        def globalScope = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE)

        if (!globalScope.get(EXPORTS_KEY)) {
            logger.debug("Creating $EXPORTS_KEY")
            globalScope.put(EXPORTS_KEY, [:])
        }
    }

    void call(Object library) {
        call(library.class.simpleName, library)
    }

    void call(String name, Object library) {

        library.metaClass.methodMissing = { String n, def args -> Command.methodMissingOn(bindings, n, args) }
        library.metaClass.propertyMissing = { String n -> Command.propertyMissingOn(bindings, n) }
        library.metaClass.propertyMissing = { String n, def arg -> Command.propertyMissingOn(bindings, n, arg) }

        getLogger().warn("Exporting library object $name: $library")

        def exports = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE).get(EXPORTS_KEY)
        exports[name] = library
        logger.debug("Exports: $exports")

        if (library.respondsTo("libraryRegistered")) {
            logger.warn("Executing libraryRegistered on library $name (${library.class})")
            library.libraryRegistered()
        }
    }
}
