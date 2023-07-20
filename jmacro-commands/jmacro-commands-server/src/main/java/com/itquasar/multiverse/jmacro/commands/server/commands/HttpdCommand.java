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

    public Httpd init() {
        return this.init(new HttpdConfig());
    }

    public Httpd init(int port) {
        return this.init(new HttpdConfig(port));
    }
    public Httpd init(String host, int port) {
        return this.init(new HttpdConfig(host, port));
    }

    public Httpd init(HttpdConfig httpdConfig) {
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
        return this.call(this.init(), routeConfigurator);
    }

    public Httpd call(int port, Consumer<Httpd> routeConfigurator) {
        return this.call(this.init(port), routeConfigurator);
    }

    public Httpd call(String address, int port, Consumer<Httpd> routeConfigurator) {
        return this.call(this.init(address, port), routeConfigurator);
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
