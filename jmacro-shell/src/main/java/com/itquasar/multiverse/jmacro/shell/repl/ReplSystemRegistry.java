package com.itquasar.multiverse.jmacro.shell.repl;

import org.jline.builtins.ConfigurationPath;
import org.jline.console.impl.SystemRegistryImpl;
import org.jline.reader.Parser;
import org.jline.terminal.Terminal;

import java.nio.file.Path;
import java.util.function.Supplier;

public class ReplSystemRegistry extends SystemRegistryImpl {
    public ReplSystemRegistry(Parser parser, Terminal terminal, Supplier<Path> workDir, ConfigurationPath configPath) {
        super(parser, terminal, workDir, configPath);
    }

    @Override
    public boolean isCommandOrScript(String command) {
        return command.startsWith("!") || super.isCommandOrScript(command);
    }
}
