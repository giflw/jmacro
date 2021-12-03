package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
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
class CredentialsCommand extends Command implements CredentialsProvider {

    String login
    String password
    String hostname = Hostname.getHostname()
    String domain
    String impersonate
    String token
    String apiKey

    CredentialsCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
    }

    void check() {
        if (!exists()) {
            throw new JMacroException(this, 'Credentials not informed!')
        }
    }

    boolean exists() {
        return (login && password) || token || (login && apiKey)
    }

    void fill(CredentialsCommand credentials) {
        login = credentials.login
        password = credentials.password
        hostname = credentials.hostname ?: this.hostname
        domain = credentials.domain
        impersonate = credentials.impersonate
        token = credentials.token
        apiKey = credentials.apiKey
    }

    void fill(Map<String, ?> values) {
        login = values.login
        password = values.password
        hostname = values.hostname ?: this.hostname
        domain = values.domain
        impersonate = values.impersonate
        token = values.token
        apiKey = values.apiKey
    }

    String getPassword() {
        return password
    }

    void setPassword(char[] password) {
        this.password = String.valueOf(password)
    }

    String getFullUser() {
        return "$domain\\$login"
    }

    String getImpersonate() {
        return impersonate ?: login
    }

    String getFullImpersonate() {
        return impersonate ? "$domain\\$impersonate" : fullUser
    }

    @Override
    HttpCredentials getCredentials(AuthScope authScope, HttpContext context) {
        log.debug("Auth scope: $authScope")
        switch (authScope.schemeName) {
            case 'NTLM':
                return new NTCredentials(login, password.toCharArray(), hostname, domain)
        }
        return new UsernamePasswordCredentials(login, password.toCharArray())
    }

}
