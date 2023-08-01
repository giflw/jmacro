package com.itquasar.multiverse.jmacro.core.interfaces;

@FunctionalInterface
public interface TriConsumer<T, U, V> {

    /**
     * Performs the operation given the specified arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     * @param v the third input argument
     */
    void accept(T t, U u, V v);

}
