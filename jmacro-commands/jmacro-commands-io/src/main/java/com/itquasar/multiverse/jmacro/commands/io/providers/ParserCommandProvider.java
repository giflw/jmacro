package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.ParserCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ParserCommandProvider implements CommandProvider<ParserCommand> {

    @Override
    public String getName() {
        return "parser";
    }

    @Override
    public Class<ParserCommand> getCommandType() {
        return ParserCommand.class;
    }

    @Override
    public ParserCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new ParserCommand(getName(), core, scriptEngineAware);
    }
}
