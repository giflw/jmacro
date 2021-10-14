package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

@Log4j2
public class ExitCommandProvider implements CommandProvider<ExitCommandProvider.Exit> {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public Exit getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext context) {
        return new Exit();
    }

    public static class Exit {

        void call() {
            System.exit(0);
        }

        void call(int code) {
            System.exit(code);
        }

    }

}
