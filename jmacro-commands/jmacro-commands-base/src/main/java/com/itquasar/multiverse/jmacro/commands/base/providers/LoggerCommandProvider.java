package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.command.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;

@SuppressWarnings("rawtypes")
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
        return new WrappingCommand<>(AbstractCommand::getScriptLogger, getName(), core, scriptEngine, false);
    }

}
