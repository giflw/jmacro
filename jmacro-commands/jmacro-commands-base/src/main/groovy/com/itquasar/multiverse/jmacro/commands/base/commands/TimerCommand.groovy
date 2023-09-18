package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.itquasar.multiverse.jmacro.core.exception.JMacroException

import javax.script.ScriptEngine
import java.util.concurrent.atomic.AtomicBoolean

class TimerCommand extends AbstractCommand implements AutoCloseable {

    private AtomicBoolean running = new AtomicBoolean(false)
    private Map<String, Long> partials = new LinkedHashMap()

    TimerCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware)
    }

    TimerCommand start() {
        if (!this.running.compareAndSet(false, true)) {
            throw new JMacroException(this, 'Timer already started!')
        }
        this.partials = new LinkedHashMap()
        this.partials.put('Start', System.currentTimeMillis())
        return this
    }

    TimerCommand stop() {
        if (!running.compareAndSet(true, false)) {
            throw new JMacroException(this, 'Timer not started!')
        }
        this.partials.put('Stop', (System.currentTimeMillis() - this.partials['Start']))
        return this
    }

    TimerCommand partial(String label = null) {
        partials.put(label ?: 'Partial ' + (partials.size() + 1), (System.currentTimeMillis() - this.partials['Start']))
        return this
    }

    Long getStart() {
        return this.partials['Start']
    }

    Long getStop() {
        return this.partials['Stop']
    }

    Map<String, Long> get() {
        Map<String, Long> all = new LinkedHashMap()
        all.putAll(partials)
        return all
    }

    Long get(String label) {
        if (label == 'Start') {
            return this.start
        } else if (label == 'Stop') {
            return this.stop
        }
        return this.partials[label]
    }

    Map<String, Long> getPartials() {
        return this.partials
    }

    void log() {
        this.toString().split("\n").each {
            this.scriptLogger.warn(it)
        }
    }

    @Override
    void close() throws Exception {
        if (this.running.get()) {
            this.scriptLogger.debug('Closing timer...')
            this.stop()
            this.scriptLogger.debug('...timer closed!')
        }
    }

    @Override
    String toString() {
        def previous = 0
        return "Timer\n" + this.partials.collect {
            def value = it.key == 'Start' ? 0 : it.value
            def total = value - previous
            previous = value
            "${it.key}: ${value} [${total}] (${value + this.start})"
        }.join("\n")
    }
}
