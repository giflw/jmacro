package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import com.itquasar.multiverse.jmacro.commands.base.commands.configuration.ConfigurationHolder;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import com.itquasar.multiverse.jmacro.core.interfaces.Copyable;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BrowserConfiguration implements Constants, Copyable<BrowserConfiguration> {

    private String vendor = AUTO;

    /**
     * true -> visible;  false -> headless
     */
    private boolean visible = false;
    /**
     * driver binary path
     */
    private String driver = null;
    /**
     * browser binary path or path#version
     */
    private String binary = null;
    /**
     * browser binary version
     */
    private String version = null;
    /**
     * driver debug
     */
    private boolean debug = false;
    /**
     * ignore SSL errors
     */
    private boolean ignoreSSL = false;
    /**
     * Extra driver capabilities
     */
    private ConfigurationHolder<List<String>> capabilities = new ConfigurationHolder<>(new ArrayList<>(0));

    private ConfigurationHolder<BrowserProxyConfiguration> proxy = new ConfigurationHolder<>(BrowserProxyConfiguration.DEFAULT);

    public List<String> getCapabilities() {
        return capabilities.get();
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities.set(capabilities);
    }

    public void addCapability(String capability) {
        this.capabilities.get().add(capability);
    }

    public void addCapabilities(List<String> capabilities) {
        this.capabilities.get().addAll(capabilities);
    }

    public BrowserProxyConfiguration getProxy() {
        return proxy.get();
    }

    public void setProxy(BrowserProxyConfiguration proxy) {
        this.proxy.set(proxy);
    }

    @Override
    public BrowserConfiguration copy() {
        return this.toBuilder().capabilities(capabilities.copy()).proxy(proxy.copy()).build();
    }
}
