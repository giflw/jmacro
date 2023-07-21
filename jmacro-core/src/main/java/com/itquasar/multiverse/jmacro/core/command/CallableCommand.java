package com.itquasar.multiverse.jmacro.core.command;

public interface CallableCommand <IN, OUT> extends Command {

    OUT call(IN in);
}
