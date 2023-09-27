package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.util.IOUtils;

public class UtilsCommandProvider implements CommandProvider<UtilsCommandProvider.UtilsCommand> {

    @Override
    public Class<UtilsCommand> getCommandType() {
        return UtilsCommand.class;
    }

    @Override
    public UtilsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new UtilsCommand(core, scriptEngineAware);
    }

    public static class UtilsCommand extends AbstractCommand {

        public UtilsCommand(Core core, ScriptEngineAware scriptEngineAware) {
            super(core, scriptEngineAware);
        }

        IOUtils.Pipe pipe() {
            return IOUtils.pipe();
        }
    }

}
