package com.itquasar.multiverse.jmacro.shell.repl;

import org.jline.builtins.Completers;
import org.jline.builtins.Options;
import org.jline.console.CommandInput;
import org.jline.console.CommandMethods;
import org.jline.console.CommandRegistry;
import org.jline.console.impl.JlineCommandRegistry;
import org.jline.keymap.KeyMap;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.impl.LineReaderImpl;
import org.jline.reader.impl.completer.ArgumentCompleter;
import org.jline.reader.impl.completer.NullCompleter;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.utils.InfoCmp;
import org.jline.utils.OSUtils;

import java.nio.file.Path;
import java.util.*;
import java.util.function.Supplier;

public class CustomCommands extends JlineCommandRegistry implements CommandRegistry {
    private LineReader reader;
    private final Supplier<Path> workDir;

    public CustomCommands(Supplier<Path> workDir) {
        super();
        this.workDir = workDir;
        Map<String, CommandMethods> commandExecute = new HashMap<>();
        commandExecute.put("tput", new CommandMethods(this::tput, this::tputCompleter));
        commandExecute.put("testkey", new CommandMethods(this::testkey, this::defaultCompleter));
        commandExecute.put("clear", new CommandMethods(this::clear, this::defaultCompleter));
        commandExecute.put("echo", new CommandMethods(this::echo, this::defaultCompleter));
        commandExecute.put("!", new CommandMethods(this::shell, this::defaultCompleter));
        registerCommands(commandExecute);
    }

    public void setLineReader(LineReader reader) {
        this.reader = reader;
    }

    private Terminal terminal() {
        return reader.getTerminal();
    }

    private void tput(CommandInput input) {
        final String[] usage = {
            "tput -  put terminal capability",
            "Usage: tput [CAPABILITY]",
            "  -? --help                       Displays command help"
        };
        try {
            Options opt = parseOptions(usage, input.xargs());
            List<String> argv = opt.args();
            if (argv.size() > 0) {
                InfoCmp.Capability vcap = InfoCmp.Capability.byName(argv.get(0));
                if (vcap != null) {
                    terminal()
                        .puts(
                            vcap,
                            opt.argObjects().subList(1, argv.size()).toArray(new Object[0]));
                } else {
                    terminal().writer().println("Unknown capability");
                }
            } else {
                terminal().writer().println("Usage: tput [CAPABILITY]");
            }
        } catch (Exception e) {
            saveException(e);
        }
    }

    private void testkey(CommandInput input) {
        final String[] usage = {
            "testkey -  display the key events",
            "Usage: testkey",
            "  -? --help                       Displays command help"
        };
        try {
            parseOptions(usage, input.args());
            terminal().writer().write("Input the key event(Enter to complete): ");
            terminal().writer().flush();
            StringBuilder sb = new StringBuilder();
            while (true) {
                int c = ((LineReaderImpl) reader).readCharacter();
                if (c == 10 || c == 13) break;
                sb.append(new String(Character.toChars(c)));
            }
            terminal().writer().println(KeyMap.display(sb.toString()));
            terminal().writer().flush();
        } catch (Exception e) {
            saveException(e);
        }
    }

    private void clear(CommandInput input) {
        final String[] usage = {
            "clear -  clear terminal", "Usage: clear", "  -? --help                       Displays command help"
        };
        try {
            parseOptions(usage, input.args());
            terminal().puts(InfoCmp.Capability.clear_screen);
            terminal().flush();
        } catch (Exception e) {
            saveException(e);
        }
    }

    private void echo(CommandInput input) {
        final String[] usage = {
            "echo - echos a value",
            "Usage:  echo [-hV] <args>",
            "-? --help                        Displays command help",
            "-v --version                     Print version"
        };
        try {
            Options opt = parseOptions(usage, input.args());
            List<String> argv = opt.args();
            if (opt.isSet("version")) {
                terminal().writer().println("echo version: v0.1");
            } else if (opt.args().size() >= 1) {
                terminal().writer().println(String.join(" ", opt.args()));
            }
        } catch (Exception e) {
            saveException(e);
        }
    }

    private void executeCmnd(List<String> args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder();
        List<String> _args = new ArrayList<>();
        if (OSUtils.IS_WINDOWS) {
            _args.add("cmd.exe");
            _args.add("/c");
        } else {
            _args.add("sh");
            _args.add("-c");
        }
        _args.add(String.join(" ", args));
        builder.command(_args);
        builder.directory(workDir.get().toFile());
        Process process = builder.start();
        StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
        Thread th = new Thread(streamGobbler);
        th.start();
        int exitCode = process.waitFor();
        th.join();
        if (exitCode != 0) {
            streamGobbler = new StreamGobbler(process.getErrorStream(), System.out::println);
            th = new Thread(streamGobbler);
            th.start();
            th.join();
            throw new Exception("Error occurred in shell!");
        }
    }

    private void shell(CommandInput input) {
        final String[] usage = {
            "!<command> -  execute shell command",
            "Usage: !<command>",
            "  -? --help                       Displays command help"
        };
        if (input.args().length == 1 && (input.args()[0].equals("-?") || input.args()[0].equals("--help"))) {
            try {
                parseOptions(usage, input.args());
            } catch (Exception e) {
                saveException(e);
            }
        } else {
            List<String> argv = new ArrayList<>(Arrays.asList(input.args()));
            if (!argv.isEmpty()) {
                try {
                    executeCmnd(argv);
                } catch (Exception e) {
                    saveException(e);
                }
            }
        }
    }

    private Set<String> capabilities() {
        return InfoCmp.getCapabilitiesByName().keySet();
    }

    private List<Completer> tputCompleter(String command) {
        List<Completer> completers = new ArrayList<>();
        completers.add(new ArgumentCompleter(
            NullCompleter.INSTANCE,
            new Completers.OptionCompleter(new StringsCompleter(this::capabilities), this::commandOptions, 1)));
        return completers;
    }
}
