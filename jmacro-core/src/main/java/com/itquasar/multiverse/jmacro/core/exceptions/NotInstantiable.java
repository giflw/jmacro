package com.itquasar.multiverse.jmacro.core.exceptions;

import java.text.MessageFormat;

public class NotInstantiable extends RuntimeException {

    public NotInstantiable(Class clazz) {
        super(MessageFormat.format("{0} cannot be instantiated", clazz));
    }
}
