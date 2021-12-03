package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore

import javax.script.ScriptContext
import javax.script.ScriptEngine

class LibraryCommand extends Command {

    private final JMacroCore core;
    private final ScriptEngine scriptEngine;

    LibraryCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(scriptEngine);
        this.scriptEngine = scriptEngine;
        this.core = core;
    }

    void call(String name, Object library) {
        getLogger().warn("Registering library object $name")
        this.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).put(
            name,
            library
        )
    }
}
