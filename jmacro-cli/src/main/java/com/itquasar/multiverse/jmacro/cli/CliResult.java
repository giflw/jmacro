package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.script.ScriptResult;

public record CliResult(ScriptResult<?, ?> scriptResult) {

    public static final CliResult EMPTY_OK = new CliResult(ScriptResult.EMPTY_OK);
    public static final CliResult EMPTY_ERROR = new CliResult(ScriptResult.EMPTY_ERROR);

}
