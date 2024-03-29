package com.itquasar.multiverse.jmacro.core.configuration;

public record Env(String name) {

    public static Env env(final String name) {
        return new Env(name);
    }

    public static Env env(final Env env) {
        return env;
    }
}
