package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api;

import java.util.Collections;
import java.util.Set;


public final class GuestUser implements AuthUser {

    public static final String USERNAME = "";
    private static final long serialVersionUID = 1L;

    public GuestUser() {
    }

    @Override
    public String getLogin() {
        return USERNAME;
    }

    @Override
    public String getProperty(String key) {
        return "";
    }

    @Override
    public String getProperty(String key, String defaultValue) {
        return defaultValue;
    }

    @Override
    public String getProperty(AuthUserPropertyName name) {
        return "";
    }

    @Override
    public String getProperty(AuthUserPropertyName name, String defaultValue) {
        return defaultValue;
    }

    @Override
    public Set<String> getKeys() {
        return Collections.emptySet();
    }

    @Override
    public Set<AuthUserPropertyName> getPropertyNames() {
        return Collections.emptySet();
    }

}
