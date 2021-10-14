package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Result
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@CompileStatic
trait Functions {

    private static final Logger log = LogManager.getLogger(Functions)

    @CompileDynamic
    Result attempt(Closure closure) {
        try {
            return Result.ok(closure())
        } catch (Throwable ex) {
            if (log.isDebugEnabled()) {
                Engine.EXCEPTION_MANAGER.handle(new JMacroException("Attempt failed: ${ex.message}".toString(), ex))
            } else {
                log.error("Attempt failed! ${ex.message}")
            }
            return Result.error(ex)
        }
    }

    void raise(message = '') {
        raise(message ? message.toString() : '')
    }

    @CompileDynamic
    void raise(String message) {
        throw new JMacroException(this, message)
    }

    void fixme(String message = null) {
        throw new Exception("FIXME: ${message ?: 'corrigir'}")
    }

    void todo(String message = null) {
        throw new UnsupportedOperationException("TODO: ${message ?: 'implementar'}")
    }

    void exit(int code = 0) {
        System.exit(code)
    }

    void pause(Number seconds) {
        Number milis = seconds * 1000
        Thread.sleep(milis.longValue())
    }

    void debugger(message = null) {
        log.debug(message ?: 'Here we can debug')
    }
}
