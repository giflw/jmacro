package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

@Log4j2
public class FileScriptRepository extends ScriptRepositoryAbstract {

    private final Path path;

    public FileScriptRepository(String id, URI uri) {
        super(id, uri);
        this.path = new File(uri.getPath()).toPath();
    }

    @Override
    public List<Script> list(boolean reload) {
        if (this.getCache() == null || reload) {
            this.setCache(
                Arrays.stream(this.path.toFile().listFiles())
                    .filter(File::isFile)
                    .filter(File::canRead)
                    .filter(file -> Configuration.supportedExtensions.contains(
                        file.getName().substring(file.getName().lastIndexOf(".") + 1)
                    )).map(file -> {
                        try {
                            var source = Files.readString(file.toPath());
                            return new Script(
                                Metadata.extractMetadata(source),
                                file.getName(),
                                file.getAbsolutePath(),
                                source
                            );
                        } catch (IOException e) {
                            LOGGER.error("Error reading file " + file, e);
                            return null;
                        }
                    }).filter(Objects::nonNull)
                    .toList()
            );
        }
        return this.getCache();
    }

    @Override
    public Optional<Script> get(UUID uuid) {
        return this.list().stream()
            .filter(it -> it.getUUID().equals(uuid))
            .findFirst();
    }

    @Override
    public Optional<Script> get(URI location) {
        if (location.toString().startsWith(this.path.toString())) {
            return this.getCache().stream().filter(it -> it.getLocation().equals(location)).findFirst();
        }
        return Optional.empty();
    }
}
