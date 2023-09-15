package com.itquasar.multiverse.jmacro.cli;

import jnr.constants.platform.Signal;
import jnr.posix.SignalHandler;
import jnr.posix.util.SunMiscSignal;
import org.apache.logging.log4j.LogManager;
import picocli.CommandLine;

import java.util.Arrays;

public class Launcher {

    static {
        SignalHandler handler = signalCode -> {
            Signal signal = Signal.valueOf(signalCode);
            System.out.println("Received signal " + signal.name() + " (" + signal.intValue() + "|" + signalCode + ")");
            System.exit(128 + signalCode);
        };
        for (Signal signal : new Signal[]{Signal.SIGINT, Signal.SIGTERM, Signal.SIGQUIT, Signal.SIGPIPE, Signal.SIGABRT, Signal.SIGIOT}) {
            try {
                SunMiscSignal.signal(signal, handler);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error registering signal handler for " + signal.name());
            }
        }
    }

    public static void main(String... args) {
        System.setProperty("app.pid", String.valueOf(ProcessHandle.current().pid()));
        System.setProperty("app.starttime", String.valueOf(System.currentTimeMillis()));

        LogManager.getLogger(Launcher.class).warn("PLATFORM ARGS: " + Arrays.toString(args).replaceAll("password=[\\w]*,", "password=********"));

        // TODO better subcommand selection
        CommandLine commandLine = new CommandLine(new Cli());
        int exitCode = commandLine.execute(args);
        CliResult cliResult = commandLine.getExecutionResult();
        if (cliResult == null) {
            CommandLine run = commandLine.getSubcommands().get("run");
            cliResult = run != null ? run.getExecutionResult() : null;
        }
        if ((exitCode == 0) && (cliResult != null) && (cliResult.scriptResult() != null)) {
            exitCode = cliResult.scriptResult().getExitCode();
        }
        System.exit(exitCode);
    }
}
