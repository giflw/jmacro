package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ExportCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ExportCommandProvider implements CommandProvider<ExportCommand> {

    @Override
    public Class<ExportCommand> getCommandType() {
        return ExportCommand.class;
    }

    @Override
    public ExportCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ExportCommand(core, scriptEngineAware);
    }
}
