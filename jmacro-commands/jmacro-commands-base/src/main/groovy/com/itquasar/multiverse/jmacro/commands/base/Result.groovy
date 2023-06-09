package com.itquasar.multiverse.jmacro.commands.base

import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import io.vavr.control.Try

import java.lang.reflect.Method
import java.lang.reflect.Proxy
import java.lang.reflect.Type
import java.util.function.Consumer

@Log4j2
class Result<T> {

    private T value
    private Throwable throwable
    private boolean captured = false

    static <T> Result<T> error(Throwable throwable) {
        return new Result(null, throwable)
    }

    static <T> Result<T> ok(T value) {
        return new Result(value, null)
    }

    Result(T value, Throwable throwable) {
        this.value = value
        this.throwable = throwable
    }

    T getValue() {
        if (value != null) {
            return value
        }
        throw new JMacroException("Result has no value", throwable)
    }

    Throwable getThrowable() {
        if (value == null) {
            return throwable
        }
        throw new JMacroException("Result has value: $value")
    }

    boolean isValid() {
        return value != null
    }

    boolean asBoolean() {
        return isValid()
    }

    @CompileDynamic
    def methodMissing(String name, args) {
        if (args) {
            this.value."$name"(args)
        }
        this.value."$name"()
    }

    @CompileDynamic
    def propertyMissing(String name) {
        return this."$name"
    }

    @CompileDynamic
    private Class<? extends Throwable> captureSignatureGroovy(Consumer<? extends Throwable> consumer) {
        return Proxy.getInvocationHandler(consumer)?.delegate?.parameterTypes?.first()
    }

    @CompileDynamic
    private Class<? extends Throwable> captureSignatureJava(Consumer<? extends Throwable> consumer) {
        Method method = consumer.class.getDeclaredMethods().find { it.name == 'accept' }
        Type[] types = method.getGenericParameterTypes()
        return Try.of(() -> Throwable.class.asSubclass(types.first())).getOrElse(Throwable.class)
    }

    Result<T> capture(Consumer<? extends Throwable> consumer) {
        Class<? extends Throwable> throwable = captureSignatureGroovy(consumer) ?: captureSignatureJava(consumer)
        return capture(throwable, consumer)
    }

    Result<T> capture(Class<? extends Throwable> throwableClass, Consumer<? extends Throwable> consumer) {
        if (!captured && !isValid() && throwableClass.isInstance(this.throwable)) {
            captured = true
            consumer.accept(this.throwable)
        }
        return this
    }

    Result<T> lastly(Runnable runnable) {
        runnable.run()
        return this
    }

}

