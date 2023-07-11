package com.itquasar.multiverse.jmacro.commands.browser.command

import com.itquasar.multiverse.jmacro.commands.browser.command.browser.Browser
import com.itquasar.multiverse.jmacro.core.CallableCommand
import com.itquasar.multiverse.jmacro.core.Constants
import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.command.OnShutdown

import javax.script.ScriptEngine
import java.util.concurrent.ConcurrentLinkedQueue

class BrowserCommand extends CallableCommand implements AutoCloseable, Constants, OnShutdown {

    private final Queue<Browser> INSTANCES = new ConcurrentLinkedQueue<>()

    BrowserCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Override
    def call(Closure closure) {
        return new Browser(this.core, this.scriptEngine, this.bindings, this.getScriptLogger())
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
