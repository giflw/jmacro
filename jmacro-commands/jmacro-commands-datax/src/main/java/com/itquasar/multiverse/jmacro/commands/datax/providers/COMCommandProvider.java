package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.COMCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class COMCommandProvider implements CommandProvider<COMCommand> {

    @Override
    public Class<COMCommand> getCommandType() {
        return COMCommand.class;
    }

    @Override
    public COMCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new COMCommand(core, scriptEngineAware);
    }
}
