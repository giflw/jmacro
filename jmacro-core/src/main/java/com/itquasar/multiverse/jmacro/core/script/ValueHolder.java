package com.itquasar.multiverse.jmacro.core.script;

public class ValueHolder<T extends Object> {

    private T value;

    public boolean hasValue() {
        return this.value != null;
    }

    public void set(T value) {
        this.value = value;
    }

    /**
     * Set for groovy
     *
     * @param value
     */
    public void call(T value) {
        this.set(value);
    }

    /**
     * Set for kotlin
     *
     * @param value
     */
    public void invoke(T value) {
        this.set(value);
    }

    public T get() {
        return this.value;
    }

    @Override
    public String toString() {
        return "ValueHolder{" +
            "value=" + value +
            '}';
    }

    public static class ObjectValueHolder extends ValueHolder<Object> {

    }
}
