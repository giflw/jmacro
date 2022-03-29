package com.itquasar.multiverse.jmacro.installer;

import lombok.Getter;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.ScopeType.INHERIT;


@Getter
@Command(
    name = "jmacro-installer",
    description = "JMacro installer",
    scope = INHERIT,
    showAtFileInUsageHelp = true,
    mixinStandardHelpOptions = true,
    subcommands = {
        Update.class,
        Prepare.class
    }
)
public class Cli {

    @Option(names = {"-d", "--debug"}, description = "Debug mode")
    private boolean debug;

    public Cli() {
    }

}
