package com.itquasar.multiverse.jmacro.core.configuration;

import lombok.Data;

import java.net.URI;

@Data
public final class RepositoryURI {

    /**
     * {@link URI} repository definition.
     */
    private URI uri;

    /**
     * @param uri {@link String} representing repository {@link URI}.
     */
    public RepositoryURI(final String uri) {
        this.uri = URI.create(uri);
    }

    /**
     * @param uri {@link URI} defining this repository.
     */
    public RepositoryURI(final URI uri) {
        this.uri = uri;
    }
}
