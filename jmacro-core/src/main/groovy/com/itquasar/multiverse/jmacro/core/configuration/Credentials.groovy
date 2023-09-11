package com.itquasar.multiverse.jmacro.core.configuration


import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.ToMap
import com.kstruct.gethostname4j.Hostname
import groovy.transform.ToString
import groovy.util.logging.Log4j2
import org.apache.hc.client5.http.auth.AuthScope
import org.apache.hc.client5.http.auth.CredentialsProvider
import org.apache.hc.client5.http.auth.NTCredentials
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials
import org.apache.hc.core5.http.protocol.HttpContext

@Log4j2("LOGGER")
@ToString(includePackage = false, includeFields = true, includeNames = true, includes = ["domain", "login", "hostname", "impersonate"])
class Credentials implements CredentialsProvider, ToMap {

    String domain
    String login
    String password
    String hostname
    String impersonate
    String token
    String key

    Credentials() {
        this.reset()
    }

    Credentials(String login, String password) {
        this.login = login
        this.password = password
    }

    Credentials(String token) {
        this.token = token
    }

    Credentials(Map<String, ?> values) {
        this()
        values.forEach(this::setProperty)
    }

    Credentials check() {
        if (!exists()) {
            throw new JMacroException(this, 'Credentials not informed!')
        }
        return this
    }

    boolean exists() {
        return (login && password) || token || (login && key)
    }

    Credentials clear() {
        login = null
        password = null
        hostname = null
        domain = null
        impersonate = null
        token = null
        key = null
        return this
    }

    Credentials reset() {
        this.clear()
        hostname = Hostname.getHostname()
        return this
    }

    static Credentials of(String token) {
        return of(token: token)
    }

    static Credentials of(String login, String password, String domain = null) {
        if (login.contains('\\')) {
            domain = login.substring(0, login.indexOf('\\'))
            login = login.substring(login.indexOf('\\') + 1)
        }
        return of(login: login, password: password, domain: domain)
    }

    static Credentials of(Map<String, ?> values) {
        def cred = new Credentials(values)
        return cred.update(values)
    }

    Credentials fill(Credentials credentials) {
        return this.fill(credentials.toMap())
    }

    Credentials fill(Map<String, ?> values) {
        login = values.login
        password = values.password
        hostname = values.hostname
        domain = values.domain
        impersonate = values.impersonate
        token = values.token
        key = values.key
        return this
    }

    Credentials update(Credentials credentials) {
        return this.fill(credentials.toMap())
    }

    Credentials update(Map<String, ?> values) {
        login = values.login ?: this.login
        password = values.password ?: this.password
        hostname = values.hostname ?: this.hostname
        domain = values.domain ?: this.domain
        impersonate = values.impersonate ?: this.impersonate
        token = values.token ?: this.token
        key = values.key ?: this.key
        return this
    }

    Credentials setPassword(char[] password) {
        this.setPassword(password != null ? String.valueOf(password) : null)
        return this
    }

    Credentials setPassword(String password) {
        this.password = password
        return this
    }

    String getDomainUser() {
        return "${domain ? domain + '\\' : ''}$login"
    }

    String getImpersonate() {
        return impersonate ?: login
    }

    String getDomainImpersonate() {
        return impersonate ? "$domain\\$impersonate" : domainUser
    }

    @Override
    org.apache.hc.client5.http.auth.Credentials getCredentials(AuthScope authScope, HttpContext context) {
        LOGGER.debug("Auth scope: $authScope")
        switch (authScope.schemeName) {
            case 'NTLM':
                return new NTCredentials(login, password.toCharArray(), hostname, domain)
        }
        return new UsernamePasswordCredentials(login, (password != null ? password : '').toCharArray())
    }

    @Override
    <A, B> Map<A, B> toMap() {
        return this.properties
    }
}
