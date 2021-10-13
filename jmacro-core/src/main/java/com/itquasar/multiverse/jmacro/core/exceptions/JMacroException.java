package com.itquasar.multiverse.jmacro.core.exceptions;

public class JMacroException extends RuntimeException {

    static String message(Class clazz, String message) {
        return clazz.getSimpleName() + ": " + message;
    }

    public JMacroException(String message) {
        super(message);
    }

    public JMacroException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public JMacroException(Object script, String message) {
        super(message(script.getClass(), message));
    }

    public JMacroException(Object command, String message, Throwable cause) {
        super(message(command.getClass(), message), cause);
    }

}
