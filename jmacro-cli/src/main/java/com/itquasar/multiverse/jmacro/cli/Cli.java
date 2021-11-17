package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.Callable;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.ScopeType.INHERIT;


@Getter
@ToString
@Command(
    name = "jmacro-cli",
    description = "JMacro command line client",
    scope = INHERIT,
    showAtFileInUsageHelp = true,
    mixinStandardHelpOptions = true,
    version = "1.0",
    subcommands = {
        Run.class
    }
)
public class Cli {

    private final JMacroCore core;

    public Cli(JMacroCore core) {
        this.core = core;
    }

    @Option(names = {"-d", "--debug"}, description = "Debug mode")
    private boolean debug;

}
