package com.itquasar.multiverse.jmacro.core.configuration;

import lombok.Data;

import java.net.URI;

@Data
public class RepositoryURI {

    private URI uri;

    public RepositoryURI(String uri) {
        this.uri = URI.create(uri);
    }

    public RepositoryURI(URI uri) {
        this.uri = uri;
    }
}
