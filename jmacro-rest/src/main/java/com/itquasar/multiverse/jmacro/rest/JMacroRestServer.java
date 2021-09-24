package com.itquasar.multiverse.jmacro.rest;

import io.javalin.Javalin;

public class JMacroRestServer {

    public static void main(String[] args) {
        var app = Javalin.create()
                .get("/*", (ctx) -> JMacroRestServer.class.toString());
        app.start(7000);
    }

}
