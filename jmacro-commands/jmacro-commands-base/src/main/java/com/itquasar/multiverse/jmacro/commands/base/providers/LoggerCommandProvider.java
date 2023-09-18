package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.Command;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

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
    public WrappingCommand<Logger> getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new WrappingCommand<>(Command::getScriptLogger, getName(), core, scriptEngineAware, false);
    }

}
