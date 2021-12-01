package com.itquasar.multiverse.jmacro.core.exception;

public final class FieldAlreadySet extends RuntimeException {

    /**
     * @param fieldName Name of filed already set.
     */
    public FieldAlreadySet(final String fieldName) {
        super("Field [" + fieldName + "] already set!");
    }
}
