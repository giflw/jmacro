package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.CallableCommand
import com.itquasar.multiverse.jmacro.core.command.Command
import com.itquasar.multiverse.jmacro.core.command.ConfigurationAwareCommand
import com.itquasar.multiverse.jmacro.core.engine.ConfigurationHolder
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptConfiguration
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.itquasar.multiverse.jmacro.core.exception.JMacroException

import java.util.function.Consumer

class ConfigurationCommand extends AbstractCommand implements CallableCommand<Consumer<ConfigurationCommand>, ConfigurationCommand>, Iterable {

    private final ScriptConfiguration configuration

    ConfigurationCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
        this.configuration = scriptEngineAware.configuration()
    }

    private ConfigObject getCustom() {
        return this.configuration.custom
    }

    private Map<String, ConfigurationHolder> getConfigHolders() {
        return this.configuration.configHolders
    }

    @Override
    void allCommandsRegistered(Collection<? extends Command> commands) {
        commands.stream().filter { it instanceof ConfigurationAwareCommand }
            .map { it as ConfigurationAwareCommand }
            .forEach { ConfigurationAwareCommand command ->
                scriptLogger.warn("Loading configuration holder for command ${command.name}")
                this.configHolders.put(command.getName(), command.getConfiguration())
            }
    }

    @Override
    ConfigurationCommand call(Consumer<ConfigurationCommand> consumer) {
        consumer.accept(this)
        return this
    }

    ConfigurationCommand setAt(String name, def value) {
        return set(name, value)
    }

    ConfigurationCommand set(String name, def value) {
        if (this.configHolders.containsKey(name)) {
            this.configHolders[name].set(value)
        } else {
            this.custom.putAt(name, value)
        }
        return this
    }

    <T> T getAt(String path, T defaultValue = null) {
        return get(path, defaultValue)
    }

    <T> T get(String key, T defaultValue = null) {
        scriptLogger.debug("Getting '$key' from Configuration")
        return innerPropertyMissing(key, defaultValue)
    }

    private <T> T innerPropertyMissing(String key, T defaultValue = null) {
        if (this.configHolders.containsKey(key)) {
            return (this.configHolders.get(key)?.get() ?: defaultValue) as T
        }
        if (this.custom.containsKey(key)) {
            return this.custom.get(key, null)
        }
        return (this.core.configuration.hasProperty(name) ? this.core.configuration.getAt(name) : defaultValue) as T
    }

    def propertyMissing(String name) {
        scriptLogger.debug("Searching property '$name' missing on configuration")
        def value = innerPropertyMissing(name)
        value = value != null ? value : this.context.getAttribute(name)
        return value
    }

    def propertyMissing(String name, def value) {
        throw new JMacroException("Property missing redirect is disabled in configuration")
    }

    def methodMissing(String name, def args) {
        scriptLogger.debug("Calling method '$name' missing on configuration")
        return configuration.invokeMethod(name, args)
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
