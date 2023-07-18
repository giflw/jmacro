package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.IncludeCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.script.ScriptEngine;

public class IncludeCommandProvider implements CommandProvider<IncludeCommand> {

    @Override
    public String getName() {
        return "include";
    }

    @Override
    public Class<IncludeCommand> getCommandType() {
        return IncludeCommand.class;
    }

    @Override
    public IncludeCommand getCommand(@NonNull Core core, @NonNull ScriptEngine scriptEngine) {
        return new IncludeCommand(
            getName(),
            core == null ? null : core.getConfiguration().getRepository(),
                core,
            scriptEngine
        );
    }
}
