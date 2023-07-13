package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.Doc
import groovy.transform.CompileDynamic

import javax.script.ScriptContext
import javax.script.ScriptEngine

class ExportCommand extends Command {

    @Doc("Global name of exports map.")
    public static final String EXPORTS_KEY = "__EXPORTS__"

    ExportCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        def globalScope = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE)
        if (!globalScope.get(EXPORTS_KEY)) {
            scriptLogger.debug("Creating $EXPORTS_KEY")
            globalScope.put(EXPORTS_KEY, [:])
        }
    }

    @Doc("Export given object using class simple name.")
    void call(Object library) {
        call(library.class.simpleName, library)
    }

    @Doc("Export given object using given name.")
    @CompileDynamic
    void call(String name, Object library) {
        library.metaClass.methodMissing = { String n, def args -> Command.methodMissingOn(bindings, n, args) }
        library.metaClass.propertyMissing = { String n -> Command.propertyMissingOn(bindings, n) }
        library.metaClass.propertyMissing = { String n, def arg -> Command.propertyMissingOn(bindings, n, arg) }

        getScriptLogger().warn("Exporting library object $name: $library")

        def exports = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE).get(EXPORTS_KEY)
        exports[name] = library
        scriptLogger.debug("Exports: $exports")

        if (library.respondsTo("exported")) {
            scriptLogger.warn("Executing exported on library $name (${library.class})")
            library.exported()
        }
    }
}
