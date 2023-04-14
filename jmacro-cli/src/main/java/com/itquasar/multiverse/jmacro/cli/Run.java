package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.script.Metadata;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import picocli.CommandLine;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.util.*;
import java.util.concurrent.Callable;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


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
    @Parameters(arity = "0..1", description = "Script path to run")
    private String scriptPath;

    @Option(names = {"--default-script", "--ds"}, description = "Default script to run if no selection provided")
    public String defaultScriptPath;

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

    @Override
    public CliResult call() throws Exception {
        if (cli.isDebug()) {
            System.out.println("Changing root log level to DEBUG if needed...");
            Logger rootLogger = LoggerContext.getContext().getRootLogger();
            if (rootLogger.getLevel().isMoreSpecificThan(Level.DEBUG)) {
                rootLogger.setLevel(Level.DEBUG);
            }
            System.out.println("Root log level is " + rootLogger.getLevel().name());
            System.out.println(cli.getCore().getConfiguration().serialize());
            cli.getCore().getConfiguration().getRepository().getRepositories().forEach((repo) -> {
                System.out.println(repo.getId() + ":" + repo.getUri());
                repo.list().forEach(script -> {
                    System.out.println(" - " + repo.pathToLocation(script.getPath()));
                });
            });
        }

        this.defaultScriptPath = checkMainAndExtension(this.defaultScriptPath);
        this.scriptPath = checkMainAndExtension(this.scriptPath);

        Optional<Script> script;
        if (scriptPath != null) {
            script = cli.getCore().getConfiguration().getRepository().get(scriptPath);
        } else {
            List<Script> scripts = cli.getCore().getConfiguration().getRepository().listMain();
            System.out.println("Listing available scripts:");
            String padding = "";
            while (padding.length() < scripts.size()) {
                padding += " ";
            }
            Script defaultScript = null;
            for (int i = 0; i < scripts.size(); i++) {
                String idx = padding + (i + 1);
                idx = idx.substring(idx.length() - padding.length());
                Script _script = scripts.get(i);
                if (_script.getPath().equals(this.defaultScriptPath)) {
                    defaultScript = _script;
                }

                String name = _script.getMetadata().getName();
                String description = _script.getMetadata().getDescription();
                System.out.println("  " + idx + " ) " + name + (description.isEmpty() ? "" : " -> " + description));
            }

            System.out.println(" " + padding + "x ) Exit");
            String selectMessage = "Select script to run or exit";
            if (defaultScript != null) {
                selectMessage += " [default: " + defaultScript.getMetadata().getName() + "]";
            } else {
                selectMessage += " [default: exit]";
            }
            System.out.println(selectMessage + ":");

            String scriptIndex = System.console().readLine();
            scriptIndex = scriptIndex == null ? "" : scriptIndex;
            if ("x".equalsIgnoreCase(scriptIndex) || (scriptIndex.isEmpty() && defaultScript == null)) {
                System.out.println("Exiting...");
                return new CliResult(new ScriptResult(new Script(Metadata.EMPTY, "", "", ""), 0, null, null));
            } else if (scriptIndex != null && !scriptIndex.isEmpty()) {
                script = Optional.of(scripts.get(Integer.valueOf(scriptIndex) - 1));
            } else {
                script = Optional.ofNullable(defaultScript);
            }
            var metadata = script.get().getMetadata();
            System.out.println("Selected script: " + metadata.getName() + (metadata.getDescription().isEmpty() ? "" : " -> " + metadata.getDescription()));
            Thread.sleep(1000);
        }

        if (script.isPresent()) {
            if (args != null && args.size() > 0) {
                args.set(0, script.get().getLocation().toString());
            }
            List<String> args = this.args != null ? Collections.unmodifiableList(this.args) : Collections.emptyList();
            ScriptResult scriptResult = cli.getCore().getEngine().execute(
                script.get(),
                args,
                scriptEngine -> {
                    Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
                    CredentialsCommand bindedCredentials = (CredentialsCommand) bindings.get("credentials");
                    bindedCredentials.fill(credentials);
                    ConfigurationCommand bindedConfiguration = (ConfigurationCommand) bindings.get("configuration");
                    bindedConfiguration.fill(configuration);
                }
            );
            return new CliResult(scriptResult);
        }
        throw new Exception("Script " + this.scriptPath + " not found on configured repositories!");
    }

    private String checkMainAndExtension(String path) {
        return path == null || path.matches(".*(?!\\.main)\\.(?<ext>[a-zA-Z0-9]+)") ? path : path + ".main.groovy";
    }
}
