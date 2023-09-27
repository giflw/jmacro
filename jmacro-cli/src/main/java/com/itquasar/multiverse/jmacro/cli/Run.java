package com.itquasar.multiverse.jmacro.cli;

import com.itquasar.multiverse.jmacro.core.script.Metadata;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import picocli.CommandLine;

import java.util.*;
import java.util.concurrent.Callable;

import static picocli.CommandLine.*;
import static picocli.CommandLine.Model.CommandSpec;


@Command(
    name = "run",
    description = "Run given script",
    showEndOfOptionsDelimiterInUsageHelp = true
)
@Log4j2
public class Run implements Callable<CliResult> {

    private final Map<String, String> configuration = new LinkedHashMap<>();
    private final Map<String, String> credentials = new LinkedHashMap<>();
    @Option(names = {"--default-script", "--ds"}, description = "Default script to run if no selection provided")
    public String defaultScriptPath;
    @Option(names = {"--main-infix", "--mi"}, description = "Main infix to search for main scripts. Default is main as in script.main.groovy", defaultValue = "main")
    public String mainInfix;
    @Option(names = {"--default-extension", "--dx"}, description = "Default script extension to use when script extension not provided", defaultValue = "groovy")
    public String defaultExtension;
    @Parameters(index = "1..*")
    List<String> args;
    @Spec
    private CommandSpec spec; // injected by picocli
    @ParentCommand
    private Cli cli;
    @Parameters(arity = "0..1", description = "Script path to run")
    private String scriptPath;

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    private static String selectScriptMenu(Optional<Script> defaultScript) {
        String scriptIndex = null;
        while (scriptIndex == null || (scriptIndex.isEmpty() && defaultScript.isPresent())) {
            String selectMessage = "Select script to run or exit";
            if (defaultScript.isPresent()) {
                selectMessage += " [default: " + defaultScript.get().getMetadata().getName() + "]";
            }
            Cli.out.print(selectMessage + ": ");

            scriptIndex = System.console().readLine();
            scriptIndex = scriptIndex == null ? "" : scriptIndex.trim();
        }
        return scriptIndex;
    }

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
        showDebugInfo();

        this.defaultScriptPath = checkInfixAndExtension(this.defaultScriptPath).orElse(null);
        this.scriptPath = checkInfixAndExtension(this.scriptPath).orElse(null);

        Optional<Script> script;
        if (scriptPath != null) {
            script = cli.getCore().getConfiguration().getRepository().get(scriptPath);
        } else {
            List<Script> scripts = cli.getCore().getConfiguration().getRepository().listMain(mainInfix);
            Optional<Script> defaultScript = getDefaultScript(scripts);
            String scriptIndex = selectScriptMenu(defaultScript);

            if ("x".equalsIgnoreCase(scriptIndex) || (scriptIndex.isEmpty() && defaultScript.isPresent())) {
                LOGGER.info("Exiting...");
                return CliResult.EMPTY_OK;
            } else if (!scriptIndex.isEmpty()) {
                script = Optional.of(scripts.get(Integer.parseInt(scriptIndex) - 1));
            } else {
                script = defaultScript;
            }
            Metadata metadata = script.orElse(Script.EMPTY).getMetadata();
            LOGGER.info("Selected script: " + metadata.getName() + (metadata.getDescription().isEmpty() ? "" : " -> " + metadata.getDescription()));
        }

        if (script.isPresent()) {
            List<String> args = this.args != null ? Collections.unmodifiableList(this.args) : Collections.emptyList();
            ScriptResult<?, ?> scriptResult = cli.getCore().getEngine().execute(
                script.get(),
                args,
                Cli.getPreExecHook(credentials, configuration),
                scriptEngine -> {
                    LOGGER.info(script.get().getRepository() + ":" + script.get().getLocation() + " executed.");
                }
            );
            return new CliResult(scriptResult);
        }
        String message = this.scriptPath == null || this.scriptPath.isEmpty()
            ? "No script selected."
            : "Script " + this.scriptPath + " not found on configured repositories!";
        LOGGER.info("Exiting: " + message);
        return CliResult.EMPTY_ERROR;
    }

    private Optional<Script> getDefaultScript(List<Script> scripts) {
        LOGGER.info("Listing available scripts:");
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
            LOGGER.info("  " + idx + " ) " + name);
            LOGGER.info(description.indent("            ".length()));
            LOGGER.info("            [" + _script.getRepository() + "] " + _script.getLocation());
        }

        LOGGER.info(" " + padding + "x ) Exit");
        return Optional.ofNullable(defaultScript);
    }

    private void showDebugInfo() {
        if (cli.isDebug()) {
            LOGGER.info("Changing root log level to DEBUG if needed...");
            Logger rootLogger = LoggerContext.getContext().getRootLogger();
            if (rootLogger.getLevel().isMoreSpecificThan(Level.DEBUG)) {
                rootLogger.setLevel(Level.DEBUG);
            }
            LOGGER.info("Root log level is " + rootLogger.getLevel().name());
            LOGGER.info(cli.getCore().getConfiguration().serialize());
            cli.getCore().getConfiguration().getRepository().getRepositories().forEach((repo) -> {
                LOGGER.info(repo.getId() + ":" + repo.getUri());
                repo.list().forEach(script -> {
                    LOGGER.info(" - " + repo.pathToLocation(script.getPath()));
                });
            });
        }
    }

    public Optional<String> checkInfixAndExtension(String path) {
        if (path == null) {
            return Optional.empty();
        }
        LOGGER.info("Checking infix and extension for " + path);
        if (path.matches(".+\\.(?<infix>[a-zA-Z0-9]+)\\.(?<ext>[a-zA-Z0-9]+)")) {
            LOGGER.info("Path has some kind of infix and extension " + path);
        } else {
            // has only infix
            if (path.endsWith("." + this.mainInfix)) {
                LOGGER.info("Add default extension to  " + path);
                path = path + "." + this.defaultExtension;
                LOGGER.info("Path with default extension" + path);
            }
            // has infix and extension
            if (!path.matches(".*(?!\\." + this.mainInfix + ")\\.(?<ext>[a-zA-Z0-9]+)")) {
                LOGGER.info("Add infix and default extension to  " + path);
                path = path + "." + this.mainInfix + "." + this.defaultExtension;
                LOGGER.info("Path with infix and default extension " + path);
            }
        }
        Cli.out.print("Returning path as " + path);
        return Optional.of(path);
    }
}
