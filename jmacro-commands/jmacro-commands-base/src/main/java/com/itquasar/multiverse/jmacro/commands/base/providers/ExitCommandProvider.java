package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;

import javax.script.ScriptEngine;

/**
 * Exits script, not Java Virtual Machine
 */
public class ExitCommandProvider implements CommandProvider<ExitCommandProvider.Exit> {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public Class<Exit> getCommandType() {
        return Exit.class;
    }

    @Override
    public Exit getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Exit();
    }

    public static class Exit {

        void call() {
            call(0);
        }

        void call(int code) {
            throw new ExitException(code);
        }

    }


}
