package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.FileCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class FileCommandProvider implements CommandProvider<FileCommand> {

    @Override
    public String getName() {
        return "file";
    }

    @Override
    public Class<FileCommand> getCommandType() {
        return FileCommand.class;
    }

    @Override
    public FileCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new FileCommand(getName(), core, scriptEngineAware);
    }
}
