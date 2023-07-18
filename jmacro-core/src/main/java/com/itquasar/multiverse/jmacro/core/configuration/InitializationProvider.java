package com.itquasar.multiverse.jmacro.core.configuration;

import com.itquasar.multiverse.jmacro.core.engine.Engine;

public interface InitializationProvider {

    Runnable initializator(Engine engine);

}
