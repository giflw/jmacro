package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.RequestCommand;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class RequestCommandProvider implements CommandProvider<RequestCommand> {

    @Override
    public String getName() {
        return "request";
    }

    @Override
    public Class<RequestCommand> getCommandType() {
        return RequestCommand.class;
    }

    @Override
    public RequestCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new RequestCommand(getName(), core, scriptEngine);
    }
}
