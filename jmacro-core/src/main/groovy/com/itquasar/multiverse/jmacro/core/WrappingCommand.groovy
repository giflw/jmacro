package com.itquasar.multiverse.jmacro.core


import javax.script.ScriptEngine
import java.util.function.Function
import java.util.function.Supplier

class WrappingCommand<T> extends CallableCommand {
    private final Supplier<T> targetSupplier
    private T target

    WrappingCommand(Function<WrappingCommand<T>, T> function, String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.targetSupplier = () -> function.apply(this)
    }

    WrappingCommand(T target, String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.targetSupplier = () -> target
    }

    WrappingCommand(Supplier<T> targetSupplier, String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.targetSupplier = targetSupplier
    }

    Object methodMissing(String name, Object args) {
        return methodMissingOnOrChainToContext(this, this.unwrap(), name, args)
    }

    Object propertyMissing(String name) {
        return propertyMissingOnOrChainToContext(this, this.unwrap(), name)
    }

    Object propertyMissing(String name, Object arg) {
        return propertyMissingOnOrChainToContext(this, this.unwrap(), name, arg)
    }

    T unwrap() {
        if (this.target == null) {
            this.target = this.targetSupplier.get()
        }
        return target
    }

}
