package com.itquasar.multiverse.jmacro.rest;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.script.Script;
import io.javalin.Javalin;
import io.javalin.http.HttpCode;
import io.javalin.http.staticfiles.Location;
import io.javalin.websocket.WsContext;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import static j2html.TagCreator.article;
import static j2html.TagCreator.attrs;
import static j2html.TagCreator.b;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;

public class JMacroRestServer {

    public static void main(String[] args) {
        var serverAddress = "localhost";
        var jmxPort = 9001;
        var restPort = 8080;
        var configuration = Configuration.load();

        System.out.println(configuration);

        var jmacro = new JMacroCore(configuration, serverAddress, jmxPort);
        jmacro.start();

        var app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableWebjars();
            config.enableDevLogging();
            config.addStaticFiles("/static", Location.CLASSPATH);
            config.addSinglePageRoot("/", "/static/index.html");
        });

        app.start("0.0.0.0", restPort);

        app.get("/system/stop", (ctx) -> jmacro.stop());

        app.get("/management", (ctx) -> ctx.result(jmacro.getJmxManagement().getClient().getBeanNames().toString()));

        app.get("/scripts", (ctx) -> ctx.json(configuration.getRepository().list()));

        app.get("/scripts/{uuid}/execute", (ctx) -> {
            String uuid = ctx.pathParam("uuid");
            Optional<Script> script = configuration.getRepository().get(UUID.fromString(uuid));
            script.ifPresentOrElse(
                (value) -> {
                    try {
                        System.out.println("RUN !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        jmacro.getEngine().execute(value);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                },
                () -> System.out.println("PUTZ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
            );
        });

        app.get("/scripts/{search}", (ctx) -> {
            var search = ctx.pathParam("search");
            var script = configuration.getRepository().get(search);
            if (script.isPresent()) {
                ctx.json(script.get());
            } else {
                ctx.status(HttpCode.BAD_REQUEST);
            }
        });

        app.ws("/chat", ws -> {
            ws.onConnect(ctx -> {

                String username = "User" + nextUserNumber++;
                userUsernameMap.put(ctx, username);
                broadcastMessage("Server", (username + " joined the chat"));

                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                    }
                    ctx.send(
                        new JSONObject()
                            .put("userMessage", createHtmlMessageFromSender("sender " + i, "NEXT MESSAGE " + i))
                            .put("userlist", userUsernameMap.values()).toString()
                    );
                }

            });
            ws.onClose(ctx -> {
                String username = userUsernameMap.get(ctx);
                userUsernameMap.remove(ctx);
                broadcastMessage("Server", (username + " left the chat"));
            });
            ws.onMessage(ctx -> {
                broadcastMessage(userUsernameMap.get(ctx), ctx.message());
            });
        });
    }

    private static Map<WsContext, String> userUsernameMap = new ConcurrentHashMap<>();
    private static int nextUserNumber = 1; // Assign to username for next connecting user

    // Sends a message from one user to all users, along with a list of current usernames
    private static void broadcastMessage(String sender, String message) {
        userUsernameMap.keySet().stream().filter(ctx -> ctx.session.isOpen()).forEach(session -> {
            session.send(
                new JSONObject()
                    .put("userMessage", createHtmlMessageFromSender(sender, message))
                    .put("userlist", userUsernameMap.values()).toString()
            );
        });
    }

    // Builds a HTML element with a sender-name, a message, and a timestamp
    private static String createHtmlMessageFromSender(String sender, String message) {
        return article(
            b(sender + " says:"),
            span(attrs(".timestamp"), new SimpleDateFormat("HH:mm:ss").format(new Date())),
            p(message)
        ).render();
    }

}
