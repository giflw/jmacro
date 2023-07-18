package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.ZipCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class ZipCommandProvider implements CommandProvider<ZipCommand> {

    @Override
    public String getName() {
        return "zip";
    }

    @Override
    public Class<ZipCommand> getCommandType() {
        return ZipCommand.class;
    }

    @Override
    public ZipCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new ZipCommand(getName(), core, scriptEngine);
    }

}
