package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap;

import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.AuthUser;
import lombok.extern.log4j.Log4j2;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import java.text.MessageFormat;
import java.util.Map;
import java.util.Properties;

@Log4j2
public class LDAPAuthenticator implements LDAPConstants, AutoCloseable {

    private Map<String, String> configuration = null;
    private DirContext ctx = null;

    public void configure(Map<String, String> config) {
        this.configuration = config;
    }

    public AuthUser authenticate(String login, String password) {
        return findUser(login, password, login);
    }

    public AuthUser findUser(String userToAuth, String password, String userToFind) {
        AuthUser authUser = GUEST;

        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        NamingEnumeration<SearchResult> cursor = null;

        searchControls.setReturningAttributes(null);
        // login used to search
        String findUserDN = MessageFormat.format(configuration.get(TEMPLATE_DN_FIND), userToFind);
        String authUserDN = createDN(userToAuth);
        LOGGER.debug("User DN: Auth=[{}], Find=[{}]", authUserDN, findUserDN);

        Properties env = new Properties();
        env.putAll(this.configuration);

        env.setProperty(Context.SECURITY_PRINCIPAL, authUserDN);
        env.setProperty(Context.SECURITY_CREDENTIALS, password);

        this.ctx = LDAPUtil.getContext(env);
        try {
            cursor = this.ctx.search(configuration.get(BASE_DIRECTORY), findUserDN, searchControls);
            authUser = new LDAPUser(cursor);
            LOGGER.debug("AuthUser: {}", authUser);
        } catch (NamingException | NullPointerException | IllegalArgumentException ex) {
            LOGGER.error("Error authenticating on LDAP.", ex);
        }
        this.close();
        return authUser;
    }

    @Override
    public void close() {
        try {
            if (this.ctx != null) {
                this.ctx.close();
            }
        } catch (NamingException | IllegalArgumentException ex) {
            LOGGER.error("Error closing LDAP context", ex);
        }
    }

    private String createDN(String login) {
        return MessageFormat.format(configuration.get(TEMPLATE_DN), login);
    }

}
