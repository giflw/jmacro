package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.LDAPCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

public class LDAPommandProvider implements CommandProvider<LDAPCommand> {

    @Override
    public String getName() {
        return "ldap";
    }

    @Override
    public Class<LDAPCommand> getCommandType() {
        return LDAPCommand.class;
    }

    @Override
    public LDAPCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new LDAPCommand(getName(), core, scriptEngine);
    }
}
