package com.itquasar.multiverse.jmacro.core.exception;

public final class JMacroException extends RuntimeException {

    /**
     * @param message Exception message.
     */
    public JMacroException(final String message) {
        super(message);
    }

    /**
     * @param message   Exception message
     * @param throwable Related {@link Throwable}.
     */
    public JMacroException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    /**
     * @param context Exception context object (any object related to exception).
     * @param message Exception message.
     */
    public JMacroException(final Object context, final String message) {
        super(message(context.getClass(), message));
    }

    /**
     * @param context   Exception context object (any object related to exception).
     * @param message   Exception message.
     * @param throwable Related {@link Throwable}.
     */
    public JMacroException(final Object context, final String message, final Throwable throwable) {
        super(message(context.getClass(), message), throwable);
    }

    private static String message(final Class clazz, final String message) {
        return clazz.getSimpleName() + ": " + message;
    }

}
