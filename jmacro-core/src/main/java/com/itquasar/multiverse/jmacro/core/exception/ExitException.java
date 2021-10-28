package com.itquasar.multiverse.jmacro.core.exception;


import lombok.Getter;

public final class ExitException extends RuntimeException {

    public static final int OK = 0;
    public static final int SCRIPT_ERROR = 1;
    public static final int SCRIPT_ENGINE_ERROR = Integer.MAX_VALUE;

    @Getter
    private final int exitCode;

    public ExitException() {
        this(0);
    }

    public ExitException(final int exitCode) {
        super("Exiting script with code " + exitCode);
        this.exitCode = exitCode;
    }
}
