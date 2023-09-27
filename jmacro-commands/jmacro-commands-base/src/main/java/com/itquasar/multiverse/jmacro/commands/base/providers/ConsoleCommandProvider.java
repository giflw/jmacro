package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConsoleCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ConsoleCommandProvider implements CommandProvider<ConsoleCommand> {

    @Override
    public Class<ConsoleCommand> getCommandType() {
        return ConsoleCommand.class;
    }

    @Override
    public ConsoleCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ConsoleCommand(core, scriptEngineAware);
    }

}
