package com.itquasar.multiverse.jmacro.core.configuration;

import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.repository.ScriptRepositoryFactory;
import com.itquasar.multiverse.jmacro.core.util.RepresenterNonNull;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    /**
     * URI for repositories.
     */
    private List<String> repositories;
    /**
     * Custom options mapping from configuration file.
     */
    private Map<String, String> options = new LinkedHashMap<>();

    /**
     * Global repository proxy for all registered repositories.
     */
    private GlobalScriptRepository repository;

    private Configuration() {
    }

    private Configuration(List<String> repositories, Map<String, String> options) {
        this.repositories = repositories;
        this.options = options;
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
                Reader reader = new BufferedReader(new InputStreamReader(inputStream));
                return load(reader);
            }
        }
        LOGGER.warn("Configuration file 'jmacro-test.yaml' or 'jmacro.yaml' not found on classpath.");
        return new Configuration();
    }

    /**
     * Load configuration from given {@link Reader}.
     *
     * @param reader {@link Reader} to load configuration from.
     * @return Parsed configuration.
     */
    public static Configuration load(final Reader reader) {
        Configuration configuration = new Yaml(new Constructor(Configuration.class)).load(reader);
        configuration.init();
        return configuration;
    }

    /**
     * Initializes intances objects from loaded configuration.
     */
    private void init() {
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
        return interpolation;
    }
}
