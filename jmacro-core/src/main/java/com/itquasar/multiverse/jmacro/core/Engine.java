package com.itquasar.multiverse.jmacro.core;

import javax.script.ScriptException;

public interface Engine {
    Metadata execute(String filename, String location, String script) throws ScriptException;
}
