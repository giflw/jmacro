package com.itquasar.multiverse.jmacro.commands.base.commands.configuration;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Copyable;
import com.itquasar.multiverse.jmacro.core.util.ReflectionUtils;
import io.vavr.Tuple2;
import io.vavr.control.Try;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ConfigurationHolder<V> implements Copyable<ConfigurationHolder<V>> {

    private final V defaultValue;
    private final boolean sensitive;
    private V value;

    /**
     * @param value Initial value
     */
    public ConfigurationHolder(V value) {
        this(value, false);
    }

    public ConfigurationHolder(V value, boolean sensitive) {
        this.defaultValue = this.value = value;
        this.sensitive = sensitive;
    }

    public V getDefault() {
        return this.defaultValue;
    }

    public V get() {
        return this.value;
    }

    public synchronized ConfigurationHolder<V> set(V value) {
        this.value = value;
        return this;
    }

    @SuppressWarnings("unchecked")
    public synchronized ConfigurationHolder<V> setValueOf(String value) {
        Class<V> clazz = (Class<V>) this.defaultValue.getClass();
        Tuple2<Method, Constructor<V>> tuple = Try.of(() -> new Tuple2<>(clazz.getMethod("method", String.class), (Constructor<V>) null))
            .andThenTry(() -> new Tuple2<>(null, clazz.getConstructor(String.class)))
            .get();
        try {
            this.value = tuple._1 != null ? (V) tuple._1.invoke(null, value) : tuple._2.newInstance(value);
        } catch (Exception ex) {
            throw new JMacroException("Could not set configuration of type " + this.defaultValue.getClass() + " to " + value, ex);
        }
        return this;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @SneakyThrows
    public V copyValue() {
        return (V) switch (value) {
            case Copyable c -> c.copy();
            case List l -> ReflectionUtils.yieldNewInstanceAndConsume(l, nl -> nl.addAll(l));
            case Map m -> ReflectionUtils.yieldNewInstanceAndConsume(m, nm -> nm.putAll(m));
            case Object o -> Copyable.copyFields(o);
        };
    }

    public ConfigurationHolder<V> copy() {
        return new ConfigurationHolder<>(copyValue(), this.sensitive);
    }

    @Override
    public String toString() {
        return value != null ? (sensitive ? "****" : value.toString()) : null;
    }
}
