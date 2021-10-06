package com.itquasar.multiverse.jmacro.core;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CommandProviderLoader {

    private static final ServiceLoader<CommandProvider> loader = ServiceLoader.load(CommandProvider.class);

    public Iterator<CommandProvider> load() {
        return this.load(false);
    }

    public Iterator<CommandProvider> load(boolean refresh) {
        if (refresh) {
            loader.reload();
        }
        return loader.iterator();
    }
}
