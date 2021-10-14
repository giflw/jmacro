package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.j256.simplejmx.client.JmxClient;
import com.j256.simplejmx.server.JmxServer;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;

@Log4j2
public class JMXManagement {

    private final InetAddress jmxAddress;
    private final int jmxPort;
    private JmxServer server;
    private Map<String, JmxClient> clients = new LinkedHashMap<>();

    public JMXManagement(int jmxPort) {
        this(null, jmxPort);
    }

    @SneakyThrows
    public JMXManagement(InetAddress jmxAddress, int jmxPort) {
        this.jmxAddress = jmxAddress != null ? jmxAddress : InetAddress.getLocalHost();
        this.jmxPort = jmxPort;
        this.server = this.initServer();
        this.loadMBeans();
    }

    @SneakyThrows
    private void loadMBeans() {
        var loader = new SPILoader<>(JMXBeanIFace.class);
        var iterator = loader.load();
        while (iterator.hasNext()) {
            var jmxBean = iterator.next();
            LOGGER.info("Loaded JMX Bean: " + jmxBean.getClass().getName());
            //jmxBean.setJMacroCore(this.jMacroCore);
            this.server.register(jmxBean);
        }
    }

    @SneakyThrows
    private JmxServer initServer() {
        JmxServer jmxServer = new JmxServer(jmxPort);
        jmxServer.start();
        return jmxServer;
    }

    public JmxServer getServer() {
        return server;
    }


    @SneakyThrows
    public void register(Object mbean) {
        this.server.register(mbean);
    }

    @SneakyThrows
    public JmxClient getClient() {
        return this.getClient(jmxAddress, this.jmxPort);
    }

    @SneakyThrows
    public JmxClient getClient(int jmxPort) {
        return this.getClient(jmxAddress, jmxPort);
    }

    @SneakyThrows
    public synchronized JmxClient getClient(InetAddress jmxAddress, int jmxPort) {
        String address = jmxAddress.toString() + ":" + jmxPort;
        JmxClient jmxClient = this.clients.get(address);
        if (jmxClient == null) {
            jmxClient = new JmxClient(jmxAddress, jmxPort);
            this.clients.put(address, jmxClient);
        }
        return jmxClient;
    }
}
