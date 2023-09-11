package com.itquasar.multiverse.jmacro.core.util;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.util.function.Consumer;

@UtilityClass
public class ReflectionUtils {

    public <T> T yieldAndConsume(T value, Consumer<T> consumer) {
        consumer.accept(value);
        return value;
    }

    @SneakyThrows
    public <T> T yieldNewInstanceAndConsume(Class<T> clazz, Consumer<T> consumer) {
        T value = clazz.getConstructor().newInstance();
        return yieldAndConsume(value, consumer);
    }

    @SuppressWarnings("unchecked")
    public <T> T yieldNewInstanceAndConsume(T value, Consumer<T> consumer) {
        return yieldNewInstanceAndConsume((Class<T>) value.getClass(), consumer);
    }
}
