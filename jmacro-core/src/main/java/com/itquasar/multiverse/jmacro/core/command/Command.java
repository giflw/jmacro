package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import java.util.Collection;
import java.util.Set;

public interface Command {

    String[] CALL_ALTERNATIVES = {"apply", "invoke"};

    String getName();

    default Set<String> getAlias() {
        return Set.of();
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

    default Object methodMissing(String name, Object args) {
        return CommandUtils.callMethodAliasOrOnBindings(this, name, args);
    }

}
