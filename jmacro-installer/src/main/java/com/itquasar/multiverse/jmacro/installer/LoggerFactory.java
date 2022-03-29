package com.itquasar.multiverse.jmacro.installer;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerFactory implements Constants {

    static {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.INFO);
        Arrays.stream(rootLogger.getHandlers()).forEach(it -> {
            rootLogger.removeHandler(it);
        });

        var loggerFormatter = new ExtendedSimpleFormatter();

        var loggerConsoleHandler = new ConsoleHandler();
        loggerConsoleHandler.setFormatter(loggerFormatter);
        rootLogger.addHandler(loggerConsoleHandler);

        String logFile = System.getProperty(APP_LOGFILE);
        if (logFile == null) {
            logFile = Path.of(System.getProperty(APP_HOME), LOG_FILENAME).toString();
        }
        try {
            FileHandler loggerFileHandler = new FileHandler(logFile, false);
            loggerFileHandler.setFormatter(loggerFormatter);
            rootLogger.addHandler(loggerFileHandler);
        } catch (IOException e) {
            rootLogger.log(Level.SEVERE, "Error creating log file " + logFile, e);
        }
    }

    public static Logger getLogger(Class clazz) {
        return getLogger(clazz.getName());
    }

    public static Logger getLogger(String name) {
        return Logger.getLogger(name);
    }

}
