package com.itquasar.multiverse.jmacro.core


import javax.script.ScriptEngine
import java.util.function.Function

class WrappingCommand<T> extends Command {

    private final T target

    WrappingCommand(Function<WrappingCommand<T>, T> function, JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
        this.target = function.apply(this)
    }

    WrappingCommand(T target, JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
        this.target = target
    }

    Object methodMissing(String name, Object args) {
        return methodMissingOnOrChainToContext(this, this.getLogger(), name, args)
    }

    Object propertyMissing(String name) {
        return propertyMissingOnOrChainToContext(this, this.getLogger(), name)
    }

    Object propertyMissing(String name, Object arg) {
        return propertyMissingOnOrChainToContext(this, this.getLogger(), name, arg)
    }

    T unwrap() {
        return target
    }

}
