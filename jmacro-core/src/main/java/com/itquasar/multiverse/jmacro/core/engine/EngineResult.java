package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

public interface EngineResult<T, E extends Throwable> {

    EngineResult<String, ?> OK = new OkEngineResult();

    EngineResult<String, Throwable> ERROR = new ErrorEngineResult();

    T value();

    EngineResult<T, E> value(T value);

    E exception();

    EngineResult<T, E> exception(E exception);

    int exitCode();

    EngineResult<T, E> exitCode(int exitCode);
}


class OkEngineResult implements EngineResult<String, Throwable> {
    @Override
    public String value() {
        return "ok";
    }

    @Override
    public EngineResult<String, Throwable> value(String value) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Throwable exception() {
        return null;
    }

    @Override
    public EngineResult<String, Throwable> exception(Throwable exception) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int exitCode() {
        return 0;
    }

    @Override
    public EngineResult<String, Throwable> exitCode(int exitCode) {
        throw new UnsupportedOperationException("Not implemented");
    }
}

class ErrorEngineResult implements EngineResult<String, Throwable> {
    @Override
    public String value() {
        return "error";
    }

    @Override
    public EngineResult<String, Throwable> value(String value) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Throwable exception() {
        return new JMacroException("error");
    }

    @Override
    public EngineResult<String, Throwable> exception(Throwable exception) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int exitCode() {
        return ExitException.USAGE;
    }

    @Override
    public EngineResult<String, Throwable> exitCode(int exitCode) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
