package com.itquasar.multiverse.jmacro.cli;

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
