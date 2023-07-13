package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Env
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.SelfClosureCallableCommand
import com.itquasar.multiverse.jmacro.core.command.Doc
import com.itquasar.multiverse.jmacro.core.interfaces.ToMap
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

@Doc("Hold script engine configuration, shared on `include`.")
class ConfigurationCommand extends SelfClosureCallableCommand implements ToMap {

    @Doc("Hold script context configurations.")
    private ConfigObject configs = new ConfigObject()

    @Doc("List of keys that are held on `credentials` command instead of `configuration`.")
    private excludeKeys = CredentialsCommand.declaredFields.collect { it.name }

    ConfigurationCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    ConfigObject getConfigs() {
        return configs
    }

    @Override
    <A, B> Map<A, B> toMap() {
        return configs
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
        this['env'] = this['env'] ? (Env.isInstance(this['env']) ? Env.env((Env) this['env']) : Env.env((String) this['env'])) : Env.env("DEV")
        return this
    }

    @Doc("Check i given name is key on this `configuration` instance.")
    // FIXME support for "foo.bar" style
    def contains(String name) {
        return this.configs.containsKey(name)
    }

    @Doc("Map missing property setter to map put on `configs` field.")
    // FIXME should support "foo.bar" style for hierarchical assignment
    def propertyMissing(String name, def value) {
        scriptLogger.warn("Setting new entry: $name -> $value")
        this.configs[name] = value
        return this
    }

    <T> T getAt(String path) {
        return get(path, null)
    }

    @CompileDynamic
    <T> T get(String path, T defaultValue = null) {
        scriptLogger.warn("Getting '$path' from Configuration")
        def value = this.configs
        for(String key: path.split("\\.")) {
            // using get method we avoid automatic creation of non existing property/key
            value = value.get(key)
            scriptLogger.warn("Getting '$path' from Configuration: $key -> $value")
            if (value == null) {
                return defaultValue
            }
        }
        return (value != null ? value : defaultValue) as T
    }

    @Doc("""
        Map missing property getter to map get on `configs` field.
        If not found, redirect to `core.configuration`, or else to script context attribute.
    """)
    // FXIME should listen to core configuration changes an copy refs to here
    @CompileDynamic
    def propertyMissing(String name) {
        def value = this.configs.containsKey(name) ? this.configs[name] : null
        value = value == null && this.core.configuration.hasProperty(name) ? this.core.configuration."$name" : value
        value = value != null ? value : this.context.getAttribute(name)
        return value
    }

    @Override
    String toString() {
        return configs.toString()
    }
}
