package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConfigurationCommand;
import com.itquasar.multiverse.jmacro.commands.base.commands.CredentialsCommand;
import com.itquasar.multiverse.jmacro.core.engine.EngineResult;
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
    @Option(names = {"--default-script", "--ds"}, description = "Default script to run if no selection provided")
    public String defaultScriptPath;
    @Option(names = {"--main-infix", "--mi"}, description = "Main infxi to search for main scripts. Default is main as in script.main.groovy", defaultValue = "main")
    public String mainInfix;
    @Parameters()
    List<String> args;
    @Spec
    private CommandSpec spec; // injected by picocli
    @ParentCommand
    private Cli cli;
    @Parameters(arity = "0..1", description = "Script path to run")
    private String scriptPath;

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
            Cli.out.println("Changing root log level to DEBUG if needed...");
            Logger rootLogger = LoggerContext.getContext().getRootLogger();
            if (rootLogger.getLevel().isMoreSpecificThan(Level.DEBUG)) {
                rootLogger.setLevel(Level.DEBUG);
            }
            Cli.out.println("Root log level is " + rootLogger.getLevel().name());
            Cli.out.println(cli.getCore().getConfiguration().serialize());
            cli.getCore().getConfiguration().getRepository().getRepositories().forEach((repo) -> {
                Cli.out.println(repo.getId() + ":" + repo.getUri());
                repo.list().forEach(script -> {
                    Cli.out.println(" - " + repo.pathToLocation(script.getPath()));
                });
            });
        }

        this.defaultScriptPath = checkInfixAndExtension(this.defaultScriptPath);
        this.scriptPath = checkInfixAndExtension(this.scriptPath);

        Optional<Script> script;
        if (scriptPath != null) {
            script = cli.getCore().getConfiguration().getRepository().get(scriptPath);
        } else {
            List<Script> scripts = cli.getCore().getConfiguration().getRepository().listMain(mainInfix);
            Cli.out.println("Listing available scripts:");
            StringBuilder padding = new StringBuilder();
            while (padding.length() < scripts.size()) {
                padding.append(" ");
            }
            Script defaultScript = null;
            for (int i = 0; i < scripts.size(); i++) {
                String idx = padding.toString() + (i + 1);
                idx = idx.substring(idx.length() - padding.length());
                Script _script = scripts.get(i);
                if (_script.getPath().equals(this.defaultScriptPath)) {
                    defaultScript = _script;
                }

                String name = _script.getMetadata().getName();
                String description = _script.getMetadata().getDescription();
                Cli.out.println("  " + idx + " ) " + name + (description.isEmpty() ? "" : " -> " + description));
                Cli.out.println("            [" + _script.getRepository() + "] " + _script.getLocation());
            }

            Cli.out.println(" " + padding + "x ) Exit");


            String scriptIndex = null;
            while (scriptIndex == null || (scriptIndex.isEmpty() && defaultScript == null)) {
                String selectMessage = "Select script to run or exit";
                if (defaultScript != null) {
                    selectMessage += " [default: " + defaultScript.getMetadata().getName() + "]";
                }
                Cli.out.print(selectMessage + ": ");

                scriptIndex = System.console().readLine();
                scriptIndex = scriptIndex == null ? "" : scriptIndex.trim();
            }

            if ("x".equalsIgnoreCase(scriptIndex) || (scriptIndex.isEmpty() && defaultScript == null)) {
                Cli.out.println("Exiting...");
                return new CliResult(new ScriptResult(new Script(Metadata.EMPTY, "", "", "", ""), EngineResult.OK));
            } else if (scriptIndex != null && !scriptIndex.isEmpty()) {
                script = Optional.of(scripts.get(Integer.valueOf(scriptIndex) - 1));
            } else {
                script = Optional.ofNullable(defaultScript);
            }
            var metadata = script.get().getMetadata();
            Cli.out.println("Selected script: " + metadata.getName() + (metadata.getDescription().isEmpty() ? "" : " -> " + metadata.getDescription()));
            Thread.sleep(1000);
        }

        if (script.isPresent()) {
            if (args != null && args.size() > 0) {
                args.set(0, script.get().getLocation().toString());
            }
            List<String> args = this.args != null ? Collections.unmodifiableList(this.args) : Collections.emptyList();
            ScriptResult<?, ?> scriptResult = cli.getCore().getEngine().execute(
                script.get(),
                args,
                scriptEngine -> {
                    Bindings bindings = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
                    CredentialsCommand bindedCredentials = (CredentialsCommand) bindings.get("credentials");
                    bindedCredentials.get().fill(credentials);
                    ConfigurationCommand bindedConfiguration = (ConfigurationCommand) bindings.get("configuration");
                    bindedConfiguration.fill(configuration);
                },
                scriptEngine -> {
                    Cli.out.println(script.get().getRepository() + ":" + script.get().getLocation() + " executed.");
                }
            );
            return new CliResult(scriptResult);
        }
        throw new Exception("Script " + this.scriptPath + " not found on configured repositories!");
    }

    private String checkInfixAndExtension(String path) {
        return path == null || path.matches(".*(?!\\." + mainInfix + ")\\.(?<ext>[a-zA-Z0-9]+)") ? path : path + "." + mainInfix + ".groovy";
    }
}
