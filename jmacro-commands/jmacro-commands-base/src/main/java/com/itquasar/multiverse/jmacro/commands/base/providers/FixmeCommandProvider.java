package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

@Log4j2
public class FixmeCommandProvider implements CommandProvider<FixmeCommandProvider.Fixme> {

    @Override
    public String getName() {
        return "fixme";
    }

    @Override
    public Fixme getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Fixme();
    }

    public static class Fixme {

        void call(String message) {
            throw new JMacroException("FIXME: " + message);
        }

    }

}
