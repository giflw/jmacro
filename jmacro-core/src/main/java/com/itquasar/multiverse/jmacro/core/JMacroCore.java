package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.Getter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Path;

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
        this(null, null, 0);
    }

    public JMacroCore(Path configPath) {
            this(Configuration.load(configPath));
    }

    public JMacroCore(Configuration configuration) {
        this(configuration, null, 0);
    }

    public JMacroCore(final Configuration configuration, final String serverAddress, final int jmxPort) {
        this.serverAddress = serverAddress;
        this.jmxPort = jmxPort;
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
        if (this.serverAddress != null && this.jmxPort > 0) {
            try {
                this.jmxManagement = new JMXManagement(InetAddress.getByName(this.serverAddress), this.jmxPort);
            } catch (UnknownHostException e) {
                throw new JMacroException("Error get INetAddress for [" + this.serverAddress + "]");
            }
            // FIXME
            // var SPILoader = new SPILoader(JMXBeanIFace.class);
        }
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
