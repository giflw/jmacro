package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.jmx.JMXBeanIFace;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.SneakyThrows;

import java.net.InetAddress;
import java.util.Random;

@Builder
@AllArgsConstructor
public class JMacroCore {

    @Getter
    private Configuration configuration;

    @Getter
    private JMXManagement jmxManagement;

    @Getter
    private SPILoader SPILoader;

    @Getter
    private Engine engine;

    public JMacroCore() {
        this(Configuration.load(), null, new Random().nextInt(9000, 10000));
    }

    public JMacroCore(Configuration configuration) {
        this(configuration, null, new Random().nextInt(9000, 10000));
    }

    @SneakyThrows
    public JMacroCore(Configuration configuration, String serverAddress, int jmxPort) {
        this.engine = new EngineImpl(this);
        this.configuration = configuration;
        this.SPILoader = new SPILoader(JMXBeanIFace.class);
        this.jmxManagement = new JMXManagement(InetAddress.getByName(serverAddress), jmxPort);
    }
}
