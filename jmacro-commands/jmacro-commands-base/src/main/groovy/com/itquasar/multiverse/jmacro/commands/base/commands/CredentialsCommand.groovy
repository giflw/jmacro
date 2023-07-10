package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.ToMap
import com.kstruct.gethostname4j.Hostname
import groovy.transform.ToString
import org.apache.hc.client5.http.auth.AuthScope
import org.apache.hc.client5.http.auth.Credentials as HttpCredentials
import org.apache.hc.client5.http.auth.CredentialsProvider
import org.apache.hc.client5.http.auth.NTCredentials
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials
import org.apache.hc.core5.http.protocol.HttpContext

import javax.script.ScriptEngine

@ToString(includePackage = false, includeFields = true, includeNames = true, includes = ['login', 'impersonate', 'hostname', 'domain'])
class CredentialsCommand extends Command implements CredentialsProvider, ToMap {

    String login
    String password
    String hostname
    String domain
    String impersonate
    String token
    String key

    CredentialsCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.reset()
    }

    CredentialsCommand check() {
        if (!exists()) {
            throw new JMacroException(this, 'Credentials not informed!')
        }
        return this
    }

    boolean exists() {
        return (login && password) || token || (login && key)
    }

    CredentialsCommand clear() {
        login = null
        password = null
        hostname = null
        domain = null
        impersonate = null
        token = null
        key = null
        return this
    }

    CredentialsCommand reset() {
        this.clear()
        hostname = Hostname.getHostname()
        return this
    }

    def call(Closure closure) {
        return callDelegating(this, closure)
    }

    void fill(CredentialsCommand credentials) {
        this.fill(credentials.toMap())
    }

    void fill(Map<String, ?> values) {
        login = values.login
        password = values.password
        hostname = values.hostname
        domain = values.domain
        impersonate = values.impersonate
        token = values.token
        key = values.key
    }

    CredentialsCommand update(CredentialsCommand credentials) {
        return this.fill(credentials.toMap())
    }

    CredentialsCommand update(Map<String, ?> values) {
        login = values.login ?: this.login
        password = values.password ?: this.password
        hostname = values.hostname ?: this.hostname
        domain = values.domain ?: this.domain
        impersonate = values.impersonate ?: this.impersonate
        token = values.token ?: this.token
        key = values.key ?: this.key
        return this
    }

    CredentialsCommand of(String token) {
        return of(token: token)
    }

    CredentialsCommand of(String login, String password, String domain = null) {
        if (login.contains('\\')) {
            domain = login.substring(0, login.indexOf('\\'))
            login = login.substring(login.indexOf('\\') + 1)
        }
        return of(login: login, password: password, domain: domain)
    }

    CredentialsCommand of(Map<String, ?> values) {
        def cred = new CredentialsCommand("credentials", core, scriptEngine)
        return cred.update(values)
    }

    CredentialsCommand setPassword(char[] password) {
        this.setPassword(password != null ? String.valueOf(password) : null)
        return this
    }

    CredentialsCommand setPassword(String password) {
        this.password = password
        return this
    }

    String getFullUser() {
        return "${domain ? domain + '\\': ''}$login"
    }

    String getImpersonate() {
        return impersonate ?: login
    }

    String getFullImpersonate() {
        return impersonate ? "$domain\\$impersonate" : fullUser
    }

    @Override
    HttpCredentials getCredentials(AuthScope authScope, HttpContext context) {
        scriptLogger.debug("Auth scope: $authScope")
        switch (authScope.schemeName) {
            case 'NTLM':
                return new NTCredentials(login, password.toCharArray(), hostname, domain)
        }
        return new UsernamePasswordCredentials(login, (password != null ? password : '').toCharArray())
    }

    @Override
    <A, B> Map<A, B> toMap() {
        this.properties
    }
}
