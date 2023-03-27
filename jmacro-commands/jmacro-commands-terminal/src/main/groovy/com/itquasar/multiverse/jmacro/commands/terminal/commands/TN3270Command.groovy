package com.itquasar.multiverse.jmacro.commands.terminal.commands

import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Reader
import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Writer
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.TN3270jFactory
import com.itquasar.multiverse.tn3270j.WaitMode
import groovy.transform.CompileDynamic
import groovy.util.logging.Log4j2
import io.vavr.control.Try

import javax.script.ScriptEngine
import java.nio.file.Path
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

@Log4j2
class TN3270Command extends Command implements AutoCloseable, Constants {

    static enum Key {
        F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12,
        enter
    }

    private static final DEFAULT = "default"
    private ConcurrentMap<String, TN3270Command> instances = new ConcurrentHashMap()
    private String instanceName = null

    private TN3270j tn3270j = null

    TN3270Command(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    TN3270j getTn3270j() {
        return this.tn3270j
    }

    def _init(WaitMode waitMode = WaitMode.Seconds) {
        if (this.tn3270j == null) {
            Path toolsDir = core.configuration.folders.tools()
            String path = 's3270'
            if (IS_WINDOWS) {
                Path toolPath = toolsDir.resolve("x3270/windows/${ARCH}/ws3270.exe")
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

    def call(String instanceName = DEFAULT, WaitMode waitMode = WaitMode.Seconds, Closure closure) {
        TN3270Command command = this.instances.get(instanceName)
        if (command == null) {
            if (this.instanceName == null && instanceName == DEFAULT) {
                command = this
            } else {
                command = new TN3270Command(this.name, this.core, this.scriptEngine)
            }
            command.instanceName = instanceName
            this.instances.put(instanceName, command)
            command._init(waitMode)
        }

        closure.delegate = command
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        return closure()
    }

    def methodMissing(String name, def args) {
        return methodMissingOnOrChainToContext(this, tn3270j, name, args)
    }

    @CompileDynamic
    def propertyMissing(String name) {
        try {
            return WaitMode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            logger.debug(ex.getMessage())
        }
        try {
            return Reader.Mode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            logger.debug(ex.getMessage())
        }
        if (bindings.containsKey(name)) {
            return bindings."$name"
        }
        try {
            def key = Key.valueOf(name)
            logger.info("Sending key $key")
            return tn3270j.send(key.name())
        } catch (IllegalArgumentException ex) {
            logger.error("Missing property $name", ex)
        }
    }

    @CompileDynamic
    def propertyMissing(String name, def arg) {
        Try.of { ->
            tn3270j."$name" = arg
        } orElse { ->
            super.propertyMissing(name, arg)
        }
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
        return closure()
    }

    def read(Closure closure) {
        return read(Reader.Mode.FINAL_POSITION, closure)
    }

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

