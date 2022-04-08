package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api;

import java.util.Map;
import java.util.Set;

public abstract class AbstractAuthUser implements AuthUser {

    private static final long serialVersionUID = 1L;

    protected abstract Map<String, String> getProperties();

    @Override
    public String getProperty(String key) {
        return getProperty(key, "");
    }

    @Override
    public String getProperty(String key, String defaultValue) {
        String value = this.getProperties().get(key);
        return value != null ? value : defaultValue;
    }

    @Override
    public String getProperty(AuthUserPropertyName name) {
        return this.getProperty(name.getName());
    }

    @Override
    public String getProperty(AuthUserPropertyName name, String defaultValue) {
        return this.getProperty(name.getName(), defaultValue);
    }

    @Override
    public Set<String> getKeys() {
        return getProperties().keySet();
    }

}
