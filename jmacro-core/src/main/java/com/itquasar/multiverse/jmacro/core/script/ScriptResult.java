package com.itquasar.multiverse.jmacro.core.script;

import lombok.Data;

import java.util.Objects;

@Data
public class ScriptResult<T> {

    private Script script;
    private ValueHolder<T> result;
    private T evalResult;

    public ScriptResult(Script script, ValueHolder<T> result, T evalResult) {
        Objects.requireNonNull(script);
        this.script = script;
        this.result = result;
        this.evalResult = evalResult;
    }
}
