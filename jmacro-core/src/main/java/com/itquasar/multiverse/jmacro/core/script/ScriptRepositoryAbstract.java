package com.itquasar.multiverse.jmacro.core.script;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public abstract class ScriptRepositoryAbstract implements ScriptRepository {

    private final URI uri;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private List<Script> cache = null;

    public ScriptRepositoryAbstract(URI uri) {
        this.uri = uri;
    }

    public URI getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return this.getUri().toString();
    }
}
