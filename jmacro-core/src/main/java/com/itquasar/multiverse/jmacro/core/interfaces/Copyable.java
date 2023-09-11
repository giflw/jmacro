package com.itquasar.multiverse.jmacro.core.interfaces;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public interface Copyable<T extends Copyable<?>> {

    @SuppressWarnings("unchecked")
    @SneakyThrows
    static <T> T copyFields(T original) {
        var constructor = original.getClass().getConstructor();
        T copy;
        copy = (T) constructor.newInstance();
        for (Field field : copy.getClass().getDeclaredFields()) {
            Object fieldValue = field.get(original);
            if (fieldValue instanceof Copyable<?> copyable) {
                fieldValue = copyable.copy();
            }
            field.set(copy, fieldValue);
        }
        return copy;
    }

    T copy();

    class FieldCopyable<T> implements Copyable<FieldCopyable<T>> {

        @Override
        public FieldCopyable<T> copy() {
            return Copyable.copyFields(this);
        }

    }

}
