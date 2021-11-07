package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Library;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class LibraryCommandProvider implements CommandProvider<Library> {
    @Override
    public Class<Library> getCommandType() {
        return Library.class;
    }

    @Override
    public Library getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Library(jMacroCore, scriptEngine);
    }
}
