package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api;

import java.io.Serializable;
import java.util.Set;

public interface AuthUser extends Serializable {

    String getLogin();

    /**
     * @param key
     * @return Property value or "" if value is
     * null.
     */
    String getProperty(String key);

    /**
     * @param key
     * @param defaultValue
     * @return Property value or {@code defaultValue} if value is null.
     */
    String getProperty(String key, String defaultValue);

    /**
     * @param name
     * @return Property value or "" if value is
     * null.
     */
    String getProperty(AuthUserPropertyName name);

    /**
     * @param name
     * @param defaultValue
     * @return Property value or {@code defaultValue} if value is null.
     */
    String getProperty(AuthUserPropertyName name, String defaultValue);

    Set<String> getKeys();

    Set<AuthUserPropertyName> getPropertyNames();

}
