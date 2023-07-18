package com.itquasar.multiverse.jmacro.core.command;

import groovy.lang.Closure;

// FIXME is this really useful and helpful or just a source of mystery and errors???
@Deprecated
public interface SelfClosureCallableCommand<T extends SelfClosureCallableCommand<T>> extends ConsumerCommand<T> {
    default SelfClosureCallableCommand<T> call(Closure<?> closure) {
        getScriptLogger().debug("Calling with Closure parameter and delegate to this first");
        closure.setDelegate(this);
        closure.setResolveStrategy(Closure.DELEGATE_ONLY);
        closure.call();
        return this;
    }

}
