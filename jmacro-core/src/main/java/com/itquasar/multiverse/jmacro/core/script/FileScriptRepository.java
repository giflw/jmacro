package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Log4j2
public class FileScriptRepository extends ScriptRepositoryAbstract {

    private final Path path;

    public FileScriptRepository(URI uri) {
        super(uri);
        this.path = new File(uri.getPath()).toPath();
    }

    @Override
    public List<Script> list(boolean reload) {
        return Arrays.stream(this.path.toFile().listFiles())
            .filter(File::isFile)
            .filter(File::canRead)
            .filter(file -> Configuration.supportedExtensions.contains(
                        file.getName().substring(file.getName().lastIndexOf(".") + 1)
            )).map(file -> {
                try {
                    var source = Files.readString(file.toPath());
                    return new Script(
                        Metadata.parseMetadata(source),
                        file.getName(),
                        file.getAbsolutePath(),
                        source
                    );
                } catch (IOException e) {
                    LOGGER.error("Error reading file " + file, e);
                    return null;
                }
            }).filter(Objects::nonNull)
            .toList();
    }

    @Override
    public Optional<Script> get(String location) {
        if (location.startsWith(this.path.toString())) {
            return this.getCache().stream().filter(it -> it.location().equals(location)).findFirst();
        }
        return Optional.empty();
    }
}
