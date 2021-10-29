package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.Getter;
import lombok.SneakyThrows;

import java.net.InetAddress;

public final class JMacroCore {

    @Getter
    private Configuration configuration;

    @Getter
    private String serverAddress;

    @Getter
    private int jmxPort;

    @Getter
    private JMXManagement jmxManagement;

    private Engine engine;

    public JMacroCore() {
        this(Configuration.load());
    }

    public JMacroCore(Configuration configuration) {
        this(configuration, null, 0);
    }

    public JMacroCore(final Configuration configuration, final String serverAddress, final int jmxPort) {
        this.serverAddress = serverAddress;
        this.jmxPort = jmxPort;
        this.configuration = configuration != null ? configuration : Configuration.load();
    }

    // FIXME is this really a good option (auto start core)???
    public Engine getEngine() {
        if (engine == null) {
            this.start();
        }
        return engine;
    }

    @SneakyThrows
    public void start() {
        this.engine = new EngineImpl(this);
        if (this.serverAddress != null && this.jmxPort > 0) {
            this.jmxManagement = new JMXManagement(InetAddress.getByName(this.serverAddress), this.jmxPort);
            // FIXME
            // var SPILoader = new SPILoader(JMXBeanIFace.class);
        }
    }

    @SneakyThrows
    public void stop() {
        if (this.jmxManagement != null) {
            this.jmxManagement.getServer().close();
        }
    }
}
