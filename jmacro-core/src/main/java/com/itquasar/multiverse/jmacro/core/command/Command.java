package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;

interface Command {

    String getName();

    Core getCore();

    ScriptEngine getScriptEngine();

    ScriptContext getContext();

    Bindings getBindings();

    Logger getScriptLogger();

    default Object propertyMissing(String name) {
        return CommandUtils.propertyMissingOn(this.getBindings(), name);
    }

}
