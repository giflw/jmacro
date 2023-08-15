package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ScriptRepository {

    org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(ScriptRepository.class);

    String DEFAULT_MAIN_INFIX = "main";

    String getId();

    URI getUri();

    default List<Script> list() {
        return this.list(false);
    }

    List<Script> list(boolean reload);

    default List<Script> listMain() {
        return this.listMain(DEFAULT_MAIN_INFIX, false);
    }

    default List<Script> listMain(String mainInfix) {
        return this.listMain(mainInfix, false);
    }

    default List<Script> listMain(boolean reload) {
        return this.listMain(DEFAULT_MAIN_INFIX, false);
    }

    default List<Script> listMain(String mainInfix, boolean reload) {
        return this.list(reload).stream()
            .filter(it -> it.getPath().matches(".*(\\." + mainInfix + ")+\\.(?<ext>[a-zA-Z0-9]+)")).toList();
    }

    default URI pathToLocation(String path) {
        URI uri = URI.create(path);
        uri = uri.getScheme() != null ? uri : URI.create(getUri().toString() + path);
        LOGGER.debug("pathToLocation " + this.getId() + ": " + path + " -> " + uri);
        return uri;
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
