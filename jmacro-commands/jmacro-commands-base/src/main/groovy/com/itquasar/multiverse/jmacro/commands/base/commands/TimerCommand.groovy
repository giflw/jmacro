package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException

import javax.script.ScriptEngine
import java.util.concurrent.atomic.AtomicBoolean

class TimerCommand extends Command implements AutoCloseable {

    private AtomicBoolean running = new AtomicBoolean(false)
    private Map<String, Float> partials = new LinkedHashMap()

    TimerCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    TimerCommand start() {
        if (!this.running.compareAndSet(false, true)) {
            throw new JMacroException(this, 'Timer already started!')
        }
        this.partials = new LinkedHashMap()
        this.partials.put('Start', (System.currentTimeMillis() / 1000).floatValue())
        return this
    }

    TimerCommand stop() {
        if (!running.compareAndSet(true, false)) {
            throw new JMacroException(this, 'Timer not started!')
        }
        this.partials.put('Stop', ((System.currentTimeMillis() / 1000) - this.partials['Start']).floatValue())
        return this
    }

    TimerCommand partial(String label = null) {
        partials.put(label ?: 'Partial ' + (partials.size() + 1), ((System.currentTimeMillis() / 1000) - this.partials['Start']).floatValue())
        return this
    }

    Float getStart() {
        return this.partials['Start']
    }

    Float getStop() {
        return this.partials['Stop']
    }

    Map<String, Float> get() {
        Map<String, Float> all = new LinkedHashMap()
        all.putAll(partials)
        return all
    }

    BigDecimal get(String label) {
        if (label == 'Start') {
            return this.start
        } else if (label == 'Stop') {
            return this.stop
        }
        return this.partials[label]
    }

    Map<String, Float> getPartials() {
        return this.partials
    }

    void log() {
        this.toString().split("\n").each {
            this.logger.warn(it)
        }
    }

    @Override
    void close() throws Exception {
        if (this.running.get()) {
            this.logger.debug('Closing timer...')
            this.stop()
            this.logger.debug('...timer closed!')
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
