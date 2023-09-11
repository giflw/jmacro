package com.itquasar.multiverse.jmacro.core.configuration;

import lombok.Getter;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Env {

    private static final Map<String, Env> envs = new ConcurrentHashMap<>();

    @Getter
    private final String name;

    private Env(String name) {
        Objects.requireNonNull(name, "Env name MUST be not null.");
        this.name = name;
    }

    public static Env env(final String name) {
        return envs.computeIfAbsent(name, Env::new);
    }

    public static Env env(final Env env) {
        return envs.putIfAbsent(env.name, env);
    }

    public static Collection<Env> envs() {
        return envs.values();
    }

    public boolean is(String name) {
        return this.name.equals(name);
    }

    public boolean is(Env env) {
        return env.name.equals(this.name);
    }

}
