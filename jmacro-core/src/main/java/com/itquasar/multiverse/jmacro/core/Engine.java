package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;

import javax.script.ScriptException;

public interface Engine {
    ScriptResult execute(Script script) throws ScriptException;
}
