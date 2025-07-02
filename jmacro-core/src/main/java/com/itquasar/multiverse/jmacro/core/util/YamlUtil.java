package com.itquasar.multiverse.jmacro.core.util;

import lombok.experimental.UtilityClass;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

@UtilityClass
public class YamlUtil<T> {

    public <T> T load(String input, Class<T> clazz) {
        return load(new StringReader(input), clazz);
    }

    public <T> T load(InputStream input, Class<T> clazz) {
        return load(new InputStreamReader(input), clazz);
    }

    public <T> T load(Reader input, Class<T> clazz) {
        LoaderOptions options = new LoaderOptions();
        Yaml yaml = new Yaml(new Constructor(clazz, options));
        return yaml.loadAs(input, clazz);
    }
}
