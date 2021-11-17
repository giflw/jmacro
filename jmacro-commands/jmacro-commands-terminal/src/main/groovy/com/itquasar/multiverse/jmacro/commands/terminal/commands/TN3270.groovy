package com.itquasar.multiverse.jmacro.commands.terminal.commands

import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Reader
import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Writer
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.TN3270jFactory
import com.itquasar.multiverse.tn3270j.WaitMode
import groovy.util.logging.Log4j2
import org.apache.logging.log4j.Logger

import javax.script.Bindings
import javax.script.ScriptEngine
import java.nio.file.Path

@Log4j2
class TN3270 extends LoggingCommand implements AutoCloseable {

    private final Bindings bindings

    private TN3270j tn3270j = null

    TN3270(ScriptEngine scriptEngine, Bindings bindings) {
        super(scriptEngine)
        this.bindings = bindings
    }

    // FIXME refactor to wrapper class to allow multiple tn3270 sessions in same script
    def _init(WaitMode waitMode = WaitMode.Seconds) {
        if (this.tn3270j == null) {
            // FIXME
            Path toolsDir = Path.of(System.getProperty('app.home')).resolve('tools')
            boolean isWindows = System.getProperty('os.name').startsWith("Windows")
            String arch = System.getProperty("os.arch").contains("64") ? "64" : "32"
            String path = 's3270'
            if (isWindows) {
                Path toolPath = toolsDir.resolve("x3270/windows/$arch/ws3270.exe")
                if (toolPath.toFile().exists()) {
                    path = toolPath.toString()
                } else {
                    toolPath = toolsDir.resolve("x3270/windows/32/ws3270.exe")
                    if (toolPath.toFile().exists()) {
                        path = toolPath.toString()
                    }
                }
            }
            this.tn3270j = TN3270jFactory.create("3270/j3270", new ProcessBuilder(path), waitMode)
        }
    }

    def call(Closure closure) {
        return call(WaitMode.Seconds, closure)
    }

    def call(WaitMode waitMode, Closure closure) {
        this._init(waitMode)
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }

    def methodMissing(String name, def args) {
        if (tn3270j.respondsTo(name)) {
            if (args) {
                return tn3270j."$name"(*args)
            }
            return tn3270j."$name"()
        }
        if (this.bindings.respondsTo(name)) {
            if (args) {
                return this.bindings."$name"(*args)
            }
            return this.bindings."$name"()
        }
        throw new JMacroException("methodMissing redirection error: $name ($args)")
    }

    // FIXME this is hell
    def propertyMissing(String name) {
        try {
            return WaitMode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            // no op
        }
        try {
            return Reader.Mode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            // no op
        }
        if (this.bindings.hasProperty(name)) {
            return this.bindings."$name"
        }
        return tn3270j.send(name)
    }

    def propertyMissing(String name, def arg) {
        tn3270j."$name" = arg
    }

    def write(String... args) {
        for (String arg : args) {
            this.tn3270j.write(arg)
        }
    }

    def write(Closure closure) {
        def writer = new Writer(this)
        closure.delegate = writer
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
    }

//    def read(Closure closure) {
//        read(Reader.Mode.FINAL_POSITION, closure)
//    }

    def read(Reader.Mode mode, Closure closure) {
        def reader = new Reader(this, mode)
        closure.delegate = reader
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        return reader
    }

    @Override
    void close() {
        if (tn3270j != null) {
            try {
                tn3270j.close()
            } catch (Throwable ex) {
                log.error("Error closing tn3270 command", ex)
            }
        }
    }
}

