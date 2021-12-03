package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.LibraryCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class LibraryCommandProvider implements CommandProvider<LibraryCommand> {

    @Override
    public Class<LibraryCommand> getCommandType() {
        return LibraryCommand.class;
    }

    @Override
    public LibraryCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new LibraryCommand(jMacroCore, scriptEngine);
    }
}
