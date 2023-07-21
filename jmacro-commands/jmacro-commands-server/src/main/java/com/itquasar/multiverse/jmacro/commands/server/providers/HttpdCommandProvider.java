package com.itquasar.multiverse.jmacro.commands.server.providers;

import com.itquasar.multiverse.jmacro.commands.server.commands.HttpdCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

public class HttpdCommandProvider implements CommandProvider<HttpdCommand> {

    @Override
    public String getName() {
        return "httpd";
    }

    @Override
    public Class<HttpdCommand> getCommandType() {
        return HttpdCommand.class;
    }

    @Override
    public HttpdCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new HttpdCommand(getName(), core, scriptEngine);
    }

}
