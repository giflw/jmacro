package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import picocli.CommandLine;

public class Launcher {


    public static void main(String[] args) {
        var core = new JMacroCore();
        core.start();

        CommandLine commandLine = null;
        int exitCode = 0;
        try {
            commandLine = new CommandLine(new Cli(new JMacroCore()));

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
