package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.itquasar.multiverse.jmacro.core.configuration.Configuration;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

public interface ScriptRepositoryFactory {

    String getName();

    ScriptRepository create(URI uri);

    static List<ScriptRepository> create(List<String> uris) {
        return create(uris, null);
    }

    static List<ScriptRepository> create(List<String> uris, Configuration configuration) {
        var repositoryFactoryMap = new LinkedHashMap<String, ScriptRepositoryFactory>();

        var repoFactoryLoader = new SPILoader<>(ScriptRepositoryFactory.class);
        repoFactoryLoader.load().forEachRemaining(
            (factory) -> repositoryFactoryMap.put(factory.getName(), factory)
        );

        return uris.stream()
            .map(uri -> configuration != null ? configuration.replaceVars(uri).replace("\\", "/") : uri)
            .map(URI::create)
            .map(uri -> {
                    var factory = repositoryFactoryMap.get(uri.getScheme());
                    return factory.create(uri);
                }
            ).toList();
    }
}
