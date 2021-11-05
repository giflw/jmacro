package com.itquasar.multiverse.jmacro.commands.io.providers;

import com.itquasar.multiverse.jmacro.commands.io.commands.Request;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class RequestCommandProvider implements CommandProvider<Request> {

    @Override
    public Class<Request> getCommandType() {
        return Request.class;
    }

    @Override
    public Request getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Request(scriptEngine);
    }
}
