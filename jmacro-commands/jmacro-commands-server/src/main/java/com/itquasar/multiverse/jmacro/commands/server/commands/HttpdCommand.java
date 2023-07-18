package com.itquasar.multiverse.jmacro.commands.server.commands;

import com.itquasar.multiverse.jmacro.commands.server.commands.httpd.Httpd;
import com.itquasar.multiverse.jmacro.commands.server.commands.httpd.HttpdConfig;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

public class HttpdCommand extends AbstractCommand implements AutoCloseable {

    private final Map<String, Httpd> servers = new LinkedHashMap<>();

    public HttpdCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    public Httpd start() {
        return this.start(new HttpdConfig());
    }

    public Httpd start(int port) {
        return this.start(new HttpdConfig(port));
    }
    public Httpd start(String host, int port) {
        return this.start(new HttpdConfig(host, port));
    }

    public Httpd start(HttpdConfig httpdConfig) {
        return this.servers.computeIfAbsent(httpdConfig.getAddress(), key -> new Httpd(httpdConfig, getScriptLogger()));
    }

    /**
     * Helper method to create {@link HttpdConfig} instances.
     * @param configs Map of configurations to pass to {@link HttpdConfig#of(Map)}.
     * @return {@link HttpdConfig} new instance.
     */
    public HttpdConfig config(Map<String, Object> configs) {
        return HttpdConfig.of(configs);
    }

    public Httpd call(Consumer<Httpd> routeConfigurator) {
        return this.call(this.start(), routeConfigurator);
    }

    public Httpd call(int port, Consumer<Httpd> routeConfigurator) {
        return this.call(this.start(port), routeConfigurator);
    }

    public Httpd call(String address, int port, Consumer<Httpd> routeConfigurator) {
        return this.call(this.start(address, port), routeConfigurator);
    }

    private Httpd call(Httpd httpd, Consumer<Httpd> routeConfigurator) {
        routeConfigurator.accept(httpd);
        httpd.start();
        return httpd;
    }

    @Override
    public void close() throws Exception {
        this.servers.forEach((k, v) -> v.close());
    }
}
