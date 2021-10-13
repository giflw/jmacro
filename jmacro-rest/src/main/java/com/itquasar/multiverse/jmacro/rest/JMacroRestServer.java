package com.itquasar.multiverse.jmacro.rest;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import io.javalin.Javalin;
import io.javalin.http.HttpCode;
import io.javalin.http.staticfiles.Location;

public class JMacroRestServer {

    public static void main(String[] args) {
        var serverAddress = "localhost";
        var jmxPort = 9001;
        var restPort = 8080;
        var configuration = Configuration.load();
        var jmacro = new JMacroCore(configuration, serverAddress, jmxPort);

        var app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableWebjars();
            config.enableDevLogging();
            config.addStaticFiles("/static", Location.CLASSPATH);
            config.addSinglePageRoot("/", "/static/index.html");
        });

        app.start("0.0.0.0", restPort);

        app.get("/management", (ctx) -> ctx.result(jmacro.getJmxManagement().getClient().getBeanNames().toString()));

        app.get("/scripts", (ctx) -> ctx.json(
            configuration.getScriptRepository().list())
        );

        app.get("/scripts/{search}", (ctx) -> {
            var search = ctx.pathParam("search");
            var script = configuration.getScriptRepository().get(search);
            if (script.isPresent()) {
                ctx.json(script.get());
            } else {
                ctx.status(HttpCode.BAD_REQUEST);
            }
        });
    }

}
