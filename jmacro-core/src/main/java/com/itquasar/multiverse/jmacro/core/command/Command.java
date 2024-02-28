package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public interface Command {

    String[] CALL_ALTERNATIVES = {"apply", "invoke"};

    static String nameOf(Class<? extends Command> command) {
        for (CommandName commandName : command.getAnnotationsByType(CommandName.class)) {
            return commandName.value();
        }
        String name = command.getSimpleName().replace("Command", "");
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    static Set<String> aliasesOf(Class<? extends Command> command) {
        CommandAlias[] aliases = command.getAnnotationsByType(CommandAlias.class);
        return Arrays.stream(aliases).map(CommandAlias::value).collect(Collectors.toSet());
    }

    default String getName() {
        return nameOf(this.getClass());
    }

    default Set<String> getAliases() {
        return aliasesOf(this.getClass());
    }

    Core getCore();

    ScriptEngineAware getScriptEngineAware();

    ScriptEngine getScriptEngine();

    ScriptContext getContext();

    Bindings getBindings();

    Logger getScriptLogger();

    default void allCommandsLoaded(Collection<? extends Command> commands) {
        // called after registration and before allCommandsRegistered hook
    }

    default void allCommandsRegistered(Collection<? extends Command> commands) {
        // called after command is registered
    }

    default Object propertyMissing(String name) {
        return CommandUtils.propertyMissingOn(this.getBindings(), name);
    }

}
