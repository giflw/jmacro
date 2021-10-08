package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.util.URLUtil;

import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;

public class FileScriptRepositoryFactory implements ScriptRepositoryFactory {

    @Override
    public String getName() {
        return "file";
    }

    @Override
    public ScriptRepository create(URI uri) {
        return new FileScriptRepository(uri);
    }

}

