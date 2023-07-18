package com.itquasar.multiverse.jmacro.core.configuration;

import io.vavr.control.Try;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class Folders {

    private static final List<String> NON_OVERRIDABLES = List.of("bin", "etc", "java", "lib");
    private final Path appHome;
    private final Map<String, Path> paths = new LinkedHashMap<>();

    public Folders(Path appHome) {
        this.appHome = appHome;
    }

    public static Folders detect() {
        return Try.of(Folders::fromSysProp)
            .getOrElseTry(
                () -> new Folders(Files.createTempDirectory("jmacro-tmp"))
            );
    }

    public static Folders fromSysProp() {
        return fromSysProp("app.home");
    }

    public static Folders fromSysProp(String sysPropKey) {
        return new Folders(Path.of(System.getProperty(sysPropKey)));
    }

    @SneakyThrows
    private Path folder(String name) {
        if (this.paths.containsKey(name)) {
            return this.paths.get(name);
        }
        Path path = this.appHome.resolve(name);
        if (!Files.exists(path)){
            Files.createDirectory(path);
        }
        return path;
    }

    /**
     * @return Path to dir containing executable files for main app.
     */
    public Path bin() {
        return this.appHome.resolve("bin");
    }

    public Path etc() {
        return this.appHome.resolve("etc");
    }

    public Path java() {
        return this.appHome.resolve("java");
    }

    public Path lib() {
        return this.appHome.resolve("lib");
    }

    // OVERRIDABLES

    public Path cache() {
        return this.folder("cache");
    }

    public Path data() {
        return this.folder("data");
    }

    public Path logs() {
        return this.folder("logs");
    }

    public Path tmp() {
        return this.folder("tmp");
    }

    public Path tools() {
        return this.folder("tools");
    }

    public void configure(Map<String, String> paths) {
        NON_OVERRIDABLES.forEach(it -> {
            if (paths.containsKey(it)) {
                LOGGER.error("Cannot override path to folder " + it);
            }
        });
        this.paths.clear();
        paths.forEach((key, value) -> {
            Path path = Paths.get(value);
            LOGGER.warn("Overriding folder " + key + " to " + path);
            this.paths.put(key, path);
        });
    }
}
