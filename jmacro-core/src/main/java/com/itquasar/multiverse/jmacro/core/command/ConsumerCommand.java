package com.itquasar.multiverse.jmacro.core.command;

import java.util.function.Consumer;

public interface ConsumerCommand<T> extends CallableCommand<Consumer<T>, T> {

    String[] CALL_ALTERNATIVES = {"apply", "invoke"};

    /**
     * Invoking commands:
     * <pre>
     * // Groovy way
     * command {
     *    it.method args
     * }
     * // JVM way
     * command { c ->
     *    c.method args
     * }
     * // Groovy way
     * command.with {
     *    method args
     * }
     * </pre>
     *
     * @param consumer Block to be executed/consume the command or its object implementation
     * @return Consumer parameter
     */
    T call(Consumer<T> consumer);

}
