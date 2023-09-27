package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.RequestCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class RequestCommandProvider implements CommandProvider<RequestCommand> {

    @Override
    public Class<RequestCommand> getCommandType() {
        return RequestCommand.class;
    }

    @Override
    public RequestCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new RequestCommand(core, scriptEngineAware);
    }
}
