package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

@Log4j2
public class RaiseCommandProvider implements CommandProvider<RaiseCommandProvider.Raise> {

    @Override
    public String getName() {
        return "raise";
    }

    @Override
    public Raise getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Raise();
    }

    public static class Raise {

        void call(String message) {
            throw new JMacroException(this, message);
        }

    }

}
