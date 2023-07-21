package com.itquasar.multiverse.jmacro.commands.datax.commands;

import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.LDAPAuthenticator;
import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.LDAPConstants;
import com.itquasar.multiverse.jmacro.commands.datax.commands.ldap.api.AuthUser;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandUtils;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.ToMap;
import groovy.lang.Closure;

import javax.naming.Context;
import javax.script.ScriptEngine;
import java.util.LinkedHashMap;
import java.util.Map;

public class LDAPCommand extends AbstractCommand implements AutoCloseable, LDAPConstants {

    private LDAPAuthenticator authenticator = null;
    private final Map<String, String> config = new LinkedHashMap<>() {{
        put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        put(Context.URL_PKG_PREFIXES, "com.sun.jndi.url");
        put(Context.SECURITY_AUTHENTICATION, "simple");
        put(Context.REFERRAL, "ignore");
    }};
    private String login = null;
    private String password = null;

    public LDAPCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    public Map<String, String> getConfig() {
        return config;
    }

    LDAPCommand call(Closure closure) {
        CommandUtils.callDelegating(new LDAPCommand(getName(), getCore(), getScriptEngine()), closure);
        return this;
    }

    synchronized void init() {
        if (this.authenticator == null) {
            this.authenticator = new LDAPAuthenticator();
            var externalConfig = ((ToMap) this.getBindings().get("configuration")).<String, Object>toMap();
            externalConfig.forEach((key, value) -> {
                if (DYNAMIC_PROPS_NAMES.contains(key)) {
                    this.config.put(key, (String) value);
                }
            });
        }
        this.authenticator.configure(this.config);
        if (this.login == null || this.password == null) {
            Object credentials = this.getBindings().get("credentials");
            if (credentials instanceof ToMap) {
                var map = ((ToMap) credentials).<String, Object>toMap();
                this.login = this.login != null ? this.login : (String) map.get("login");
                this.password = this.password != null ? this.password : (String) map.get("password");
            }
        }
    }

    AuthUser authenticate() {
        this.init();
        return this.authenticator.authenticate(this.login, this.password);
    }

    AuthUser authenticate(String login, String password) {
        this.login = login;
        this.password = password;
        return this.authenticate();
    }

    AuthUser find(String loginToSearch, String login, String password) {
        this.login = login;
        this.password = password;
        return this.find(loginToSearch);
    }

    AuthUser find(String loginToSearch) {
        this.init();
        return this.authenticator.findUser(this.login, this.password, loginToSearch);
    }

    @Override
    public Object propertyMissing(String name) {
        if (DYNAMIC_PROPS_NAMES.contains(name)) {
            return this.config.get(DYNAMIC_PROPERTIES.get(name));
        }
        return CommandUtils.propertyMissingOnOrChainToContext(this, this.authenticator, name);
    }

    @Override
    public Object propertyMissing(String name, Object arg) {
        if (LDAPAuthenticator.DYNAMIC_PROPS_NAMES.contains(name)) {
            return this.config.put(DYNAMIC_PROPERTIES.get(name), arg != null ? arg.toString() : null);
        }
        throw new JMacroException("Property " + name + " (set) not found. Check DYNAMIC_PROPERTIES list.");
    }

    public Object methodMissing(String name, Object args) {
        return CommandUtils.methodMissingOnOrChainToContext(this, this.authenticator, name, args);
    }

    @Override
    public void close() throws Exception {
        if (this.authenticator != null) {
            this.authenticator.close();
        }
    }
}
