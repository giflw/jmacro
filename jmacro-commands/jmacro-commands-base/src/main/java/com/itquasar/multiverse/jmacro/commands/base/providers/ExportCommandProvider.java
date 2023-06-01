package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ExportCommand;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

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
    public ExportCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ExportCommand(getName(), core, scriptEngine);
    }
}
