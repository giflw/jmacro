package com.itquasar.multiverse.jmacro.core;

import javax.script.ScriptContext;

public interface CommandProvider<C> {

    String getName();

    C getCommand(ScriptContext context);
}
