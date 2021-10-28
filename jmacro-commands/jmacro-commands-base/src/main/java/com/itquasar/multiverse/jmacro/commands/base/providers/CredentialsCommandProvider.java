package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Credentials;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class CredentialsCommandProvider implements CommandProvider<Credentials> {

    @Override
    public String getName() {
        return "credentials";
    }

    @Override
    public Class<Credentials> getCommandType() {
        return Credentials.class;
    }

    @Override
    public Credentials getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Credentials();
    }
}
