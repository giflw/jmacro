package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap;

import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.AuthUser;
import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.GuestUser;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static javax.naming.Context.*;

public interface LDAPConstants {

    AuthUser GUEST = new GuestUser();

    String BASE_DIRECTORY = "ldap.baseDir";

    String TEMPLATE_DN = "ldap.template.dn";

    /**
     * DN to be used in findUser feature
     */
    String TEMPLATE_DN_FIND = "ldap.template.findUser.dn";

    Map<String, String> DYNAMIC_PROPERTIES = new LinkedHashMap<>() {
        {
            this.put("directory", BASE_DIRECTORY);
            this.put("dn", TEMPLATE_DN);
            this.put("dnFind", TEMPLATE_DN_FIND);
            this.put("factory", INITIAL_CONTEXT_FACTORY);
            this.put("factoryPkgs", URL_PKG_PREFIXES);
            this.put("providerUrl", PROVIDER_URL);
            this.put("credentials", SECURITY_CREDENTIALS);
            this.put("principal", SECURITY_PRINCIPAL);
            this.put("authentication", SECURITY_AUTHENTICATION);
            this.put("protocol", SECURITY_PROTOCOL);
            this.put("referral", REFERRAL);
        }
    };

    Set<String> DYNAMIC_PROPS_NAMES = Collections.unmodifiableSet(DYNAMIC_PROPERTIES.keySet());

}
