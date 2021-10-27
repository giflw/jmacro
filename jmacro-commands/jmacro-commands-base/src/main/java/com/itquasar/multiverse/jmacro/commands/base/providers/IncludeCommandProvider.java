package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Include;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.script.GlobalScriptRepository;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.script.ScriptEngine;

public class IncludeCommandProvider implements CommandProvider<Include> {

    @Override
    public String getName() {
        return "include";
    }

    @Override
    public Include getCommand(@NonNull JMacroCore jMacroCore, @NonNull ScriptEngine scriptEngine) {
        return new Include(
            jMacroCore == null ? null : (GlobalScriptRepository) jMacroCore.getConfiguration().getScriptRepository(),
            scriptEngine
        );
    }
}
