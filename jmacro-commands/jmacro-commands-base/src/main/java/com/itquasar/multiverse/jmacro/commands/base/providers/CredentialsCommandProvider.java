package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class CredentialsCommandProvider implements CommandProvider<CredentialsCommand> {

    @Override
    public String getName() {
        return "credentials";
    }

    @Override
    public Class<CredentialsCommand> getCommandType() {
        return CredentialsCommand.class;
    }

    @Override
    public CredentialsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new CredentialsCommand(getName(), core, scriptEngineAware);
    }
}
