package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.IncludeCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.script.ScriptEngine;

public class IncludeCommandProvider implements CommandProvider<IncludeCommand> {

    @Override
    public Class<IncludeCommand> getCommandType() {
        return IncludeCommand.class;
    }

    @Override
    public IncludeCommand getCommand(@NonNull JMacroCore jMacroCore, @NonNull ScriptEngine scriptEngine) {
        return new IncludeCommand(
            jMacroCore == null ? null : jMacroCore.getConfiguration().getRepository(),
            jMacroCore,
            scriptEngine
        );
    }
}
