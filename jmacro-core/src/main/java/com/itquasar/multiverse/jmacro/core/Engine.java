package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;

import javax.script.ScriptException;

public interface Engine {

    /**
     * Execute given {@link Script} and return its execution result wrapped on {@link ScriptResult}.
     *
     * @param script {@link Script} to execute.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    ScriptResult execute(Script script) throws ScriptException;

}
