package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConsoleCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

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
    public ConsoleCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ConsoleCommand(getName(), core, scriptEngine);
    }

}
