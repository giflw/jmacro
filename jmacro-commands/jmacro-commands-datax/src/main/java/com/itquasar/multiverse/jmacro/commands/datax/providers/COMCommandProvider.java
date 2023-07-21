package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.COMCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

public class COMCommandProvider implements CommandProvider<COMCommand> {

    @Override
    public String getName() {
        return "com";
    }

    @Override
    public Class<COMCommand> getCommandType() {
        return COMCommand.class;
    }

    @Override
    public COMCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new COMCommand(getName(), core, scriptEngine);
    }
}
