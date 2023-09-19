package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.configuration.Credentials;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

import static com.itquasar.multiverse.jmacro.core.interfaces.Constants.SCRIPT_ENGINE_AWARE_KEY;

public record ScriptEngineAware(
    ScriptEngine scriptEngine,
    Logger logger,
    ScriptConfiguration configuration,
    Credentials credentials,
    ScriptUI ui
) {

    public static ScriptEngineAware of(Bindings globalScope, ScriptEngine engine, Logger scriptLogger) {
        ScriptEngineAware scriptEngineAware = (ScriptEngineAware) globalScope.get(SCRIPT_ENGINE_AWARE_KEY);
        scriptEngineAware = scriptEngineAware != null ? scriptEngineAware : new ScriptEngineAware(
            engine, scriptLogger, new ScriptConfiguration(scriptLogger), new Credentials(), ScriptUI.get()
        );
        globalScope.put(SCRIPT_ENGINE_AWARE_KEY, scriptEngineAware);
        return scriptEngineAware;
    }
}
