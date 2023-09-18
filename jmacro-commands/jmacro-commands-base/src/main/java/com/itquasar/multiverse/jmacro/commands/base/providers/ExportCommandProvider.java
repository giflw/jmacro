package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ExportCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ExportCommandProvider implements CommandProvider<ExportCommand> {

    @Override
    public String getName() {
        return "export";
    }

    @Override
    public Class<ExportCommand> getCommandType() {
        return ExportCommand.class;
    }

    @Override
    public ExportCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ExportCommand(getName(), core, scriptEngineAware);
    }
}
