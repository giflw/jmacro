package com.itquasar.multiverse.jmacro.core;

import java.nio.file.Path;

public record Folders(Path appHome) {

    public static Folders fromSysProp() {
        return fromSysProp("app.home");
    }

    public static Folders fromSysProp(String sysPropKey) {
        return new Folders(Path.of(System.getProperty(sysPropKey)));
    }

    /**
     * @return Path to dir containing executable files for main app.
     */
    public Path bin() {
        return appHome.resolve("bin");
    }

    public Path data() {
        return appHome.resolve("data");
    }

    public Path etc() {
        return appHome.resolve("etc");
    }

    public Path java() {
        return appHome.resolve("java");
    }

    public Path lib() {
        return appHome.resolve("lib");
    }

    public Path logs() {
        return appHome.resolve("logs");
    }

    public Path tmp() {
        return appHome.resolve("tmp");
    }

    public Path tools() {

        return appHome.resolve("tools");
    }
}
