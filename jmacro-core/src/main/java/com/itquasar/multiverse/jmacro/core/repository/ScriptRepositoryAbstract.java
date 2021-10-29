package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.net.URI;
import java.util.Collections;
import java.util.List;

public abstract class ScriptRepositoryAbstract implements ScriptRepository {

    @NonNull
    private final URI uri;

    @Getter
    @NonNull
    private final String id;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    @NonNull
    private List<Script> cache = Collections.EMPTY_LIST;

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
