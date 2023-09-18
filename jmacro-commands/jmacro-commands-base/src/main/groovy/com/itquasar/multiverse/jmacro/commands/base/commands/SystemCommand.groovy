package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.Command
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import groovy.transform.CompileDynamic
import lombok.Getter

import javax.script.ScriptEngine

@Getter
class SystemCommand extends AbstractCommand {


    private Map<String, Object> commands = new LinkedHashMap<>()

    SystemCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware)
    }


    @Override
    void allCommandsRegistered(Collection<? extends Command> commands) {
        if (commands.isEmpty()) {
            this.commands.putAll(this.getBindings())
            this.commands = Collections.unmodifiableMap(this.commands)
        }
    }


    @CompileDynamic
    def methodMissing(String name, def args) {
        return args ? this.commands."$name".call(*args) : this.commands."$name".call()
    }


    @CompileDynamic
    def propertyMissing(String name) {
        return this.commands."$name"
    }


    def env(String name) {
        return System.getenv(name)
    }


    def prop(String name) {
        return System.getProperty(name)
    }

}
