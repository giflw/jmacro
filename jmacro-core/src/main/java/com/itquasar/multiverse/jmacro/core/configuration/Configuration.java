package com.itquasar.multiverse.jmacro.core.configuration;

import com.itquasar.multiverse.jmacro.core.script.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.ScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.ScriptRepositoryFactory;
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
public class Configuration {

    // FIXME dont use static
    public static final List<String> supportedExtensions = Collections.unmodifiableList(
        new ScriptEngineManager()
            .getEngineFactories()
            .stream()
            .flatMap(factory -> factory.getExtensions().stream())
            .toList()
    );

    public static Configuration load() {
        var paths = List.of(
            "/jmacro-test.yaml",
            "/jmacro.yaml"
        );
        for (String path : paths) {
            InputStream inputStream = Configuration.class.getResourceAsStream(path);
            if (inputStream != null) {
                Reader reader = new BufferedReader(new InputStreamReader(inputStream));
                return load(reader);
            }
        }
        LOGGER.warn("Configuration file 'jmacro-test.yaml' or 'jmacro.yaml' not found on classpath.");
        return new Configuration();
    }

    public static Configuration load(Reader reader) {
        Configuration configuration = new Yaml(new Constructor(Configuration.class)).load(reader);
        configuration.init();
        return configuration;
    }

    private List<String> scriptRepositories;
    private Map<String, String> options = new LinkedHashMap<>();

    private ScriptRepository scriptRepository;

    private Configuration() {
    }

    public void init() {
        this.scriptRepository = new GlobalScriptRepository(
            ScriptRepositoryFactory.create(this.scriptRepositories, this)
        );
    }

    public String getValue(String key) {
        String value = System.getenv(key);
        if (value == null) {
            value = this.options.get(key);
        }
        if (value == null) {
            value = System.getProperty(key);
        }
        return value;
    }

    public String replaceVars(String string) {
        String regex = "(?<var>\\$(?<key>[\\w\\d.]+)\\$)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String value = getValue(matcher.group("key"));
            if (value != null) {
                string = string.replace(matcher.group("var"), value);
            }
        }
        return string;
    }
}
