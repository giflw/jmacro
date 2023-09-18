package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.engine.EngineResult;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import lombok.Data;

import java.util.Objects;

@Data
public class ScriptResult<T, E extends Throwable> {

    public static ScriptResult<String, ?> EMPTY_OK = new ScriptResult<>(Script.EMPTY, EngineResult.OK);

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
