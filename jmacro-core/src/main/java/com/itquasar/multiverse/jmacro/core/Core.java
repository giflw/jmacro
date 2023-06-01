package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.Path;

public final class Core {

    @Getter
    private Configuration configuration;

    @Getter
    private JMXManagement jmxManagement;

    private Engine engine;

    public Core(Path configPath) {
        this(configPath != null ? Configuration.load(configPath) : Configuration.load());
    }

    public Core(final Configuration configuration) {
        this.configuration = configuration != null ? configuration : Configuration.load();
    }

    public Engine getEngine() {
        if (engine == null) {
            throw new JMacroException("Engine not started!");
        }
        return engine;
    }


    public void start() {
        this.engine = new EngineImpl(this);
        this.jmxManagement = new JMXManagement(this.configuration.getJmxConfig());
        this.jmxManagement.load(this);
    }


    public void stop() {
        if (this.jmxManagement != null) {
            try {
                this.jmxManagement.getServer().close();
            } catch (IOException e) {
                throw new JMacroException("Error closing core", e);
            }
        }
    }
}
