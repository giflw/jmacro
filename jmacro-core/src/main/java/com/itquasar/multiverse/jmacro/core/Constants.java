package com.itquasar.multiverse.jmacro.core;

public interface Constants {
    int API_VERSION = 1;
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
}
