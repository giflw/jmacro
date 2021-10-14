package com.itquasar.multiverse.jmacro.core;

public record Env(String name) {

    static Env env(String name) {
        return new Env(name);
    }

    static Env env(Env env) {
        return env;
    }
}
