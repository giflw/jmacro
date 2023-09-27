package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.Command;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("rawtypes")
public class LoggerCommandProvider implements CommandProvider<WrappingCommand> {

    @Override
    public Class<WrappingCommand> getCommandType() {
        return WrappingCommand.class;
    }

    @Override
    public WrappingCommand<Logger> getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new WrappingCommand<>(Command::getScriptLogger, core, scriptEngineAware, false);
    }

}
