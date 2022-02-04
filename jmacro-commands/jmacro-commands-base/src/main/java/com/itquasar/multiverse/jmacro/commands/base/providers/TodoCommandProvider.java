package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class TodoCommandProvider implements CommandProvider<TodoCommandProvider.TodoCommand> {

    @Override
    public String getName() {
        return "todo";
    }

    @Override
    public Class<TodoCommand> getCommandType() {
        return TodoCommand.class;
    }

    @Override
    public TodoCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new TodoCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class TodoCommand extends Command {

        public TodoCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        void call() {
            this.call("");
        }

        void call(String message) {
            throw new JMacroException("TODO: " + message);
        }
    }

}
