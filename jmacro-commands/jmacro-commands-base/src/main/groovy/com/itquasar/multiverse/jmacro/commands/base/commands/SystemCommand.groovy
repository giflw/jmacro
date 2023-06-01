package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.Doc
import groovy.transform.CompileDynamic
import lombok.Getter

import javax.script.ScriptEngine

@Getter
class SystemCommand extends Command {

    @Doc("Registered commands with this script engine instance.")
    private Map<String, Object> commands = new LinkedHashMap<>();

    SystemCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Doc("Called after all commands where loaded and registered in the script engine context.")
    @Override
    void allCommandsRegistered() {
        if (commands.isEmpty()) {
            this.commands.putAll(this.getBindings());
            this.commands = Collections.unmodifiableMap(this.commands);
        }
    }

    @Doc("Redirect missing method call to command list, calling command by given name with given arguments (if any).")
    @CompileDynamic
    def methodMissing(String name, def args) {
        return args ? this.commands."$name".call(*args) : this.commands."$name".call()
    }

    @Doc("Redirect missing method call to command list, returning command of given name.")
    @CompileDynamic
    def propertyMissing(String name) {
        return this.commands."$name"
    }

    @Doc("Get value of given environment variable name.")
    def env(String name) {
        return System.getenv(name)
    }

    @Doc("Get value of given system property name.")
    def prop(String name) {
        return System.getProperty(name)
    }

}
