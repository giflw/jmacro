package com.itquasar.multiverse.jmacro.cli;

import org.apache.logging.log4j.LogManager;
import picocli.CommandLine;

import java.util.Arrays;

public class Launcher {

    public static void main(String... args) {
        System.setProperty("app.pid", String.valueOf(ProcessHandle.current().pid()));
        System.setProperty("app.starttime", String.valueOf(System.currentTimeMillis()));

        LogManager.getLogger(Launcher.class).warn("PLATFORM ARGS: " + Arrays.toString(args).replaceAll("password=[\\w]*,", "password=********"));

        int exitCode = 0;
        CommandLine commandLine = new CommandLine(new Cli());
        exitCode = commandLine.execute(args);
        CliResult cliResult = commandLine.getExecutionResult();
        if ((exitCode == 0) && (cliResult != null) && (cliResult.scriptResult() != null)) {
            exitCode = cliResult.scriptResult().getExitCode();
        }
        System.exit(exitCode);
    }
}
