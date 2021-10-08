package com.itquasar.multiverse.jmacro.core.script;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public interface ScriptRepository {

    URI getUri();

    default List<Script> list() {
        return this.list(false);
    }

    List<Script> list(boolean reload);

    Optional<Script> get(String location);
}
