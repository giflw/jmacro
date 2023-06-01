package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;

public class LoggerCommandProvider implements CommandProvider<WrappingCommand> {

    @Override
    public String getName() {
        return "logger";
    }

    @Override
    public Class<WrappingCommand> getCommandType() {
        return WrappingCommand.class;
    }

    @Override
    public WrappingCommand<Logger> getCommand(Core core, ScriptEngine scriptEngine) {
        return new WrappingCommand<>(it -> it.getLogger(), getName(), core, scriptEngine, false);
    }

}
