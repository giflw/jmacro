package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public interface Constants {
    String API_VERSION = "0.2.0";
    // OS
    String EOL = System.lineSeparator();
    String EOL_ESCAPED = System.lineSeparator().replace("\r", "\\r").replace("\n", "\\n");
    boolean IS_WINDOWS = System.getProperty("os.name").startsWith("Windows");
    String ARCH = System.getProperty("os.arch").contains("64") ? "64" : "32";
    String OS_ID = (IS_WINDOWS ? "win" : "unix") + "_" + ARCH;
    String BIN_EXT = IS_WINDOWS ? ".exe" : "";

    // VERBOSITY
    String QUIET = "QUIET";
    String VERBOSE = "VERBOSE";

    // BROWSERS
    String CHROME = "Chrome";
    String CHROMIUM = "Chromium";
    String EDGE = "Edge";
    String FIREFOX = "Firefox";
    String IE = "IExplorer";
    String OPERA = "Opera";
    String SAFARI = "Safari";

    Map<String, ?> _MAP = Arrays.asList(Constants.class.getDeclaredFields())
        .stream()
        .filter(field -> !field.getName().equals("_MAP"))
        .collect(Collectors.toMap(Field::getName, field -> {
            try {
                return field.get(null);
            } catch (IllegalAccessException e) {
                throw new JMacroException("Error getting constant value for " + field.getName());
            }
        }));
}
