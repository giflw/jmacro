package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import groovy.transform.CompileDynamic

import javax.script.ScriptContext

class ExportCommand extends AbstractCommand {


    public static final String EXPORTS_KEY = "__EXPORTS__"

    ExportCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
        def globalScope = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE)
        if (!globalScope.get(EXPORTS_KEY)) {
            scriptLogger.debug("Creating $EXPORTS_KEY")
            globalScope.put(EXPORTS_KEY, [:])
        }
    }


    void call(Object library) {
        call(library.class.simpleName, library)
    }


    @CompileDynamic
    void call(String name, Object library) {
        library.metaClass.methodMissing = { String n, def args -> CommandUtils.methodMissingOn(bindings, n, args) }
        library.metaClass.propertyMissing = { String n -> CommandUtils.propertyMissingOn(bindings, n) }
        library.metaClass.propertyMissing = { String n, def arg -> CommandUtils.propertyMissingOn(bindings, n, arg) }

        getScriptLogger().warn("Exporting library object $name: $library")

        def exports = this.scriptEngine.getBindings(ScriptContext.GLOBAL_SCOPE).get(EXPORTS_KEY)
        exports[name] = library
        scriptLogger.debug("Exports: $exports")

        if (library.respondsTo("exported")) {
            scriptLogger.warn("Executing exported on library $name (${library.class})")
            library.exported()
        }

        bindings.put(name, library)
    }
}
