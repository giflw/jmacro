package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.FileCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class FileCommandProvider implements CommandProvider<FileCommand> {

    @Override
    public Class<FileCommand> getCommandType() {
        return FileCommand.class;
    }

    @Override
    public FileCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new FileCommand(jMacroCore, scriptEngine);
    }
}
