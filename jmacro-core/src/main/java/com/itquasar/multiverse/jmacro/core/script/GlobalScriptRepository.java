package com.itquasar.multiverse.jmacro.core.script;

import lombok.SneakyThrows;

import java.net.URI;
import java.util.List;
import java.util.Optional;

public class GlobalScriptRepository extends ScriptRepositoryAbstract {

    private final List<ScriptRepository> repositories;

    @SneakyThrows
    public GlobalScriptRepository(List<ScriptRepository> repositories) {
        super(URI.create("memory://" + GlobalScriptRepository.class.getName().replace(".", "/")));
        this.repositories = repositories;
    }

    @Override
    public List<Script> list(boolean reload) {
        return repositories.stream()
            .map(repo -> repo.list(reload))
            .flatMap(List::stream)
            .toList();
    }

    @Override
    public Optional<Script> get(String location) {
        return repositories.stream()
            .map(it -> it.get(location))
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
