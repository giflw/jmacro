package com.itquasar.multiverse.jmacro.core.script;

import java.util.Objects;

public record ScriptResult<T>(Script script, ValueHolder<T> result, T evalResult) {
    public ScriptResult {
        Objects.requireNonNull(script);
    }
}
