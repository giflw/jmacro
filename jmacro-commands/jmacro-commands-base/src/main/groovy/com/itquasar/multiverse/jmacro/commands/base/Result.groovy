package com.itquasar.multiverse.jmacro.commands.base

import com.itquasar.multiverse.jmacro.core.exception.JMacroException

class Result {

    private def value
    private Throwable throwable

    static Result error(Throwable throwable) {
        return new Result(null, throwable)
    }

    static Result ok(value) {
        return new Result(value, null)
    }

    Result(value, Throwable throwable) {
        this.value = value
        this.throwable = throwable
    }

    def getValue() {
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

    def methodMissing(String name, args) {
        if (args) {
            this.value."$name"(args)
        }
        this.value."$name"()
    }

    def propertyMissing(String name) {
        return this."$name"
    }

    Result capture(Closure closure) {
        return capture(Throwable.class, closure)
    }

    Result capture(Class<Throwable> throwableClass, Closure closure) {
        if (!isValid() && throwableClass.isInstance(this.throwable)) {
            closure.call(this.throwable)
        }
        return this
    }

    void lastly(Closure closure) {
        closure.call()
    }
}

