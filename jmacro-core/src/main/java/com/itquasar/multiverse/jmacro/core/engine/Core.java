package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Core {

    private final AtomicBoolean started = new AtomicBoolean(false);

    @Getter
    private final Configuration configuration;

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

    public boolean isStarted() {
        return started.get();
    }

    public void start() {
        if (started.compareAndSet(false, true)) {
            this.engine = new EngineImpl(this);
            this.jmxManagement = new JMXManagement(this.configuration.getJmxConfig());
            this.jmxManagement.load(this);
        } else {
            throw new JMacroException("Core already started");
        }
    }


    public void stop() {
        if (started.compareAndSet(true, false)) {
            if (this.jmxManagement != null) {
                try {
                    this.jmxManagement.close();
                } catch (IOException e) {
                    throw new JMacroException("Error closing core", e);
                }
            }
        }
        else {
            throw new JMacroException("Core not started");
        }
    }

    public void stopIfStarted() {
        if (this.isStarted()) {
            this.stop();
        }
    }
}
