package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConstantsCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;
import java.util.List;

public class ConstantsCommandProvider implements CommandProvider<ConstantsCommand> {

    @Override
    public String getName() {
        return "constants";
    }

    @Override
    public Class<ConstantsCommand> getCommandType() {
        return ConstantsCommand.class;
    }

    @Override

    public ConstantsCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ConstantsCommand(getName(), core, scriptEngine);
    }

}
