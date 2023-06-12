package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.EngineResult;
import lombok.Data;

import java.util.Objects;

@Data
public class ScriptResult<T, E extends Throwable> {
    private Script script;
    private int exitCode;
    private T result;
    private E exception;

    public ScriptResult(Script script, EngineResult<T, E> engineResult) {
        Objects.requireNonNull(script);
        this.script = script;
        this.exitCode = engineResult.exitCode();
        this.result = engineResult.value();
        this.exception = engineResult.exception();
    }
}
