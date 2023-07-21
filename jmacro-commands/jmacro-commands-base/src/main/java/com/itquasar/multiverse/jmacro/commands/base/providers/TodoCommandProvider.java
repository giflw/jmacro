package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
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
    public TodoCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new TodoCommand(getName(), core, scriptEngine);
    }

    public static class TodoCommand extends AbstractCommand {

        public TodoCommand(String name, Core core, ScriptEngine scriptEngine) {
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
