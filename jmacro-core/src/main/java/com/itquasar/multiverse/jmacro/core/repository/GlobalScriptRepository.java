package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.Getter;
import lombok.SneakyThrows;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class GlobalScriptRepository extends ScriptRepositoryAbstract {

    @Getter
    private final List<ScriptRepository> repositories;

    public GlobalScriptRepository(ScriptRepository... repositories) {
        this(Arrays.asList(repositories));
    }

    @SneakyThrows
    public GlobalScriptRepository(List<ScriptRepository> repositories) {
        this("global", URI.create("memory://" + GlobalScriptRepository.class.getName().replace(".", "/")), repositories);
    }

    @SneakyThrows
    public GlobalScriptRepository(String id, URI uri, List<ScriptRepository> repositories) {
        super(id, uri);
        this.repositories = Collections.unmodifiableList(repositories);
    }

    @Override
    public List<Script> list(boolean reload) {
        return repositories.stream()
            .map(repo -> repo.list(reload))
            .flatMap(List::stream)
            .toList();
    }

    @Override
    public Optional<Script> get(String uuidOrLocation) {
        return repositories.stream()
            .map(it -> it.get(it.pathToLocation(uuidOrLocation)))
            .filter(Optional::isPresent)
            .findFirst()
            .get();
    }

    @Override
    public Optional<Script> get(UUID uuid) {
        var matches = this.repositories.stream()
            .map(repository -> repository.get(uuid))
            .filter(Optional::isPresent)
            .toList();
        return matches.size() > 0 ? matches.get(0) : Optional.empty();
    }

    @Override
    public Optional<Script> get(URI location) {
        return repositories.stream()
            .map(it -> it.get(location))
            .filter(Optional::isPresent)
            .findFirst()
            .get();
    }

    public Optional<Script> get(String repoId, String script) {
        return repositories.stream()
            .filter(it -> it.getId().equals(repoId))
            .map(repo -> repo.get(script))
            .filter(Optional::isPresent)
            .findFirst()
            .get();
    }


    @Override
    public String toString() {
        return "GlobalScriptRepository{" +
            "uri=" + this.getUri() + ", " +
            "repositories=" + repositories +
            '}';
    }
}
