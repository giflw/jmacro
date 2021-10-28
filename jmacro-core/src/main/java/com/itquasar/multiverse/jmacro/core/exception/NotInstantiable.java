package com.itquasar.multiverse.jmacro.core.exception;

import java.text.MessageFormat;

public final class NotInstantiable extends RuntimeException {

    /**
     * Exception to use in utility or other type of non instantiable classes.
     *
     * @param clazz Class type.
     */
    public NotInstantiable(final Class clazz) {
        super(MessageFormat.format("{0} cannot be instantiated", clazz));
    }
}
