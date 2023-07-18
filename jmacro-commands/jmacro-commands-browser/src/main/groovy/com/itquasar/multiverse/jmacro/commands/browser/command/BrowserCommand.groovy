package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.browser.command.browser.Browser
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.AutoCloseableAll
import com.itquasar.multiverse.jmacro.core.command.ConsumerCommand
import com.itquasar.multiverse.jmacro.core.command.OnShutdown
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.interfaces.Constants

import javax.script.ScriptEngine
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Consumer

class BrowserCommand extends AbstractCommand implements ConsumerCommand<Browser>, AutoCloseableAll, Constants, OnShutdown {

    public static final Map<String, Browser> INSTANCES = new ConcurrentHashMap<>()

    BrowserCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Override
    Browser call(Consumer<Browser> consumer) {
        return this.call(DEFAULT, consumer)
    }

    Browser call(String instanceName) {
        return this.call(instanceName, null)
    }

    Browser call(String instanceName, Consumer<Browser> consumer) {
        scriptLogger.warn("Searching or creating browser instance '${instanceName}'")
        Browser browser = INSTANCES.computeIfAbsent(
            instanceName,
            name -> new Browser(name, this.core, this.scriptEngine, this.bindings, this.getScriptLogger())
        )
        if (consumer != null) {
            consumer.accept(browser)
        }
        return browser
    }

    @Override
    void onShutdown() {
        close()
    }

    @Override
    void close() {
        closeAll()
    }

    void close(String instanceName) {
        INSTANCES.remove(instanceName)?.close()
    }

    @Override
    void closeAll() {
        INSTANCES.forEach { instanceName, browser ->
            this.close(instanceName)
        }
    }

}
