package com.itquasar.multiverse.jmacro.core.repository;

import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.net.URI;
import java.util.Collections;
import java.util.List;

public abstract class ScriptRepositoryAbstract implements ScriptRepository {

    @Getter
    @NonNull
    private final URI uri;

    @Getter
    @NonNull
    private final String id;

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    @NonNull
    private List<Script> cache = Collections.emptyList();

    @SneakyThrows
    public ScriptRepositoryAbstract(@NonNull String id, @NonNull URI uri) {
        this.id = id;
        this.uri = new URI(
            uri.getScheme(),
            uri.getUserInfo(),
            uri.getHost(),
            uri.getPort(),
            uri.getPath().replace("//", "/"),
            uri.getQuery(),
            uri.getFragment()
        );
    }

    @Override
    public String toString() {
        return this.getUri().toString();
    }
}
