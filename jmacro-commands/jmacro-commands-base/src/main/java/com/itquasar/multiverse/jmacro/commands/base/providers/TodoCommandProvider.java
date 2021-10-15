package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public class TodoCommandProvider implements CommandProvider<TodoCommandProvider.Todo> {

    @Override
    public String getName() {
        return "todo";
    }

    @Override
    public Todo getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext scriptContext) {
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
