package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

@SuppressWarnings("rawtypes")
public class LoggerCommandProvider implements CommandProvider<WrappingCommand> {

    @Override
    public Class<WrappingCommand> getCommandType() {
        return WrappingCommand.class;
    }

    @Override
    public WrappingCommand<Logger> getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        Logger logger = scriptEngineAware.logger();
        Objects.requireNonNull(logger, "Logger must be not null");
        return new WrappingCommand<>(logger, core, scriptEngineAware);
    }

}
