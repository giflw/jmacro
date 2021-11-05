package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.script.Metadata;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

// FIXME change to FileSystem repository, add Artifact super type for Script
@Log4j2
public class FileScriptRepository extends ScriptRepositoryAbstract {

    public FileScriptRepository(String id, URI uri) {
        super(id, uri);
    }

    @Override
    // FIXME list recursive!!!!
    public List<Script> list(boolean reload) {
        if (this.getCache().size() == 0 || reload) {
            File repoPath = new File(this.getUri().getPath());
            if (repoPath.exists()) {
                this.setCache(
                    Arrays.stream(repoPath.listFiles())
                        .filter(File::isFile)
                        .filter(File::canRead)
                        .filter(file -> Configuration.SUPPORTED_EXTENSIONS.contains(
                            file.getName().substring(file.getName().lastIndexOf(".") + 1)
                        )).map(file -> {
                            try {
                                var source = Files.readString(file.toPath());
                                return new Script(
                                    Metadata.extractMetadata(source),
                                    file.getName(),
                                    "file:///" + file.getAbsolutePath().replace("\\", "/"),
                                    source
                                );
                            } catch (IOException e) {
                                LOGGER.error("Error reading file " + file, e);
                                return null;
                            }
                        }).filter(Objects::nonNull)
                        .toList()
                );
            } else {
                LOGGER.error("Repository " + repoPath + " does not exists.");
            }
        }
        return this.getCache() != null ? this.getCache() : Collections.EMPTY_LIST;
    }

    @Override
    public Optional<Script> get(UUID uuid) {
        return this.list().stream()
            .filter(it -> it.getUUID().equals(uuid))
            .findFirst();
    }

    @Override
    public Optional<Script> get(URI location) {
        // when relativizes and is the same base uri as the repository, only relative path is kept on uri
        if (!this.getUri().relativize(location).equals(location)) {
            return this.getCache().stream().filter(it -> it.getLocation().equals(location)).findFirst();
        }
        return Optional.empty();
    }
}
