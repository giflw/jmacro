package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class RaiseCommandProvider implements CommandProvider<RaiseCommandProvider.Raise> {

    @Override
    public String getName() {
        return "raise";
    }

    @Override
    public Class<Raise> getCommandType() {
        return Raise.class;
    }

    @Override
    public Raise getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Raise();
    }

    public static class Raise {

        void call(String message) {
            throw new JMacroException(message);
        }

    }

}
