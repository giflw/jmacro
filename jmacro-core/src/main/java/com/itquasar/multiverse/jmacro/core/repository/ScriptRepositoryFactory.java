package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.itquasar.multiverse.jmacro.core.configuration.Configuration;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

public interface ScriptRepositoryFactory {

    static List<ScriptRepository> create(List<String> uris) {
        return create(uris, null);
    }

    static List<ScriptRepository> create(List<String> uris, Configuration configuration) {
        var repositoryFactoryMap = new LinkedHashMap<String, ScriptRepositoryFactory>();

        var repoFactoryLoader = new SPILoader<>(ScriptRepositoryFactory.class);
        repoFactoryLoader.load().forEachRemaining(
            (factory) -> repositoryFactoryMap.put(factory.getType(), factory)
        );

        return uris.stream()
            .map(uri -> configuration != null ? configuration.replaceVars(uri).replace("\\", "/") : uri)
            .map(URI::create)
            .map(URI::normalize)
            .map(uri -> {
                    String id = uri.getScheme();
                    URI suburi = URI.create(uri.getSchemeSpecificPart());
                    var factory = repositoryFactoryMap.get(suburi.getScheme());
                    return factory.create(id, suburi.normalize());
                }
            )
            .toList();
    }

    String getType();

    ScriptRepository create(String id, URI uri);
}