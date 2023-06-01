package com.itquasar.multiverse.jmacro.core


import javax.script.ScriptEngine
import java.util.function.Function
import java.util.function.Supplier

class WrappingCommand<T> extends CallableCommand {
    private final Supplier<T> targetSupplier
    private T target
    private final boolean redirectMissingToContext

    WrappingCommand(Function<WrappingCommand<T>, T> function, String name, Core core, ScriptEngine scriptEngine, boolean redirectMissingToContext = true) {
        super(name, core, scriptEngine)
        this.targetSupplier = () -> function.apply(this)
        this.redirectMissingToContext = redirectMissingToContext
    }

    WrappingCommand(T target, String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.targetSupplier = () -> target
    }

    WrappingCommand(Supplier<T> targetSupplier, String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
        this.targetSupplier = targetSupplier
    }

    Object methodMissing(String name, Object args) {
        if (redirectMissingToContext) {
            return methodMissingOnOrChainToContext(this, this.unwrap(), name, args)
        }
        return this.unwrap().invokeMethod(name, args)
    }

    Object propertyMissing(String name) {
        if(redirectMissingToContext) {
            return propertyMissingOnOrChainToContext(this, this.unwrap(), name)
        }
        return this.unwrap()[name]
    }

    Object propertyMissing(String name, Object arg) {
        if(redirectMissingToContext) {
            return propertyMissingOnOrChainToContext(this, this.unwrap(), name, arg)
        }
        return this.unwrap()[name] = arg
    }

    T unwrap() {
        if (this.target == null) {
            this.target = this.targetSupplier.get()
        }
        return target
    }

}
