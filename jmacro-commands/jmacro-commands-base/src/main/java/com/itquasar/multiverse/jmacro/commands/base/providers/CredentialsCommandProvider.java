package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
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
    public CredentialsCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new CredentialsCommand(getName(), jMacroCore, scriptEngine);
    }
}
