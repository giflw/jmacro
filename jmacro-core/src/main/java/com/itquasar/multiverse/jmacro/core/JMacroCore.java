package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.jmx.JMXBeanIFace;
import com.itquasar.multiverse.jmacro.core.jmx.JMXManagement;
import lombok.Getter;
import lombok.SneakyThrows;

import java.net.InetAddress;

public class JMacroCore {

    @Getter
    private JMXManagement jmxManagement;

    @Getter
    private SPILoader SPILoader;

    @SneakyThrows
    public JMacroCore(String serverAddress, int jmxPort) {
        this.jmxManagement = new JMXManagement(this, InetAddress.getByName(serverAddress), jmxPort);
        this.SPILoader = new SPILoader(JMXBeanIFace.class);
    }
}
