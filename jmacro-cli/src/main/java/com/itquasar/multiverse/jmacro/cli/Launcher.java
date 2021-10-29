package com.itquasar.multiverse.jmacro.cli;

import picocli.CommandLine;

public class Launcher {

    public static void main(String[] args) throws Exception {
        CommandLine commandLine = new CommandLine(new Cli());
        int exitCode = commandLine.execute("-p", "foo", "include.groovy", "-d");
        CliResult cliResult = commandLine.getExecutionResult();
        if (cliResult != null) {
            System.out.println(cliResult);
        }
        System.exit(exitCode);
    }
}
