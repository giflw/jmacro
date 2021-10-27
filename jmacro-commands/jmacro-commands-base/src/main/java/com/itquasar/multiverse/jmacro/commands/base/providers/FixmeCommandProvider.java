package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class FixmeCommandProvider implements CommandProvider<FixmeCommandProvider.Fixme> {

    @Override
    public String getName() {
        return "fixme";
    }

    @Override
    public Fixme getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Fixme();
    }

    public static class Fixme {

        void call(String message) {
            throw new JMacroException("FIXME: " + message);
        }

    }

}
