package com.itquasar.multiverse.jmacro.shell;
/*
 * Copyright (c) 2002-2023, the original author(s).
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * https://opensource.org/licenses/BSD-3-Clause
 */

import com.itquasar.multiverse.jmacro.shell.repl.CustomCommands;
import com.itquasar.multiverse.jmacro.shell.repl.ReplSystemRegistry;
import org.jline.builtins.ConfigurationPath;
import org.jline.builtins.SyntaxHighlighter;
import org.jline.console.ConsoleEngine;
import org.jline.console.Printer;
import org.jline.console.impl.Builtins;
import org.jline.console.impl.ConsoleEngineImpl;
import org.jline.console.impl.DefaultPrinter;
import org.jline.console.impl.SystemHighlighter;
import org.jline.keymap.KeyMap;
import org.jline.reader.*;
import org.jline.reader.LineReader.Option;
import org.jline.reader.impl.DefaultParser;
import org.jline.reader.impl.DefaultParser.Bracket;
import org.jline.terminal.Size;
import org.jline.terminal.Terminal;
import org.jline.terminal.Terminal.Signal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.OSUtils;
import org.jline.widget.TailTipWidgets;
import org.jline.widget.TailTipWidgets.TipType;
import org.jline.widget.Widgets;

import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.function.Supplier;

import static org.jline.builtins.SyntaxHighlighter.DEFAULT_NANORC_FILE;
import static org.jline.console.ConsoleEngine.VAR_NANORC;

/**
 * Demo how to create REPL app with JLine.
 *
 * @author <a href="mailto:matti.rintanikkola@gmail.com">Matti Rinta-Nikkola</a>
 */
public class Repl {

