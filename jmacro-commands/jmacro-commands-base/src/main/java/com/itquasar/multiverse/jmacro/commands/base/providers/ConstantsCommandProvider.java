package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConstantsCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

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

    public ConstantsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ConstantsCommand(getName(), core, scriptEngineAware);
    }

}
