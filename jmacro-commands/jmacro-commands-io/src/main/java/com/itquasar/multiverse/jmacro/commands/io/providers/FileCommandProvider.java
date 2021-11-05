package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.File;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class FileCommandProvider implements CommandProvider<File> {

    @Override
    public Class<File> getCommandType() {
        return File.class;
    }

    @Override
    public File getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new File();
    }
}
