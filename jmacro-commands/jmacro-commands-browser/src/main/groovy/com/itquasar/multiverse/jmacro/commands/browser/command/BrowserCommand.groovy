package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.browser.command.browser.Browser
import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.OnShutdown

import javax.script.ScriptEngine
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Consumer

class BrowserCommand extends CallableCommand<Browser> implements AutoCloseable, Constants, OnShutdown {

    private final Set<Browser> INSTANCES = ConcurrentHashMap.newKeySet()

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
        Browser browser = INSTANCES.stream()
            .filter { it.instanceName == instanceName }
            .findFirst()
            .orElseGet { new Browser(instanceName, this.core, this.scriptEngine, this.bindings, this.getScriptLogger()) }

        if (consumer != null) {
            consumer.accept(browser)
        }
        return browser
    }

    @Override
    void onShutdown() {
        close()
    }

    void close() {
        closeAll()
    }

    void closeAll() {
        INSTANCES.each { browser ->
            {
                browser.close()
                INSTANCES.remove(browser)
            }
        }
    }

}
