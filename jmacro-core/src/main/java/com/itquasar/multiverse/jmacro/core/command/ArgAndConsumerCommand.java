package com.itquasar.multiverse.jmacro.core.command;

import java.util.function.Consumer;

public interface ArgAndConsumerCommand<T, U> extends Command {

    /**
     * Invoking commands:
     * <pre>
     * // Groovy way
     * command(arg) {
     *    it.method args
     * }
     * // JVM way
     * command(arg) { c ->
     *    c.method args
     * }
     * </pre>
     *
     * @param consumer Block to be executed/consume the command or its object implementation
     * @return Consumer parameter
     */
    U call(T arg, Consumer<U> consumer);

}
