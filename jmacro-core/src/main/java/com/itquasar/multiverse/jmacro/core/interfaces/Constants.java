package com.itquasar.multiverse.jmacro.core.interfaces;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public interface Constants {
    String API_VERSION = "0.5.0";
    // OS
    String EOL = System.lineSeparator();
    String EOL_ESCAPED = System.lineSeparator().replace("\r", "\\r").replace("\n", "\\n");
    boolean IS_WINDOWS = System.getProperty("os.name").startsWith("Windows");
    String ARCH = System.getProperty("os.arch").contains("64") ? "64" : "32";
    String OS_ID = (IS_WINDOWS ? "win" : "unix") + "_" + ARCH;
    String BIN_EXT = IS_WINDOWS ? ".exe" : "";

    int CPUS = Runtime.getRuntime().availableProcessors();
    long MAXMEM = Runtime.getRuntime().maxMemory();

    // DEFAULT

    String DEFAULT = "default";

    // ARGS
    String ARGS = "args";
    String ARGV = "argv";
    String INCLUDED = "included";
    String SCRIPT_LOCATION = "script-location";

    // VERBOSITY
    String QUIET = "QUIET";
    String VERBOSE = "VERBOSE";
    String ALL = "ALL";

    // LOG LEVEL
    String TRACE = "trace";
    String DEBUG = "debug";
    String INFO = "info";
    String WARNING = "warn";
    String ERROR = "error";


    // CONNECTIVITY
    String KEEP_ALIVE = "KeepAlive";
    String CLOSE = "Close";

    // DIRECTIONS
    String SENT = "SENT";
    String RECEIVED = "RECEIVED";

    // BROWSERS

    String AUTO = "AUTO";
    String CHROME = "Chrome";
    String CHROMIUM = "Chromium";
    String EDGE = "Edge";
    String FIREFOX = "Firefox";
    String IE = "IExplorer";
    String OPERA = "Opera";
    String SAFARI = "Safari";

    // DEVTOOLS
    String NETWORK = "Network";

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
