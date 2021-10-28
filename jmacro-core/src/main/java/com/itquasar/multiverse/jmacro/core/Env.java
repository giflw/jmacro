package com.itquasar.multiverse.jmacro.core;

public record Env(String name) {

    static Env env(final String name) {
        return new Env(name);
    }

    static Env env(final Env env) {
        return env;
    }
}
