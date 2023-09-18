package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConsoleCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ConsoleCommandProvider implements CommandProvider<ConsoleCommand> {

    @Override
    public String getName() {
        return "console";
    }

    @Override
    public Class<ConsoleCommand> getCommandType() {
        return ConsoleCommand.class;
    }

    @Override
    public ConsoleCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ConsoleCommand(getName(), core, scriptEngineAware);
    }

}
