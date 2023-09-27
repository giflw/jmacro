package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.IncludeCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import org.checkerframework.checker.nullness.qual.NonNull;

public class IncludeCommandProvider implements CommandProvider<IncludeCommand> {

    @Override
    public Class<IncludeCommand> getCommandType() {
        return IncludeCommand.class;
    }

    @Override
    public IncludeCommand getCommand(@NonNull Core core, @NonNull ScriptEngineAware scriptEngineAware) {
        return new IncludeCommand(
            core.getConfiguration().getRepository(),
            core,
            scriptEngineAware
        );
    }
}
