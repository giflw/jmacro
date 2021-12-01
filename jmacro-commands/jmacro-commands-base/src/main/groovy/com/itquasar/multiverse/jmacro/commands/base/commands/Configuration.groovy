package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Env
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.configuration.Configuration as JMacroConfiguration

class Configuration implements GroovyCommand {

    JMacroConfiguration jMacroConfiguration
    ConfigObject configs = new ConfigObject()
    private excludeKeys = Credentials.declaredFields.collect { it.name }

    Configuration(JMacroConfiguration jMacroConfiguration) {
        this.jMacroConfiguration = jMacroConfiguration
    }

    def fill(Configuration configuration) {
        fill(configuration.configs)
    }

    def fill(Map<String, ?> values) {
        values.each { key, value ->
            if (key in excludeKeys) {
                return
            }
            this[key] = value
        }
        this['env'] = this['env'] ? Env.env(this['env']) : Env.env("DEV")
        return this
    }

    // FIXME is this really needed???
    boolean getVisible() {
        return this.configs.visible != null ? this.configs.visible : true
    }

    def set(String name, value) {
        this.configs[name] = value
        return this
    }

    def get(String name) {
        def value = this.configs[name] ? this.configs[name] : null
        return value == null && this.jMacroConfiguration.hasProperty(name) ? this.jMacroConfiguration."$name" : value
    }

    def propertyMissing(String name) {
        if (this.configs.hasVariable(name)) {
            return this.configs.getVariable(name)
        }
        if (this.jMacroConfiguration.hasProperty(name)) {
            return this.jMacroConfiguration."$name"
        }
        throw new MissingPropertyException("Property $name not found!")
    }

    @Override
    String toString() {
        return "Configuration{" +
            "configs=" + configs +
            '}';
    }
}
