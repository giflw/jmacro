package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.EngineResult;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class ResultCommand<T, E extends Throwable> extends AbstractCommand implements EngineResult<T, E>, Constants {

    private T value;

    private E exception;

    private int exitCode = ExitException.OK;

    public ResultCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware);
    }

    public T value() {
        return this.value;
    }

    @Override
    public EngineResult<T, E> value(T value) {
        this.value = value;
        return this;
    }

    public T get() {
        return this.value();
    }

    public E exception() {
        return this.exception;
    }

    @Override
    public EngineResult<T, E> exception(E exception) {
        this.exception = exception;
        return this;
    }

    public int exitCode() {
        return this.exitCode;
    }

    @Override
    public EngineResult<T, E> exitCode(int exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public ResultCommand<T, E> ok(T value) {
        return this.ok(0, value);
    }

    public ResultCommand<T, E> ok(int exitCode, T value) {
        this.value = value;
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Groovy helper method
     *
     * @param value
     * @return
     */
    public ResultCommand<T, E> call(T value) {
        return this.ok(value);
    }

    public ResultCommand<T, E> call(int exitCode, T value) {
        return this.ok(exitCode, value);
    }

    public ResultCommand<T, E> call(E exception) {
        return this.error(exception);
    }

    public ResultCommand<T, E> call(int exitCode, E exception) {
        return this.error(exitCode, exception);
    }

    /**
     * Scala helper method
     *
     * @param value
     * @return
     */
    // FIXME use groovy redirect or some kind of interface/abstract class?
    public ResultCommand<T, E> apply(T value) {
        return this.ok(value);
    }
    // FIXME use groovy redirect or some kind of interface/abstract class?
    public ResultCommand<T, E> apply(E exception) {
        return this.error(exception);
    }

    /**
     * Kotlin/Ruby helper method
     *
     * @param value
     * @return
     */
    // FIXME use groovy redirect or some kind of interface/abstract class?
    public ResultCommand<T, E> invoke(T value) {
        return this.ok(value);
    }
    // FIXME use groovy redirect or some kind of interface/abstract class?
    public ResultCommand<T, E> invoke(E exception) {
        return this.error(exception);
    }

    public ResultCommand<T, E> error(E exception) {
        return error(this.exitCode > 0 ? this.exitCode : ExitException.SCRIPT_ERROR, exception);
    }

    public ResultCommand<T, E> error(int exitCode, E exception) {
        this.exception = exception;
        this.exitCode = exitCode;
        return this;
    }

    @Override
    public String toString() {
        return "[Result] Exit code: " + exitCode + " | Value: " + value + " | Excption: " + exception;
    }
}
