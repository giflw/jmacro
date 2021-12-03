package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import lombok.Getter

import javax.script.ScriptContext
import javax.script.ScriptEngine
import java.util.concurrent.atomic.AtomicBoolean

@Getter
class SystemCommand extends Command {

    private final AtomicBoolean locked = new AtomicBoolean(false);

    private Map<String, Object> commands = new LinkedHashMap<>();

    SystemCommand(JMacroCore core, ScriptEngine engine) {
        super(core, engine)
    }

    void lock() {
        if (this.locked.compareAndSet(false, true)) {
            this.commands.putAll(this.engine.getContext().getBindings(ScriptContext.ENGINE_SCOPE));
            this.commands = Collections.unmodifiableMap(this.commands);
        }
    }

    def methodMissing(String name, def args) {
        return args ? this.commands."$name"(args) : this.commands."$name"()
    }

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