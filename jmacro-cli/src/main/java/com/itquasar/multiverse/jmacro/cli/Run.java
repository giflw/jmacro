package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.Configuration;
import com.itquasar.multiverse.jmacro.commands.base.commands.Credentials;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import picocli.CommandLine;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static picocli.CommandLine.Command;
import static picocli.CommandLine.Model.CommandSpec;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.Parameters;
import static picocli.CommandLine.ParentCommand;
import static picocli.CommandLine.Spec;


@Command(
    name = "run",
    description = "Run given script",
    showEndOfOptionsDelimiterInUsageHelp = true
)
public class Run implements Callable<CliResult> {

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
            throw new CommandLine.ParameterException(spec.commandLine(),
                String.format("Duplicate key '%s' for values '%s' and '%s'.", key, existing, newValue));
        }
    }

    @Parameters(arity = "1")
    private String path;

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

        var script = cli.getCore().getConfiguration().getRepository().get(path);

        if (script.isPresent()) {
            ScriptResult scriptResult = cli.getCore().getEngine().execute(
                script.get(),
                this.args != null ? Collections.unmodifiableList(this.args) : Collections.emptyList(),
                scriptEngine -> {
                    Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
                    Credentials bindedCredentials = (Credentials) bindings.get("credentials");
                    bindedCredentials.fill(credentials);
                    Configuration bindedConfiguration = (Configuration) bindings.get("configuration");
                    bindedConfiguration.fill(configuration);
                }
            );
            return new CliResult(scriptResult);
        }
        throw new Exception("Script " + this.path + " not found on configured repositories!");
    }
}
