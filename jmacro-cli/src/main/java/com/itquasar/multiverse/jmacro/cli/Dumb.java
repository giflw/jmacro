package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import picocli.CommandLine;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


@Command(
    name = "dumb",
    description = "Just output cli main command",
    showEndOfOptionsDelimiterInUsageHelp = true
)
public class Dumb implements Callable<CliResult> {

    @Spec
    private CommandSpec spec; // injected by picocli

    @ParentCommand
    private Cli cli;

    @Override
    public CliResult call() throws Exception {
        System.out.println(cli);
        return new CliResult(null);
    }
}
