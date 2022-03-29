package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.commands.base.commands.ConsoleCommand;
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.WrappingCommand;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.script.Metadata;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


@Command(
    name = "shell",
    description = "Open a shell to execute commands",
    showEndOfOptionsDelimiterInUsageHelp = true
)
public class Shell implements Callable<CliResult> {

    private final Map<String, String> configuration = new LinkedHashMap<>();
    private final Map<String, String> credentials = new LinkedHashMap<>();

    @Parameters()
    List<String> args;

    @Spec
    private CommandSpec spec; // injected by picocli

    @ParentCommand
    private Cli cli;

    @Option(names = {"--config", "--configuration"}, paramLabel = "KEY=VALUE")
    public void setConfiguration(Map<String, String> map) {
        for (String key : map.keySet()) {
            String newValue = map.get(key);
            validateUnique(key, newValue, configuration);
            configuration.put(key, newValue);
        }
    }

    @Option(names = {"--cred", "--credentials"}, paramLabel = "KEY=VALUE")
    public void setCredentials(Map<String, String> map) {
        for (String key : map.keySet()) {
            String newValue = map.get(key);
            validateUnique(key, newValue, credentials);
            credentials.put(key, newValue);
        }
    }

    private void validateUnique(String key, String newValue, Map<String, String> properties) {
        String existing = properties.get(key);
        if (existing != null && !existing.equals(newValue)) {
            throw new ParameterException(spec.commandLine(),
                String.format("Duplicate key '%s' for values '%s' and '%s'.", key, existing, newValue));
        }
    }

    @Override
    public CliResult call() throws Exception {
        if (cli.isDebug()) {
            System.out.println(cli.getCore().getConfiguration().serialize());
            cli.getCore().getConfiguration().getRepository().getRepositories().forEach((repo) -> {
                System.out.println(repo.getId() + ":" + repo.getUri());
                repo.list().forEach(script -> {
                    System.out.println(" - " + repo.pathToLocation(script.getPath()));
                });
            });
        }

        if (args != null && args.size() > 0) {
            args.set(0, "<<stdin>>");
        }
        List<String> args = this.args != null ? Collections.unmodifiableList(this.args) : Collections.emptyList();
        ScriptResult scriptResult = cli.getCore().getEngine().execute(
            new Script(Metadata.EMPTY, "stdin.groovy", "jvm://stdin.groovy", ""),
            args,
            scriptEngine -> {
                Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
                CredentialsCommand bindedCredentials = (CredentialsCommand) bindings.get("credentials");
                bindedCredentials.fill(credentials);
                ConfigurationCommand bindedConfiguration = (ConfigurationCommand) bindings.get("configuration");
                bindedConfiguration.fill(configuration);
            },
            scriptEngine -> {
                boolean run = true;
                ConsoleCommand console = (ConsoleCommand) scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).get("console");
                Logger logger = ((WrappingCommand) scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).get("logger")).getLogger();

                StringBuilder block = new StringBuilder();
                int opens = 0;
                String tab = "....";
                while (run) {
                    String line = null;
                    try {
                        StringBuilder tabs = new StringBuilder();
                        IntStream.range(0, opens).forEach(it -> tabs.append(tab));
                        line = console.read(tabs.toString() + "$");
                        if (line.trim().equals("exit()")) {
                            run = false;
                        } else {
                            block.append(line).append("\n");
                            if (line.matches(".*[({\\[]\\s*")) {
                                opens++;
                            } else if (line.matches(".*[)}\\]]\\s*")) {
                                opens--;
                            }
                            if (opens == 0) {
                                String script = block.toString();
                                block = new StringBuilder();
                                scriptEngine.eval(script, scriptEngine.getContext());
                            }
                        }
                    } catch (ExitException e) {
                        logger.info("Exiting");
                        break;
                    } catch (ScriptException e) {
                        logger.error(block, e);
                    }
                }
            }
        );
        return new CliResult(scriptResult);
    }
}