    public static void main(String[] args) {
        try {
            Supplier<Path> workDir = () -> Paths.get(System.getProperty("user.dir"));
            //
            // Parser & Terminal
            //
            DefaultParser parser = new DefaultParser();
            parser.setEofOnUnclosedBracket(Bracket.CURLY, Bracket.ROUND, Bracket.SQUARE);
            parser.setEofOnUnclosedQuote(true);
            parser.setRegexCommand("[:]{0,1}[a-zA-Z!]{1,}\\S*"); // change default regex to support shell commands
            parser.blockCommentDelims(new DefaultParser.BlockCommentDelims("/*", "*/"))
                .lineCommentDelims(new String[]{"//"});
            Terminal terminal = TerminalBuilder.builder().build();
            if (terminal.getWidth() == 0 || terminal.getHeight() == 0) {
                terminal.setSize(new Size(120, 40)); // hard coded terminal size when redirecting
            }
            Thread executeThread = Thread.currentThread();
            terminal.handle(Signal.INT, signal -> executeThread.interrupt());
            //
            // Create jnanorc config file for demo
            //
            File file = new File(Repl.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .toURI()
                .getPath());
            String root = file.getCanonicalPath()
                .replace("classes", "")
                .replaceAll("\\\\", "/"); // forward slashes works better also in windows!
            File jnanorcFile = Paths.get(root, DEFAULT_NANORC_FILE).toFile();
            if (!jnanorcFile.exists()) {
                try (FileWriter fw = new FileWriter(jnanorcFile)) {
                    fw.write("theme " + root + "nanorc/dark.nanorctheme\n");
                    fw.write("include " + root + "nanorc/*.nanorc\n");
                }
            }
            //
            // ScriptEngine and command registries
            //
            JLineScriptEngine scriptEngine = new JLineScriptEngine(new ScriptEngineManager().getEngineByExtension("groovy"));
            scriptEngine.put("ROOT", root);
            // FIXME set usefull app and user config
            ConfigurationPath configPath = new ConfigurationPath(Paths.get(root), Paths.get(root));
            Printer printer = new DefaultPrinter(scriptEngine, configPath);
            ConsoleEngineImpl consoleEngine = new ConsoleEngineImpl(scriptEngine, printer, workDir, configPath);
            Builtins builtins = new Builtins(
                workDir, configPath, (String fun) -> new ConsoleEngine.WidgetCreator(consoleEngine, fun));
            CustomCommands myCommands = new CustomCommands(workDir);
            ReplSystemRegistry systemRegistry = new ReplSystemRegistry(parser, terminal, workDir, configPath);
            systemRegistry.setCommandRegistries(consoleEngine, builtins, myCommands);
            // FIXME
            // systemRegistry.addCompleter(scriptEngine.getScriptCompleter());
            // FIXME
            //systemRegistry.setScriptDescription(scriptEngine::scriptDescription);
            //
            // Command line highlighter
            //
            Path jnanorc = configPath.getConfig(DEFAULT_NANORC_FILE);
            scriptEngine.put(VAR_NANORC, jnanorc.toString());
            SyntaxHighlighter commandHighlighter = SyntaxHighlighter.build(jnanorc, "COMMAND");
            SyntaxHighlighter argsHighlighter = SyntaxHighlighter.build(jnanorc, "ARGS");
            SyntaxHighlighter groovyHighlighter = SyntaxHighlighter.build(jnanorc, "Groovy");
            SystemHighlighter highlighter = new SystemHighlighter(commandHighlighter, argsHighlighter, groovyHighlighter);
            if (!OSUtils.IS_WINDOWS) {
                highlighter.setSpecificHighlighter("!", SyntaxHighlighter.build(jnanorc, "SH-REPL"));
            }
            highlighter.addFileHighlight("nano", "less", "slurp");
            highlighter.addFileHighlight("groovy", "classloader", Arrays.asList("-a", "--add"));
            highlighter.addExternalHighlighterRefresh(printer::refresh);
            // FIXME
            //highlighter.addExternalHighlighterRefresh(scriptEngine::refresh);
            //
            // LineReader
            //
            LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(systemRegistry.completer())
                .parser(parser)
                .highlighter(highlighter)
                .variable(LineReader.SECONDARY_PROMPT_PATTERN, "%M%P > ")
                .variable(LineReader.INDENTATION, 2)
                .variable(LineReader.LIST_MAX, 100)
                .variable(LineReader.HISTORY_FILE, Paths.get(root, "history"))
                .option(Option.INSERT_BRACKET, true)
                .option(Option.EMPTY_WORD_OPTIONS, false)
                .option(Option.USE_FORWARD_SLASH, true) // use forward slash in directory separator
                .option(Option.DISABLE_EVENT_EXPANSION, true)
                .build();
            if (OSUtils.IS_WINDOWS) {
                reader.setVariable(
                    LineReader.BLINK_MATCHING_PAREN, 0); // if enabled cursor remains in begin parenthesis (gitbash)
            }
            //
            // complete command registries
            //
            consoleEngine.setLineReader(reader);
            builtins.setLineReader(reader);
            myCommands.setLineReader(reader);
            //
            // widgets and console initialization
            //
            new TailTipWidgets(reader, systemRegistry::commandDescription, 5, TipType.COMPLETER);
            KeyMap<Binding> keyMap = reader.getKeyMaps().get("main");
            keyMap.bind(new Reference(Widgets.TAILTIP_TOGGLE), KeyMap.alt("s"));
            systemRegistry.initialize(Paths.get(root, "init.jline").toFile());
            //
            // REPL-loop
            //
            System.out.println(terminal.getName() + ": " + terminal.getType());
            while (true) {
                try {
                    systemRegistry.cleanUp(); // delete temporary variables and reset output streams
                    String line = reader.readLine("repl> ");
                    line = parser.getCommand(line).startsWith("!") ? line.replaceFirst("!", "! ") : line;
                    Object result = systemRegistry.execute(line);
                    consoleEngine.println(result);
                } catch (UserInterruptException e) {
                    // Ignore
                } catch (EndOfFileException e) {
                    String pl = e.getPartialLine();
                    if (pl != null) { // execute last line from redirected file (required for Windows)
                        try {
                            consoleEngine.println(systemRegistry.execute(pl));
                        } catch (Exception e2) {
                            systemRegistry.trace(e2);
                        }
                    }
                    break;
                } catch (Exception | Error e) {
                    systemRegistry.trace(e); // print exception and save it to console variable
                }
            }
            systemRegistry.close(); // persist pipeline completer names etc

            Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
            boolean groovyRunning = false; // check Groovy GUI apps
            for (Thread t : threadSet) {
                if (t.getName().startsWith("AWT-Shut")) {
                    groovyRunning = true;
                    break;
                }
            }
            if (groovyRunning) {
                consoleEngine.println("Please, close Groovy Consoles/Object Browsers!");
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
