package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import com.itquasar.multiverse.jmacro.core.engine.ConfigurationHolder;
import com.itquasar.multiverse.jmacro.core.configuration.Credentials;
import com.itquasar.multiverse.jmacro.core.interfaces.Copyable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BrowserProxyConfiguration extends Copyable.FieldCopyable<BrowserProxyConfiguration> {

    public static BrowserProxyConfiguration DEFAULT = new BrowserProxyConfiguration();

    private boolean auto = false;
    private String host = null;
    private int port = 0;
    private String user = null;
    private ConfigurationHolder<String> password = new ConfigurationHolder<>(null, true);

    public boolean isEnabled() {
        return this.auto || this.getAddress() != null;
    }

    public String getAddress() {
        return host != null ? (port > 0 ? host + ':' + port : null) : null;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public Credentials getCredentials() {
        return new Credentials(this.getUser(), this.getPassword());
    }

    public String getCredentialsString() {
        return this.getUser() + ':' + this.getPassword();
    }

    public void setCredentials(Credentials credentials) {
        this.setUser(credentials.getLogin());
        this.setPassword(credentials.getPassword());
    }

    public void setCredentials(String credentials) {
        String[] parts = credentials.split(":", 2);
        this.setUser(parts[0]);
        this.setPassword(parts.length > 1 ? parts[2] : null);
    }

    public boolean hasCredentials() {
        return this.user != null && this.password != null;
    }
}
