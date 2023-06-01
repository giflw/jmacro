package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

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
    public CredentialsCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new CredentialsCommand(getName(), core, scriptEngine);
    }
}
