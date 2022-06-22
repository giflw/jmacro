package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import lombok.Getter;
import lombok.ToString;

import java.nio.file.Path;

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
    subcommands = {
        Dumb.class,
        Run.class,
        Shell.class
    }
)
public class Cli {

    @Option(names = {"-d", "--debug"}, description = "Debug mode")
    private boolean debug;

    @Option(
        names = {"-C", "--config-path"},
        paramLabel = "CONFIG_PATH",
        description = "Configuration file path to be used. Can be set using JVM System Property jmacro.config or environment variable JMACRO_CONFIG"
    )
    private Path configPath;

    private JMacroCore core;

    public JMacroCore getCore() {
        if (core == null) {
            core = new JMacroCore(configPath);
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
