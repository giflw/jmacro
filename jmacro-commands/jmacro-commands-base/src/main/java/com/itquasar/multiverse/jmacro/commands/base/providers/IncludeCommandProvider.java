package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Include;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.script.GlobalScriptRepository;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class IncludeCommandProvider implements CommandProvider<Include> {

    @Override
    public String getName() {
        return "include";
    }

    @Override
    // FIXME jmacrocore must be not null
    public Include getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        return new Include(
            jMacroCore == null ? null : (GlobalScriptRepository) jMacroCore.getConfiguration().getScriptRepository(),
            scriptEngine,
            scriptContext
        );
    }
}
