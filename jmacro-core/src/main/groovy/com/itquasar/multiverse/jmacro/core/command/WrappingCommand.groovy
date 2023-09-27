package com.itquasar.multiverse.jmacro.core.command

import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware

import java.util.function.Function
import java.util.function.Supplier

class WrappingCommand<T> extends AbstractCommand {
    private final Supplier<T> targetSupplier
    private T target
    private final boolean redirectMissingToContext

    WrappingCommand(Function<WrappingCommand<T>, T> function, Core core, ScriptEngineAware scriptEngineAware, boolean redirectMissingToContext = true) {
        super(core, scriptEngineAware)
        this.targetSupplier = () -> function.apply(this)
        this.redirectMissingToContext = redirectMissingToContext
    }

    WrappingCommand(T target, Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
        this.targetSupplier = () -> target
        this.redirectMissingToContext = true
    }

    WrappingCommand(Supplier<T> targetSupplier, Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
        this.targetSupplier = targetSupplier
        this.redirectMissingToContext = true
    }

    Object methodMissing(String name, Object args) {
        if (redirectMissingToContext) {
            return CommandUtils.methodMissingOnOrChainToContext(this, this.unwrap(), name, args)
        }
        return this.unwrap().invokeMethod(name, args)
    }

    Object propertyMissing(String name) {
        if (redirectMissingToContext) {
            return CommandUtils.propertyMissingOnOrChainToContext(this, this.unwrap(), name)
        }
        return this.unwrap()[name]
    }

    Object propertyMissing(String name, Object arg) {
        if (redirectMissingToContext) {
            return CommandUtils.propertyMissingOnOrChainToContext(this, this.unwrap(), name, arg)
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
