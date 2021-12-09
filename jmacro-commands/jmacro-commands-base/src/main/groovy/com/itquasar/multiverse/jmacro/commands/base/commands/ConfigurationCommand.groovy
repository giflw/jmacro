package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Env
import com.itquasar.multiverse.jmacro.core.JMacroCore

import javax.script.ScriptEngine

class ConfigurationCommand extends Command {

    ConfigObject configs = new ConfigObject()
    private excludeKeys = CredentialsCommand.declaredFields.collect { it.name }

    ConfigurationCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
    }

    def fill(ConfigurationCommand configuration) {
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

    def contains(String name) {
        return this.configs.containsKey(name)
    }

    def propertyMissing(String name, def value) {
        this.configs[name] = value
        return this
    }

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
