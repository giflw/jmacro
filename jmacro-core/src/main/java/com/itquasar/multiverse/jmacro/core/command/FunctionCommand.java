package com.itquasar.multiverse.jmacro.core.command;

import java.util.function.Function;

public interface FunctionCommand<T, U> extends CallableCommand<Function<T, U>, U> {

    @Override
    U call(Function<T, U> function);
}
