package com.itquasar.multiverse.jmacro.core.script;

import lombok.Data;

import java.util.Objects;

@Data
public class ScriptResult<T> {

    private Script script;
    private int exitCode;
    private ValueHolder<T> result;
    private T evalResult;

    public ScriptResult(Script script, int exitCode, ValueHolder<T> result, T evalResult) {
        Objects.requireNonNull(script);
        this.script = script;
        this.exitCode = exitCode;
        this.result = result;
        this.evalResult = evalResult;
    }
}
