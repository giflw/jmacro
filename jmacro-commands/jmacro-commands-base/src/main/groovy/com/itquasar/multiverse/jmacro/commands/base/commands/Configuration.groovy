package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Command
import com.itquasar.multiverse.jmacro.core.Env

class Configuration implements Command {

    ConfigObject configs = new ConfigObject()
    private excludeKeys = Credentials.declaredFields.collect { it.name }

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
        println '-' * 80
        this['env'] = this['env'] ? Env.env(this['env']) : Env.env("DEV")
        println '-' * 80
        return this
    }

    // FIXME is this really needed???
    boolean getVisible() {
        return this.configs.visible != null ? this.configs.visible : true
    }

    def set(String name, value) {
        this.configs[name] = value
    }

    def get(String name) {
        this.configs[name] ? this.configs[name] : null
    }

    def propertyMissing(String name) {
        if (this.configs.hasVariable(name)) {
            return this.configs.getVariable(name)
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
