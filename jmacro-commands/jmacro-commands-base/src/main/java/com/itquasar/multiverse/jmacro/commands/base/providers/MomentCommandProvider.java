package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.MomentCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class MomentCommandProvider implements CommandProvider<MomentCommand> {

    @Override
    public String getName() {
        return "moment";
    }

    @Override
    public Class<MomentCommand> getCommandType() {
        return MomentCommand.class;
    }

    @Override
    public MomentCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new MomentCommand(getName(), core, scriptEngineAware);
    }
}
