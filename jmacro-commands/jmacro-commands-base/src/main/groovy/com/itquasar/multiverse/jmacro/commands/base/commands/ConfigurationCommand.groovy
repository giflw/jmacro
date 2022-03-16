package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Env
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.Doc
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

@Doc("Hold script engine configuration, shared on `include`.")
class ConfigurationCommand extends CallableCommand {

    @Doc("Hold script context configurations.")
    ConfigObject configs = new ConfigObject()

    @Doc("List of keys that are held on `credentials` command instead of `configuration`.")
    private excludeKeys = CredentialsCommand.declaredFields.collect { it.name }

    ConfigurationCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Doc("Add all configurations from given `configuration` instance.")
    def fill(ConfigurationCommand configuration) {
        fill(configuration.configs.toSpreadMap())
    }

    @Doc("Add all configurations from given map instance.")
    def fill(Map<String, ?> values) {
        values.each { key, value ->
            if (key in excludeKeys) {
                return
            }
            this[key] = value
        }
        this['env'] = this['env'] ? Env.env((String) this['env']) : Env.env("DEV")
        return this
    }

    @Doc("Check i given name is key on this `configuration` instance.")
    def contains(String name) {
        return this.configs.containsKey(name)
    }

    @Doc("Map missing property setter to map put on `configs` field.")
    def propertyMissing(String name, def value) {
        this.configs[name] = value
        return this
    }

    @Doc("""
        Map missing property getter to map get on `configs` field.
        If not found, redirect to `core.configuration`, or else to script context attribute.
    """)
    @CompileDynamic
    def propertyMissing(String name) {
        def value = this.configs.containsKey(name) ? this.configs[name] : null
        value = value == null && this.core.configuration.hasProperty(name) ? this.core.configuration."$name" : value
        value = value != null ? value : this.context.getAttribute(name)
        return value
    }

    @Override
    String toString() {
        return "Configuration{configs=${configs}}"
    }
}
