package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.util.IOUtils;

import javax.script.ScriptEngine;

public class UtilsCommandProvider implements CommandProvider<UtilsCommandProvider.UtilsCommand> {

    @Override
    public String getName() {
        return "utils";
    }

    @Override
    public Class<UtilsCommand> getCommandType() {
        return UtilsCommand.class;
    }

    @Override
    public UtilsCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new UtilsCommand(getName(), core, scriptEngineAware);
    }

    public static class UtilsCommand extends AbstractCommand {

        public UtilsCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
            super(name, core, scriptEngineAware);
        }

        IOUtils.Pipe pipe() {
            return IOUtils.pipe();
        }
    }

}
