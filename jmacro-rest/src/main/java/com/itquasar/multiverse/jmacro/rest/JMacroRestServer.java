package com.itquasar.multiverse.jmacro.rest;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import io.javalin.Javalin;

public class JMacroRestServer {

    public static void main(String[] args) {
        var serverAddress = "localhost";
        var jmxPort = 9001;
        var restPort = 8080;
        var jmacro = new JMacroCore(serverAddress, jmxPort);

        var app = Javalin.create();
        app.start("0.0.0.0", restPort);
        app.get("/management", (ctx) -> ctx.result(jmacro.getJmxManagement().getClient().getBeanNames().toString()));
    }

}
