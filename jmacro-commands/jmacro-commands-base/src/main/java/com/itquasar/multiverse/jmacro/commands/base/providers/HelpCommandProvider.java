package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.HelpCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

// FIXME shouldnt have a "catch" block ???
public class HelpCommandProvider implements CommandProvider<HelpCommand> {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public Class<HelpCommand> getCommandType() {
        return HelpCommand.class;
    }

    @Override
    public HelpCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new HelpCommand(getName(), core, scriptEngineAware);
    }
}
