package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.configuration.Credentials;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import java.util.Objects;

import static com.itquasar.multiverse.jmacro.core.interfaces.Constants.SCRIPT_ENGINE_AWARE_KEY;

public record ScriptEngineAware(
    ScriptEngine scriptEngine,
    Logger logger,
    ScriptConfiguration configuration,
    Credentials credentials,
    ScriptUI ui
) {

    public static ScriptEngineAware of(Bindings globalScope, ScriptEngine engine, Logger scriptLogger) {
        Objects.requireNonNull(scriptLogger, "Script logger must be not null");
        return (ScriptEngineAware) globalScope.computeIfAbsent(SCRIPT_ENGINE_AWARE_KEY, (k) -> new ScriptEngineAware(
            engine, scriptLogger, new ScriptConfiguration(scriptLogger), new Credentials(), ScriptUI.get()
        ));
    }
}
