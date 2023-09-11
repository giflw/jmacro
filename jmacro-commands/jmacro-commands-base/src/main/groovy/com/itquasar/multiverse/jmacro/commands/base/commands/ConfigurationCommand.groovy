package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.commands.configuration.ConfigurationAwareCommand
import com.itquasar.multiverse.jmacro.commands.base.commands.configuration.ConfigurationHolder
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CallableCommand
import com.itquasar.multiverse.jmacro.core.command.Command
import com.itquasar.multiverse.jmacro.core.engine.Core
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.util.function.Consumer

class ConfigurationCommand extends AbstractCommand implements CallableCommand<Consumer<ConfigurationCommand>, ConfigurationCommand>, Iterable {

    private Map<String, ConfigurationHolder> configHolders = new LinkedHashMap<>()
    private ConfigObject custom = new ConfigObject()

    ConfigurationCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Override
    void allCommandsRegistered(Collection<? extends Command> commands) {
        commands.stream().filter { it -> it instanceof ConfigurationAwareCommand }.
            forEach { ConfigurationAwareCommand command ->
                scriptLogger.warn("Loading configuration holder for command ${command.name}")
                this.configHolders.put(command.getName(), command.getConfiguration())
            }
    }

    @Override
    ConfigurationCommand call(Consumer<ConfigurationCommand> consumer) {
        consumer.accept(this)
        return this
    }

    ConfigurationCommand set(String name, def value) {
        if (this.configHolders.containsKey(name)) {
            scriptLogger.error("CONFIG HOLDER $name: ${this.configHolders.containsKey(name)}")
            this.configHolders[name].set(value)
        } else {
            scriptLogger.error("CONFIG CUSTOM $name: ${this.custom}")
            this.custom.putAt(name, value)
        }
        return this
    }

    <T> T getAt(String path, T defaultValue = null) {
        return get(path, defaultValue)
    }

    <T> T get(String key, T defaultValue = null) {
        scriptLogger.debug("Getting '$key' from Configuration")
        T value = (this.configHolders.get(key)?.get() ?: defaultValue) as T
        return value != null ? value : propertyMissing(key) as T
    }

    def propertyMissing(String name) {
        scriptLogger.debug("Searching property '$name' missing on configuration")
        if (this.configHolders.containsKey(name)) {
            return this.get(name, null)
        }
        def value = this.core.configuration.hasProperty(name) ? this.core.configuration.getAt(name) : null
        value = value != null ? value : this.context.getAttribute(name)
        return value
    }

    @CompileDynamic
    ConfigurationCommand fill(Map<String, String> configurations) {
        for (Map.Entry<String, String> entry : configurations) {
            List<String> paths = (entry.key.split("\\.")).toList()
            Object object = this.configHolders.containsKey(paths.first()) ? this.configHolders : null
            for (String path : paths) {
                if (object == null) {
                    scriptLogger.warn("Could not find configuration ${entry.key} (path ${path} is null). Creating custom config.")
                    this.custom.putAt(entry.key, entry.value)
                    break
                }
                if (path == paths.last()) {
                    if (object instanceof ConfigurationHolder<?>) {
                        object.setValueOf(entry.value)
                    } else {
                        object."$path" = entry.value
                    }
                    break
                }
                object = object."$path"
            }
        }
        return this
    }

    @Override
    Iterator iterator() {
        List list = new ArrayList()
        list.addAll(configHolders.entrySet())
        list.addAll(custom.entrySet())
        return list.iterator()
    }

    @Override
    String toString() {
        return [configuration: this.configHolders.toString(), custom: this.custom].toString()
    }
}
