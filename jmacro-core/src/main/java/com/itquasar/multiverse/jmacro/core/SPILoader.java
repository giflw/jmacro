package com.itquasar.multiverse.jmacro.core;

import lombok.extern.log4j.Log4j2;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Simple class to load Java SPI implementations.
 *
 * @param <S> Type to load.
 * @see <a href="https://docs.oracle.com/javase/tutorial/ext/basics/spi.html">Creating Extensible Applications</a>
 */
@Log4j2
public final class SPILoader<S> {

    private final Class<S> type;
    private final ServiceLoader<S> loader;

    public SPILoader(Class<S> type) {
        this.type = type;
        this.loader = ServiceLoader.load(type);
        this.loader.stream().map(this::logMessage).forEach(LOGGER::debug);
    }

    public static <S> Iterator<S> load(Class<S> type) {
        return new SPILoader<S>(type).load();
    }

    private String logMessage(ServiceLoader.Provider<S> provider) {
        return "Loaded " + provider.type().getName() + " as " + this.type.getSimpleName();
    }

    public Iterator<S> load() {
        return this.load(false);
    }

    public Iterator<S> load(boolean refresh) {
        if (refresh) {
            loader.reload();
        }
        return loader.iterator();
    }
}
