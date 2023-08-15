package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.util.*;

@Getter
@Log4j2
public class GlobalScriptRepository extends ScriptRepositoryAbstract {

    private final List<ScriptRepository> repositories;

    public GlobalScriptRepository(ScriptRepository... repositories) {
        this(Arrays.asList(repositories));
    }

    public GlobalScriptRepository(List<ScriptRepository> repositories) {
        this("global", URI.create("memory://" + GlobalScriptRepository.class.getName().replace(".", "/")), repositories);
    }

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
            .peek(it -> LOGGER.debug("Repository " + it.getId() + ": " + it.getUri()))
            .map(it -> it.get(it.pathToLocation(uuidOrLocation)))
            .filter(Optional::isPresent)
            .peek(it -> LOGGER.debug("Script found: " + it.get().getLocation()))
            .findFirst()
            .orElseGet(Optional::empty);
    }

    @Override
    public Optional<Script> get(UUID uuid) {
        return this.repositories.stream()
            .map(repository -> repository.get(uuid))
            .filter(Optional::isPresent)
            .findFirst()
            .orElseGet(Optional::empty);
    }

    @Override
    public Optional<Script> get(URI location) {
        return repositories.stream()
            .map(it -> it.get(location))
            .filter(Optional::isPresent)
            .findFirst()
            .orElseGet(Optional::empty);
    }

    public Optional<Script> get(String repoId, String script) {
        return repositories.stream()
            .filter(it -> it.getId().equals(repoId))
            .map(repo -> repo.get(script))
            .filter(Optional::isPresent)
            .findFirst()
            .orElseGet(Optional::empty);
    }


    @Override
    public String toString() {
        return "GlobalScriptRepository{" +
            "uri=" + this.getUri() + ", " +
            "repositories=" + repositories +
            '}';
    }
}
