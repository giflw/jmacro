package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.ZipCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ZipCommandProvider implements CommandProvider<ZipCommand> {

    @Override
    public Class<ZipCommand> getCommandType() {
        return ZipCommand.class;
    }

    @Override
    public ZipCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ZipCommand(core, scriptEngineAware);
    }

}
