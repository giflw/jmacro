package com.itquasar.multiverse.jmacro.core.exceptions;

public class FieldAlreadySetted extends RuntimeException {

    public FieldAlreadySetted(String fieldName) {
        super("Field [" + fieldName + "] alredy setted!");
    }
}
