package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.SystemCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class SystemCommandProvider implements CommandProvider<SystemCommand> {

    @Override
    public String getName() {
        return "system";
    }

    @Override
    public Class<SystemCommand> getCommandType() {
        return SystemCommand.class;
    }

    @Override
    public SystemCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new SystemCommand(getName(), core, scriptEngineAware);
    }
}
