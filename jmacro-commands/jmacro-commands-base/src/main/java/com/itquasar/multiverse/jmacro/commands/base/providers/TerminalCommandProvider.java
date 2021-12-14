package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.TerminalCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class TerminalCommandProvider implements CommandProvider<TerminalCommand> {

    @Override
    public String getName() {
        return "terminal";
    }

    @Override
    public Class<TerminalCommand> getCommandType() {
        return TerminalCommand.class;
    }

    @Override
    public TerminalCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new TerminalCommand(jMacroCore, scriptEngine);
    }

}
