package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

public class FixmeCommandProvider implements CommandProvider<FixmeCommandProvider.FixmeCommand> {

    @Override
    public Class<FixmeCommand> getCommandType() {
        return FixmeCommand.class;
    }

    @Override
    public FixmeCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new FixmeCommand(core, scriptEngineAware);
    }

    public static class FixmeCommand extends AbstractCommand {

        public FixmeCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        void call(String message) {
            throw new JMacroException("FIXME: " + message);
        }

    }

}
