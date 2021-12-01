package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public interface Engine {

    /**
     * Execute given {@link Script} and return its execution result wrapped on {@link ScriptResult}.
     *
     * @param script       {@link Script} to execute.
     * @param preExecHook  {@link Consumer} allowing access to {@link ScriptEngine} before script execution.
     * @param postExecHook {@link Consumer} allowing access to {@link ScriptEngine} after script execution.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    ScriptResult execute(Script script, List<String> args, Consumer<ScriptEngine> preExecHook, Consumer<ScriptEngine> postExecHook) throws ScriptException;

    /**
     * Execute given {@link Script} and return its execution result wrapped on {@link ScriptResult}.
     *
     * @param script       {@link Script} to execute.
     * @param preExecHook  {@link Consumer} allowing access to {@link ScriptEngine} before script execution.
     * @param postExecHook {@link Consumer} allowing access to {@link ScriptEngine} after script execution.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    default ScriptResult executeInclusion(Script script, Consumer<ScriptEngine> preExecHook, Consumer<ScriptEngine> postExecHook) throws ScriptException {
        return this.execute(script, Collections.emptyList(), preExecHook, postExecHook);
    }


    /**
     * Execute given {@link Script} and return its execution result wrapped on {@link ScriptResult}.
     *
     * @param script      {@link Script} to execute.
     * @param preExecHook {@link Consumer} allowing access to {@link ScriptEngine}.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    default ScriptResult execute(Script script, List<String> args, Consumer<ScriptEngine> preExecHook) throws ScriptException {
        return this.execute(script, args, preExecHook, (scriptEngine) -> { /* NO-OP */ });
    }

    /**
     * Execute script with no operation preExecHook.
     *
     * @param script {@link Script} to execute.
     * @param args   Script arguments {@link List}.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    default ScriptResult execute(Script script, List<String> args) throws ScriptException {
        return this.execute(script, Collections.emptyList(), (scriptEngine) -> { /* NO-OP */ });
    }

    /**
     * Execute script with no operation preExecHook.
     *
     * @param script {@link Script} to execute.
     * @return {@link ScriptResult} wrapped result.
     * @throws ScriptException if some error occurs.
     */
    default ScriptResult execute(Script script) throws ScriptException {
        return this.execute(script, Collections.emptyList());
    }

}
