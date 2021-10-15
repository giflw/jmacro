package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import com.kstruct.gethostname4j.Hostname
import groovy.transform.ToString
import org.apache.hc.client5.http.auth.AuthScope
import org.apache.hc.client5.http.auth.Credentials as HttpCredentials
import org.apache.hc.client5.http.auth.CredentialsProvider
import org.apache.hc.client5.http.auth.NTCredentials
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials
import org.apache.hc.core5.http.protocol.HttpContext

@ToString(includePackage = false, includeFields = true, includeNames = true, includes = ['user', 'impersonate', 'hostname', 'domain', 'token', 'apiKey'])
class Credentials implements GroovyCommand, CredentialsProvider {

    String user
    String password
    String hostname = Hostname.getHostname()
    String domain
    String impersonate
    String token
    String apiKey

    Credentials() {
    }

    void check() {
        if (!exists()) {
            throw new JMacroException(this, 'Credentials not informed!')
        }
    }

    boolean exists() {
        return (user && password) || token || (user && apiKey)
    }

    void fill(Map<String, ?> values) {
        user = values.user
        password = values.password
        domain = values.domain
        impersonate = values.impersonate
        token = values.token
        apiKey = values.apiKey
    }

    String getPassword() {
        return password.toString().trim()
    }

    String getFullUser() {
        return "$domain\\$user"
    }

    String getImpersonate() {
        return impersonate ?: user
    }

    String getFullImpersonate() {
        return impersonate ? "$domain\\$impersonate" : fullUser
    }

    @Override
    HttpCredentials getCredentials(AuthScope authScope, HttpContext context) {
        log.debug("Auth scope: $authScope")
        switch (authScope.schemeName) {
            case 'NTLM':
                return new NTCredentials(user, password.toCharArray(), hostname, domain)
        }
        return new UsernamePasswordCredentials(user, password.toCharArray())
    }

}
