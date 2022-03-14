package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.ParserCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

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
    public ParserCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ParserCommand(getName(), jMacroCore, scriptEngine);
    }
}
