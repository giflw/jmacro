package com.itquasar.multiverse.jmacro.core.command;

import javax.script.ScriptContext;

public interface CommandProvider<C> {

    String getName();

    C getCommand(ScriptContext context);
}
