package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;

import javax.script.ScriptEngine;

/**
 * Exits script, not Java Virtual Machine
 */
public class ExitCommandProvider implements CommandProvider<ExitCommandProvider.ExitCommand> {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public Class<ExitCommand> getCommandType() {
        return ExitCommand.class;
    }

    @Override
    public ExitCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ExitCommand(jMacroCore, scriptEngine);
    }

    public static class ExitCommand extends Command {

        public ExitCommand(JMacroCore core, ScriptEngine scriptEngine) {
            super(core, scriptEngine);
        }

        void call() {
            call(0);
        }

        void call(int code) {
            throw new ExitException(code);
        }

    }


}
