package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import org.apache.logging.log4j.LogManager;
import picocli.CommandLine;

import java.util.Arrays;

public class Launcher {

    public static void main(String... args) {
        System.setProperty("app.pid", String.valueOf(ProcessHandle.current().pid()));
        System.setProperty("app.startime", String.valueOf(System.currentTimeMillis()));

        LogManager.getLogger(Launcher.class).warn("ARGS: " + Arrays.toString(args).replaceAll("password=[\\w]*,", "password=********"));

        var core = new JMacroCore();
        core.start();

        int exitCode = 0;
        try {
            CommandLine commandLine = new CommandLine(new Cli(core));

            exitCode = commandLine.execute(args);

            CliResult cliResult = commandLine.getExecutionResult();

            if ((exitCode == 0) && (cliResult != null) && (cliResult.scriptResult() != null)) {
                exitCode = cliResult.scriptResult().getExitCode();
            }
        } finally {
            core.stop();
        }
        System.exit(exitCode);
    }
}
