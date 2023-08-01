package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.SelfConsumerCommand
import com.itquasar.multiverse.jmacro.core.configuration.Env
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.interfaces.ToMap
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine

class ConfigurationCommand extends AbstractCommand implements SelfConsumerCommand<ConfigurationCommand>, ToMap {

    private ConfigObject configs = new ConfigObject()

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


    def fill(ConfigurationCommand configuration) {
        fill(configuration.configs.toSpreadMap())
    }


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


    // FIXME support for "foo.bar" style
    boolean contains(String name) {
        return this.configs.containsKey(name)
    }

    void call(Map<String, Object> config) {
        config.entrySet().each { entry ->
            this.configs[entry.key] = entry.value
        }
    }

    ConfigurationCommand set(String name, def value) {
        this.configs[name] = value
        return this
    }

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
    <T> T get(String key, T defaultValue = null) {
        scriptLogger.debug("Getting '$key' from Configuration")
        if (key.contains('.')) {
            return traversePath(key, defaultValue)
        }
        T value = this.configs.get(key) as T
        if (defaultValue != null) {
            return value != null ? value : defaultValue
        }
        return value != null ? value : propertyMissing(key) as T
    }

    @CompileDynamic
    <T> T traversePath(String path, T defaultValue) {
        def value = this.configs
        for (String key : path.split("\\.")) {
            // using get method we avoid automatic creation of non existing property/key
            if (value instanceof Map) {
                value = value.containsKey(key) ? value.get(key) : null
            } else {
                value = value."$key"
            }
            scriptLogger.debug("Getting '$path' from Configuration: $key -> $value")
            if (value == null) {
                return defaultValue
            }
        }
        return value as T
    }


    // FXIME should listen to core configuration changes an copy refs to here
    @CompileDynamic
    def propertyMissing(String name) {
        scriptLogger.debug("Searching property '$name' missing on configuration")
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
