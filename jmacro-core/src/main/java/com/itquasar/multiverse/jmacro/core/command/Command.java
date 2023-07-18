package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;

public interface Command {

    String getName();

    Core getCore();

    ScriptEngine getScriptEngine();

    ScriptContext getContext();

    Bindings getBindings();

    Logger getScriptLogger();

    default void allCommandsLoaded() {
        // called after registration and before allCommandsRegistered hook
    }

    default void allCommandsRegistered() {
        // called after command is registered
    }

    default Object propertyMissing(String name) {
        return CommandUtils.propertyMissingOn(this.getBindings(), name);
    }

    default Object methodMissing(String name, Object args) {
        return CommandUtils.callMethodAliasOrOnBindings(this, name, args);
    }

}
