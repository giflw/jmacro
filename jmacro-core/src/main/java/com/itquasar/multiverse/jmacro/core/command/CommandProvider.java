package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.JMacroCore;

import javax.script.ScriptEngine;

public interface CommandProvider<C> {

    String getName();

    C getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine);
}
