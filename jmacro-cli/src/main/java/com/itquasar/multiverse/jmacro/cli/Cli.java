package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import lombok.Getter;

import java.io.PrintStream;
import java.nio.file.Path;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.ScopeType.INHERIT;


@Getter
@Command(
    name = "jmacro-cli",
    description = "JMacro command line client",
    scope = INHERIT,
    showAtFileInUsageHelp = true,
    mixinStandardHelpOptions = true,
    subcommands = {
        Dumb.class,
        Run.class,
        Shell.class
    }
)
public class Cli {

    public static final PrintStream out = System.out;

    @Option(names = {"-d", "--debug"}, description = "Debug mode")
    private boolean debug;

    @Option(
        names = {"-C", "--config-path"},
        paramLabel = "CONFIG_PATH",
        description = "Configuration file path to be used. Can be set using JVM System Property jmacro.config or environment variable JMACRO_CONFIG"
    )
    private Path configPath;

    private Core core;

    public Core getCore() {
        if (core == null) {
            core = new Core(configPath);
            core.start();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> core.stop()));
        }
        return core;
    }

    @Override
    public String toString() {
        return "Cli{" +
            "debug=" + debug +
            ", configPath=" + configPath +
            ", core=" + core +
            '}';
    }
}
