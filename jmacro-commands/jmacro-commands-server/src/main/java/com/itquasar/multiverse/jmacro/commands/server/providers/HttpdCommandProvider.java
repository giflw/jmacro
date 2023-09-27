package com.itquasar.multiverse.jmacro.commands.server.providers;

import com.itquasar.multiverse.jmacro.commands.server.commands.HttpdCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class HttpdCommandProvider implements CommandProvider<HttpdCommand> {

    @Override
    public Class<HttpdCommand> getCommandType() {
        return HttpdCommand.class;
    }

    @Override
    public HttpdCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new HttpdCommand(core, scriptEngineAware);
    }

}
