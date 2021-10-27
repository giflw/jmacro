package com.itquasar.multiverse.jmacro.core.repository;

import java.net.URI;

public class FileScriptRepositoryFactory implements ScriptRepositoryFactory {

    @Override
    public String getType() {
        return "file";
    }

    @Override
    public ScriptRepository create(String id, URI uri) {
        return new FileScriptRepository(id, uri);
    }

}

