package com.itquasar.multiverse.jmacro.core.script;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.net.URI;
import java.util.List;

public abstract class ScriptRepositoryAbstract implements ScriptRepository {

    private final URI uri;

    @Getter
    private final String id;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private List<Script> cache = null;

    public ScriptRepositoryAbstract(@NonNull String id, @NonNull URI uri) {
        this.id = id;
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
