package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.ScriptEngine;

public class TodoCommandProvider implements CommandProvider<TodoCommandProvider.Todo> {

    @Override
    public String getName() {
        return "todo";
    }

    @Override
    public Class<Todo> getCommandType() {
        return Todo.class;
    }

    @Override
    public Todo getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Todo();
    }

    public static class Todo {

        void call() {
            this.call("");
        }

        void call(String message) {
            throw new JMacroException("TODO: " + message);
        }
    }

}
