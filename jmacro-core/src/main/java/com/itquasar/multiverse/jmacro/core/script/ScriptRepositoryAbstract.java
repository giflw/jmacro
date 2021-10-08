package com.itquasar.multiverse.jmacro.core.script;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public abstract class ScriptRepositoryAbstract implements ScriptRepository {

    private final URI uri;

    @Getter
    @Setter
    private List<Script> cache = new ArrayList();

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
