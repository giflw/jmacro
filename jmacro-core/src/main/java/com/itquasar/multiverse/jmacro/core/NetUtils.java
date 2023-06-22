package com.itquasar.multiverse.jmacro.core;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.*;
import java.util.Optional;

@Log4j2
@UtilityClass
public class NetUtils {

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

    public static Optional<Proxy> proxyFor(URI uri) {
        LOGGER.warn("Searching proxy configuration using " + uri);
        return ProxySelector.getDefault().select(uri).stream()
            .peek(it -> LOGGER.info("Proxy (existing): " + it))
            .filter(it -> it.type() == java.net.Proxy.Type.HTTP)
            .peek(it -> LOGGER.debug("Proxy (found for uri): " + it + " (" + uri + ")"))
            .findFirst();
    }

    public static String proxyAddressFor(URI uri) {
        // FIXME use configuration on jmacro.yaml to set this to false if needed
        String useSystemProxiesKey = "java.net.useSystemProxies";
        if (System.getProperty(useSystemProxiesKey) == null) {
            System.setProperty(useSystemProxiesKey, "true");
        }

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
