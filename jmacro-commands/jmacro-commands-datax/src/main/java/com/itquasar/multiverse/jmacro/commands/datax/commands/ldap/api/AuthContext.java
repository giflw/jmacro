package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api;

import java.util.HashMap;
import java.util.Map;

public class AuthContext {

    public static final AuthContext EMPTY = new AuthContext();

    private final Map<String, Object> context = new HashMap<>();

    public AuthContext() {
    }

    public AuthContext(Map<String, Object> properties) {
        this.context.putAll(properties);
    }

    public AuthContext add(String property, Object value) {
        this.context.put(property, value);
        return this;
    }

    public Object get(String property) {
        return this.context.get(property);
    }

    public <T> T get(String property, Class<T> type) {
        Object value = this.context.get(property);
        if (value != null) {
            return (T) value;
        }
        throw new IllegalArgumentException("Property value is not assignable to " + type.getClass());
    }
}
