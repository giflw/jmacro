package com.itquasar.multiverse.jmacro.core.configuration;

import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.repository.ScriptRepositoryFactory;
import com.itquasar.multiverse.jmacro.core.util.RepresenterNonNull;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@Log4j2
public final class Configuration {

    /**
     * Defines where to search (in classpath) configuration files. Search is made ordered.
     */
    public static final List<String> CONFIGURATION_PATHS = List.of(
        "/jmacro-test.yaml",
        "/jmacro.yaml"
    );

    /**
     * List found extensions supported by script engines found by {@link ScriptEngineManager}.
     */
    public static final List<String> SUPPORTED_EXTENSIONS = Collections.unmodifiableList(
        new ScriptEngineManager()
            .getEngineFactories()
            .stream()
            .flatMap(factory -> factory.getExtensions().stream())
            .toList()
    );

    private final Folders folders;
    /**
     * URI for repositories.
     */
    private List<String> repositories = new ArrayList<>();

    private JMXManagement.JMXConfig jmxConfig = new JMXManagement.JMXConfig();
    /**
     * Custom options mapping from configuration file.
     */
    private Map<String, String> options = new LinkedHashMap<>();
    /**
     * Store custom paths for folders
     */
    private Map<String, String> paths = new LinkedHashMap<>();
    /**
     * Global repository proxy for all registered repositories.
     */
    private GlobalScriptRepository repository;

    private Configuration() {
        this(null, null);
    }

    private Configuration(List<String> repositories, Map<String, String> options) {
        this(repositories, options, Folders.detect());
    }

    private Configuration(List<String> repositories, Map<String, String> options, Folders folders) {
        Objects.requireNonNull(folders, "Folders must be not null");
        this.repositories = repositories != null ? repositories : this.repositories;
        this.options = options != null ? options : this.options;
        this.folders = folders;
    }

    /**
     * Loads configuration from predefined paths.
     *
     * @return Found configuration.
     */
    public static Configuration load() {
        for (String path : CONFIGURATION_PATHS) {
            InputStream inputStream = Configuration.class.getResourceAsStream(path);
            if (inputStream != null) {
                LOGGER.warn("Configuration file found: %s".formatted(path));
                Reader reader = new BufferedReader(new InputStreamReader(inputStream));
                return load(reader);
            }
        }
        LOGGER.warn("Configuration file 'jmacro-test.yaml' or 'jmacro.yaml' not found on classpath.");
        Configuration configuration = new Configuration();
        configuration.init();
        return configuration;
    }

    /**
     * @param path Path to configuration file
     * @return Loaded configuration
     */
    @SneakyThrows
    public static Configuration load(Path path) {
        LOGGER.warn("Configuration file in use: %s".formatted(path));
        return load(Files.newBufferedReader(path));
    }

    /**
     * Load configuration from given {@link Reader}.
     *
     * @param reader {@link Reader} to load configuration from.
     * @return Parsed configuration.
     */
    public static Configuration load(final Reader reader) {
        Configuration configuration = new Yaml().loadAs(reader, Configuration.class);
        configuration.init();
        return configuration;
    }


    /**
     * Initializes intances objects from loaded configuration.
     */
    private void init() {
        folders.configure(this.paths);
        this.repository = new GlobalScriptRepository(
            ScriptRepositoryFactory.create(this.repositories, this)
        );
    }

    public String serialize() {
        return new Yaml(new RepresenterNonNull()).dumpAsMap(this.copy());
    }

    private Configuration copy() {
        return new Configuration(repositories, options);
    }

    /**
     * Get configuration value. Load from thoses sources, in order:
     * - environment variables
     * - configuration file options (loaded in this instance)
     * - system property
     *
     * @param key Key to search.
     * @return Found value.
     */
    public String getValue(final String key) {
        if (Constants._MAP.containsKey(key)) {
            return Constants._MAP.get(key).toString();
        }
        String value = System.getenv(key);
        if (value == null) {
            value = this.options.get(key);
        }
        if (value == null) {
            value = System.getProperty(key);
        }
        return value;
    }

    /**
     * Replace values in string, interpolating {@code ${key}} found in given {@link String}
     * and replacing by value found using {@link #getValue(String)}.
     *
     * @param interpolatedString String to make interpolation replacements.
     * @return Interpolated string with keys replaced by values.
     */
    public String replaceVars(final String interpolatedString) {
        if (interpolatedString == null || interpolatedString.isEmpty()) {
            return interpolatedString;
        }
        String regex = "(?<var>\\$(?<key>[\\w\\d.]+)\\$)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(interpolatedString);
        String interpolation = interpolatedString;
        while (matcher.find()) {
            String value = getValue(matcher.group("key"));
            if (value != null) {
                interpolation = interpolation.replace(matcher.group("var"), value);
            }
        }
        return interpolation.replace(" ", "%20");
    }
}
