package com.itquasar.multiverse.jmacro.installer;

import picocli.CommandLine;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;


public class Launcher implements Constants {

    private final static Logger LOGGER = LoggerFactory.getLogger(Launcher.class);

    public static void main(String... args) throws IOException {
        System.setProperty(APP_PID, String.valueOf(ProcessHandle.current().pid()));
        System.setProperty(APP_STARTTIME, String.valueOf(System.currentTimeMillis()));

        LOGGER.info("app.home = " + System.getProperty(APP_HOME));
        LOGGER.info("app.pid  = " + System.getProperty(APP_PID));
        LOGGER.info("logfile  = " + System.getProperty(APP_LOGFILE));

        LOGGER.warning("INSTALLER ARGS: " + Arrays.toString(args));

        int exitCode = 0;
        try {
            CommandLine commandLine = new CommandLine(new Cli());

            exitCode = commandLine.execute(args);

            CliResult cliResult = commandLine.getExecutionResult();

            if ((exitCode == 0) && (cliResult != null) && (!cliResult.success())) {
                exitCode = CommandLine.ExitCode.SOFTWARE;
            }
        } finally {
            LOGGER.warning("End execution");
        }
        System.exit(exitCode);
    }


}
