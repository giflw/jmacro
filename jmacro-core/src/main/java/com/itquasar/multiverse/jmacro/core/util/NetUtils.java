package com.itquasar.multiverse.jmacro.core.util;

import com.itquasar.multiverse.jmacro.core.configuration.InitializationProvider;
import com.itquasar.multiverse.jmacro.core.engine.Engine;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.*;
import java.util.Optional;

@Log4j2
public class NetUtils implements InitializationProvider {

    /*
     * Need to run as soon as possible to avoid initialization of proxy without this property set.
     * Called by {@link Engine} static initialization.
     */
    public Runnable initializator(Engine engine) {
        return () -> {
            // FIXME use configuration on jmacro.yaml to set this to false if needed
            String useSystemProxiesKey = "java.net.useSystemProxies";
            if (System.getProperty(useSystemProxiesKey) == null) {
                System.setProperty(useSystemProxiesKey, "true");
            }
        };
    }

    public static int randomPort() {
        return randomPort(null);
    }

    public static int randomPort(String server) {
        try (ServerSocket serverSocket = new ServerSocket(0)) {
            int port = serverSocket.getLocalPort();
            if (server != null) {
                LOGGER.warn("Using random port " + port + " for " + server + " server.");
            }
            return port;
        } catch (IOException exception) {
            LOGGER.error("Not able to find a free port.", exception);
            return 0;
        }
    }

    public static Optional<Proxy> proxyFor(String uri) {
        return proxyFor(URI.create(uri));
    }

    public static Optional<Proxy> proxyFor(URI uri) {
        LOGGER.warn("Searching proxy configuration using " + uri);
        return ProxySelector.getDefault().select(uri).stream()
            .peek(it -> LOGGER.info("Proxy (existing): " + it))
            .filter(it -> it.type() == java.net.Proxy.Type.HTTP)
            .peek(it -> LOGGER.debug("Proxy (found for uri): " + it + " (" + uri + ")"))
            .findFirst();
    }

    public static String proxyAddressFor(URI uri) {
        String proxyAddress = null;
        Optional<Proxy> proxy = proxyFor(uri);
        if (proxy.isPresent() && proxy.get().address() instanceof InetSocketAddress address) {
            proxyAddress = address.getHostName() + ":" + address.getPort();
            LOGGER.warn("Using proxy address " + proxyAddress + " for uri " + uri);
        }
        return proxyAddress;
    }

    public static String proxyAddressFor(String uri) {
        return proxyAddressFor(URI.create(uri));
    }

}
