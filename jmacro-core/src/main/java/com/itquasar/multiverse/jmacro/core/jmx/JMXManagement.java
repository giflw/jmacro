package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.util.NetUtils;
import com.itquasar.multiverse.jmacro.core.util.SPILoader;
import com.j256.simplejmx.client.JmxClient;
import com.j256.simplejmx.server.JmxServer;
import com.j256.simplejmx.web.JmxWebServer;
import io.vavr.control.Try;
import lombok.Data;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import javax.management.JMException;
import java.io.IOException;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Log4j2
public class JMXManagement implements AutoCloseable {

    private final AtomicBoolean loaded = new AtomicBoolean(false);
    @Getter
    private final ServerConfig serverConfig;
    @Getter
    private final ServerConfig webServerConfig;
    private final Map<String, JmxClient> clients = new LinkedHashMap<>();
    @Getter
    private JmxServer server;
    @Getter
    private JmxWebServer webServer;

    public JMXManagement(JMXConfig config) {
        this(config.jmx, config.web);
    }

    public JMXManagement(ServerConfig jmx, ServerConfig web) {
        this.serverConfig = jmx;
        this.webServerConfig = web;
        if (this.serverConfig.shouldRun()) {
            this.server = this.startServer(this.serverConfig);
        }
        if (this.webServerConfig.shouldRun()) {
            this.webServer = this.startWebServer(this.webServerConfig);
        }
    }

    private JmxServer startServer(ServerConfig config) {
        JmxServer jmxServer = null;
        if (config.shouldRun()) {
            jmxServer = new JmxServer(config.getInetAddress(), config.getPort("JMX"));
            Try.run(jmxServer::start).getOrElseThrow(ex -> new JMacroException("Error starting JMXServer", ex));
        }
        return jmxServer;
    }

    private JmxWebServer startWebServer(ServerConfig config) {
        JmxWebServer jmxWebServer = null;
        if (config.shouldRun()) {
            jmxWebServer = new JmxWebServer(config.getInetAddress(), config.getPort("JMX Web"));
            Try.run(jmxWebServer::start).getOrElseThrow(ex -> new JMacroException("Error starting JMXWebServer", ex));
        }
        return jmxWebServer;
    }

    public void load(Core core) {
        if (this.server != null && this.loaded.compareAndSet(false, true)) {
            var loader = new SPILoader<>(JMXBeanIFace.class);
            var iterator = loader.iterator();
            while (iterator.hasNext()) {
                var jmxBean = iterator.next();
                LOGGER.info("Loaded JMX Bean: " + jmxBean.getClass().getName());
                jmxBean.setCore(core);
                try {
                    this.server.register(jmxBean);
                } catch (JMException e) {
                    throw new JMacroException("Error registering " + jmxBean.getClass(), e);
                }
            }
        }
    }

    public void register(Object mbean) {
        try {
            this.server.register(mbean);
        } catch (JMException e) {
            throw new JMacroException("Error registering " + mbean.getClass());
        }
    }

    public void close() throws IOException {
        if (this.serverConfig.shouldRun()) {
            this.server.close();
        }
        if (this.webServerConfig.shouldRun()) {
            this.webServer.close();
        }
    }

    public JmxClient getClient() {
        return this.getClient(this.serverConfig.getInetAddress(), this.serverConfig.port);
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

    @Data
    public static class ServerConfig {
        private int port;
        private String address;

        private volatile Integer actualPort;
        private volatile InetAddress inetAddress;

        public ServerConfig() {
            this(-1, null);
        }

        public ServerConfig(int port, String address) {
            this.port = port;
            this.address = address;
        }


        public InetAddress getInetAddress() {
            if (this.inetAddress == null) {
                this.inetAddress = this.address != null
                    ? Try.of(() -> InetAddress.getByName(this.address)).getOrNull()
                    : Try.of(InetAddress::getLocalHost)
                    .recover(ex -> InetAddress.getLoopbackAddress())
                    .getOrNull();
            }
            return this.inetAddress;
        }

        public boolean shouldRun() {
            return this.port >= 0 && this.getInetAddress() != null;
        }

        private int getPort(String server) {
            if (this.actualPort == null) {
                if (this.port < 0) {
                    throw new IllegalStateException("Port is less then zero. Server must not run.");
                }
                this.actualPort = this.port == 0 ? NetUtils.randomPort(server) : this.port;
            }
            return this.actualPort;
        }
    }

    @Data
    public static class JMXConfig {
        private ServerConfig jmx = new ServerConfig();
        private ServerConfig web = new ServerConfig();
    }
}
