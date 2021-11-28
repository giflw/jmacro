package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ScriptRepository {

    String getId();

    URI getUri();

    default List<Script> list() {
        return this.list(false);
    }

    List<Script> list(boolean reload);

    default URI pathToLocation(String path) {
        URI uri = URI.create(path);
        return uri.getScheme() != null ? uri : URI.create(getUri().toString() + path);
    }

    default Optional<Script> get(String uuidOrLocation) {
        try {
            return this.get(UUID.fromString(uuidOrLocation));
        } catch (IllegalArgumentException ex) {
            return this.get(pathToLocation(uuidOrLocation));
        }
    }


    Optional<Script> get(UUID uuid);

    Optional<Script> get(URI location);

}
