package com.itquasar.multiverse.jmacro.commands.terminal.commands

import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Reader
import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Writer
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.ArgAndConsumerCommand
import com.itquasar.multiverse.jmacro.core.command.AutoCloseableAll
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.command.OnShutdown
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.TN3270jFactory
import com.itquasar.multiverse.tn3270j.WaitMode
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2
import io.vavr.control.Try

import javax.script.ScriptEngine
import java.nio.file.Path
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit
import java.util.function.Consumer

@Log4j2
@CompileStatic
class TN3270Command extends AbstractCommand implements ArgAndConsumerCommand<WaitMode, TN3270Command>, AutoCloseableAll, Constants, OnShutdown {

    static enum Key {
        F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12,
        enter
    }

    private static final String DEFAULT = "default"
    private static Map<TN3270j, Long> instances = new ConcurrentHashMap<>()
    private final ThreadLocal<TN3270j> tn3270j = new ThreadLocal<>()

    TN3270Command(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    TN3270j getTn3270j() {
        return this.tn3270j.get()
    }

    void _init(WaitMode waitMode = WaitMode.Seconds) {
        if (this.tn3270j.get() == null) {
            getScriptLogger().warn("Initializing ${Thread.currentThread().name}")
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
            this.tn3270j.set(TN3270jFactory.create("3270/j3270", new ProcessBuilder(path), waitMode))
            instances.put(this.tn3270j.get(), System.currentTimeMillis())
        }
    }

    TN3270Command call(WaitMode waitMode = WaitMode.Seconds, Consumer<TN3270Command> consumer) {
        if (this.tn3270j.get() == null) {
            this._init(waitMode)
        }
        consumer.accept(this)
        return this
    }



    def methodMissing(String name, def args) {
        return CommandUtils.methodMissingOnOrChainToContext(this, this.tn3270j.get(), name, args)
    }

    @CompileDynamic
    def propertyMissing(String name) {
        try {
            return WaitMode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            scriptLogger.debug(ex.getMessage())
        }
        try {
            return Reader.Mode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            scriptLogger.debug(ex.getMessage())
        }
        if (bindings.containsKey(name)) {
            return bindings."$name"
        }
        try {
            def key = Key.valueOf(name)
            scriptLogger.info("Sending key $key")
            return this.tn3270j.get().send(key.name())
        } catch (IllegalArgumentException ex) {
            scriptLogger.error("Missing property $name", ex)
        }
    }

    @CompileDynamic
    def propertyMissing(String name, def arg) {
        Try.of { ->
            this.tn3270j.get()."$name" = arg
        } orElse { ->
            super.propertyMissing(name, arg)
        }
    }

    def write(String... args) {
        for (String arg : args) {
            this.tn3270j.get().write(arg)
        }
    }

    def write(Consumer<Writer> consumer) {
        def writer = new Writer(this)
        consumer(writer)
        return writer
    }

    def read(int row, int col, int length) {
        return this.tn3270j.get().read(row, col, length)
    }

    def read(Consumer<Reader> consumer) {
        return read(Reader.Mode.FINAL_POSITION, consumer)
    }

    def read(Reader.Mode mode, Consumer<Reader> consumer) {
        def reader = new Reader(this, mode)
        consumer.accept(reader)
        return reader
    }

    void fullWait() {
        this.tn3270j.get().wait(0.5, WaitMode.Seconds)
        this.tn3270j.get().wait(3, WaitMode.Output)
        this.tn3270j.get().wait(3, WaitMode.InputField)
        this.tn3270j.get().wait(3, WaitMode.Unlock)
        this.tn3270j.get().wait(0.5, WaitMode.Seconds)
    }

    @Override
    void close() {
        instances.remove(this.tn3270j)
        this.tn3270j.get()?.close()
        this.tn3270j.set(null)
    }

    void clear(long timeout = 60, TimeUnit timeUnit = TimeUnit.SECONDS) {
        closeAll(timeout, timeUnit)
    }

    @Override
    void onShutdown() {
        this.closeAll()
    }

    @Override
    void closeAll() {
        closeAll(0, TimeUnit.SECONDS)
    }

    static void closeAll(long timeout, TimeUnit timeUnit = TimeUnit.SECONDS) {
        long maxTime = System.currentTimeMillis() - timeUnit.toMillis(timeout)
        instances.removeAll {
            if (it.value < maxTime) {
                it.key.close()
                true
            } else {
                false
            }
        }
    }

}
