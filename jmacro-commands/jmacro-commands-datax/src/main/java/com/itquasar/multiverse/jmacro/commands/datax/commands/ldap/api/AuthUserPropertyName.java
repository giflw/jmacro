package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api;


public interface AuthUserPropertyName {

    String getName();

    record SimpleAuthUserPropertyName(String name) implements AuthUserPropertyName {
        @Override
        public String getName() {
            return this.name();
        }
    }
}
