package com.itquasar.multiverse.jmacro.core.command;

import java.util.function.Consumer;

public interface SelfConsumerCommand<T extends SelfConsumerCommand<T>> extends CallableCommand<Consumer<SelfConsumerCommand<T>>, SelfConsumerCommand<T>> {

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
    default SelfConsumerCommand<T> call(Consumer<SelfConsumerCommand<T>> consumer) {
        consumer.accept(this);
        return this;
    }

}
