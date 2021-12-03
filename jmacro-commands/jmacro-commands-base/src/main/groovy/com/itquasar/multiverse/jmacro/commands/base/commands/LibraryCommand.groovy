package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore

import javax.script.ScriptContext
import javax.script.ScriptEngine

class LibraryCommand extends Command {

    private final JMacroCore core;
    private final ScriptEngine scriptEngine;

    LibraryCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine);
        this.scriptEngine = scriptEngine;
        this.core = core;
    }

    void call(String name, Object library) {

        library.metaClass.methodMissing = { String n, def args -> Command.methodMissingOn(bindings, n, args) }
        library.metaClass.propertyMissing = { String n -> Command.propertyMissingOn(bindings, n) }
        library.metaClass.propertyMissing = { String n, def arg -> Command.propertyMissingOn(bindings, n, arg) }

        getLogger().warn("Registering library object $name")
        this.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).put(
            name,
            library
        )
    }
}
