package com.itquasar.multiverse.jmacro.core;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.ServerSocket;

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
}
