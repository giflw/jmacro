package com.itquasar.multiverse.jmacro.shell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;

public class Launcher {

    private static final Logger LOGGER = LogManager.getLogger(Launcher.class);

    public static void main(String[] args) throws IOException {
        Repl.main(args);
    }

    public void loop() throws IOException {
        Terminal terminal = TerminalBuilder.builder()
            .system(true)
            .build();
        try {
            LineReader lineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();
            JLineAppender.configure(lineReader);
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                LOGGER.info("Hello JLine World");
            }).start();
            LOGGER.info("Hello JLine World");
            String line = lineReader.readLine("JMacro> ");
            lineReader.printAbove("[ECHO] " + line);
        } finally {
            terminal.close();
        }
    }
}
