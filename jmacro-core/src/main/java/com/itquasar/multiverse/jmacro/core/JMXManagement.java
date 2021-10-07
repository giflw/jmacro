package com.itquasar.multiverse.jmacro.core;

import com.j256.simplejmx.client.JmxClient;
import com.j256.simplejmx.server.JmxServer;
import lombok.SneakyThrows;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;

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
    }

    public JmxServer getServer() {
        return server;
    }

    @SneakyThrows
    private JmxServer initServer() {
        JmxServer jmxServer = new JmxServer(jmxPort);
        jmxServer.start();
        return jmxServer;
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
//
//    public Set<ObjectName> getBeanNames() {
//        return this.getBeanNames(this.jmxPort);
//    }

//    @SneakyThrows
//    public Set<ObjectName> getBeanNames(int port) {
//        Set<ObjectName> objectNameSet = this.client(port).getBeanNames();
//        return objectNameSet;
//    }

//    /**
//     * @param object    ex: "java.lang:type=Runtime"
//     * @param attribute ex: "StartTime"
//     * @param <T>       returned type to cast
//     * @return
//     */
//    @SneakyThrows
//    public <T> T getAttribute(String object, String attribute) {
//        return (T) this.client().getAttribute(new ObjectName(object), attribute);
//    }
//
//    /**
//     * @param object    ex: "java.lang:type=Runtime"
//     * @param operation ex: "StartTime"
//     * @param params    ex: "StartTime"
//     * @param <T>       returned type to cast
//     * @return
//     */
//    @SneakyThrows
//    public <T> T invokeOperation(String object, String operation, Object... params) {
//        return (T) this.client().invokeOperation(new ObjectName(object), operation, params);
//    }
/*
    @JmxResource(domainName = "j256.simplejmx", description = "Counter that shows how long we have been running")
    public static class RuntimeCounter {

        private long startMillis = System.currentTimeMillis();
        @JmxAttributeField(isWritable = true, description = "Show the time in seconds if true else milliseconds")
        private boolean showSeconds;

        @JmxAttributeMethod(description = "The time we have been running in seconds or milliseconds")
        public long getRunTime() {
            long diffMillis = System.currentTimeMillis() - startMillis;
            if (showSeconds) {
                return diffMillis / 1000;
            } else {
                return diffMillis;
            }
        }

        @JmxOperation(description = "Reset the start time to the current time millis")
        public String resetStartTime() {
            startMillis = System.currentTimeMillis();
            return "Timer has been reset to current millis";
        }

        @JmxOperation(description = "Add a positive or negative offset to the start time milliseconds",
            parameterNames = {"offset in millis"},
            parameterDescriptions = {"offset milliseconds value to add to start time millis"})
        public String addToStartTime(long offset) {
            long old = startMillis;
            startMillis += offset;
            return "Timer value changed from " + old + " to " + startMillis;
        }
    }*/
}
