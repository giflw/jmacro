package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap;

import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.AbstractAuthUser;
import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.AuthUserPropertyName;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.extern.log4j.Log4j2;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Log4j2
public class LDAPUser extends AbstractAuthUser {

    private static final long serialVersionUID = 1L;
    private static final int MAX_RESULTS = 1;

    private final Map<String, String> properties;

    LDAPUser(NamingEnumeration<SearchResult> cursor) throws IllegalArgumentException {
        Map<String, String> attributes = new HashMap<>();
        int i = 0;
        while (cursor.hasMoreElements() && i <= MAX_RESULTS) {
            SearchResult result = cursor.nextElement();
            Attributes atts = result.getAttributes();
            NamingEnumeration<? extends Attribute> attsEnum = atts.getAll();
            while (attsEnum.hasMoreElements()) {
                Attribute att = attsEnum.nextElement();
                try {
                    attributes.put(att.getID().toLowerCase(), att.get().toString());
                } catch (NamingException ex) {
                    LOGGER.error("Error parsing LDAP attributes.", ex);
                }
            }
            i++;
            LOGGER.debug("LDAPUser atributes: {}.", attributes);
        }
        if (i > 1) {
            throw new JMacroException("Multiple records found.");
        }
        this.properties = Collections.unmodifiableMap(attributes);
    }

    @Override
    public String getLogin() {
        String uid = this.getProperty("uid");
        return uid != null ? uid : this.getProperty("cn");
    }

    @Override
    protected Map<String, String> getProperties() {
        return this.properties;
    }

    @Override
    public Set<AuthUserPropertyName> getPropertyNames() {
        return this.properties.keySet().stream()
            .map(AuthUserPropertyName.SimpleAuthUserPropertyName::new)
            .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        var props = this.properties.keySet().stream()
            .reduce("", (acc, it) -> acc + "; " + it + ":" + this.properties.get(it));
        return this.getClass().getSimpleName() + "#" + props;
    }

    private Integer stringToInteger(String str) {
        Integer i = -1;
        try {
            i = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            LOGGER.error("Error converting value '{}' to positive number.", str, e);
        }
        return i;
    }

    /**
     * @return Field value, or -1 if null or non number.
     */
    public Integer getPropertyNumericPositive(AuthUserPropertyName field) {
        String cod = this.getProperty(field);
        return cod == null ? -1 : stringToInteger(cod);
    }

    public int getPropertyNumericPositive(AuthUserPropertyName field, int defaultValue) {
        Integer value = LDAPUser.this.getPropertyNumericPositive(field);
        return value != null ? value : defaultValue;
    }

}
