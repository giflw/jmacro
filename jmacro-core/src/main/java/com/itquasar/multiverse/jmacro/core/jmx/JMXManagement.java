package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.j256.simplejmx.client.JmxClient;
import com.j256.simplejmx.server.JmxServer;
import lombok.extern.log4j.Log4j2;

import javax.management.JMException;
import java.net.InetAddress;
import java.net.UnknownHostException;
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

    public JMXManagement(InetAddress jmxAddress, int jmxPort) {
        try {
            this.jmxAddress = jmxAddress != null ? jmxAddress : InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new JMacroException("Error getting localhos INetAddress", e);
        }
        this.jmxPort = jmxPort;
        this.server = this.initServer();
        this.loadMBeans();
    }

    private void loadMBeans() {
        var loader = new SPILoader<>(JMXBeanIFace.class);
        var iterator = loader.load();
        while (iterator.hasNext()) {
            var jmxBean = iterator.next();
            LOGGER.info("Loaded JMX Bean: " + jmxBean.getClass().getName());
            //jmxBean.setJMacroCore(this.jMacroCore);
            try {
                this.server.register(jmxBean);
            } catch (JMException e) {
                throw new JMacroException("Error registering " + jmxBean.getClass(), e);
            }
        }
    }

    private JmxServer initServer() {
        JmxServer jmxServer = new JmxServer(jmxPort);
        try {
            jmxServer.start();
        } catch (JMException e) {
            throw new JMacroException("Error starting JMXServer", e);
        }
        return jmxServer;
    }

    public JmxServer getServer() {
        return server;
    }


    public void register(Object mbean) {
        try {
            this.server.register(mbean);
        } catch (JMException e) {
            throw new JMacroException("Error registering " + mbean.getClass());
        }
    }


    public JmxClient getClient() {
        return this.getClient(jmxAddress, this.jmxPort);
    }


    public JmxClient getClient(int jmxPort) {
        return this.getClient(jmxAddress, jmxPort);
    }


    public synchronized JmxClient getClient(InetAddress jmxAddress, int jmxPort) {
        String address = jmxAddress.toString() + ":" + jmxPort;
        JmxClient jmxClient = this.clients.get(address);
        if (jmxClient == null) {
            try {
                jmxClient = new JmxClient(jmxAddress, jmxPort);
            } catch (JMException e) {
                throw new JMacroException("Error creating JMXClient", e);
            }
            this.clients.put(address, jmxClient);
        }
        return jmxClient;
    }
}
