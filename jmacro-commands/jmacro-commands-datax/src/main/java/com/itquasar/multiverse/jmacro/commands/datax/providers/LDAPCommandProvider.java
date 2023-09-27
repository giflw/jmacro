package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.LDAPCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class LDAPCommandProvider implements CommandProvider<LDAPCommand> {

    @Override
    public Class<LDAPCommand> getCommandType() {
        return LDAPCommand.class;
    }

    @Override
    public LDAPCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new LDAPCommand(core, scriptEngineAware);
    }
}
