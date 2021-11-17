package com.itquasar.multiverse.jmacro.commands.base.commands


import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand

import javax.script.ScriptContext
import javax.script.ScriptEngine

class Library extends LoggingCommand {

    private final JMacroCore core;
    private final ScriptEngine scriptEngine;

    Library(JMacroCore core, ScriptEngine scriptEngine) {
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
