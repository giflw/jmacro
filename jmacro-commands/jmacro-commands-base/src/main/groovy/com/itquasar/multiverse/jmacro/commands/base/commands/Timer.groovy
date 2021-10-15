package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

import javax.script.ScriptContext
import javax.script.ScriptEngine
import java.util.concurrent.atomic.AtomicBoolean

@CompileStatic
class Timer extends LoggingCommand implements GroovyCommand, AutoCloseable {

    private AtomicBoolean running = new AtomicBoolean(false)
    private Map<String, BigDecimal> partials = new LinkedHashMap()

    Timer(ScriptEngine scriptEngine) {
        super(scriptEngine)
    }

    Timer start() {
        if (!this.running.compareAndSet(false, true)) {
            throw new JMacroException(this, 'Timer already started!')
        }
        this.partials = new LinkedHashMap()
        this.partials.put('start', System.currentTimeMillis() / 1000)
        return this
    }

    Timer stop() {
        if (!running.compareAndSet(true, false)) {
            throw new JMacroException(this, 'Timer not started!')
        }
        this.partials.put('stop', (System.currentTimeMillis() / 1000) - this.partials['start'])
        return this
    }

    Timer partial(String label = null) {
        partials.put(label ?: 'Partial ' + (partials.size() + 1), (System.currentTimeMillis() / 1000) - this.partials['start'])
        return this
    }

    BigDecimal getStart() {
        return this.partials['start']
    }

    BigDecimal getStop() {
        return this.partials['stop']
    }

    @CompileDynamic
    Map<String, Double> get() {
        Map<String, Double> all = new LinkedHashMap()
        all.putAll(partials)
        return all
    }

    BigDecimal get(String label) {
        if (label == 'start') {
            return this.start
        } else if (label == 'stop') {
            return this.stop
        }
        return this.partials[label]
    }

    Map<String, BigDecimal> getPartials() {
        return this.partials
    }

    void log() {
        this.toString().split("\n").each {
            this.getLogger().warn(it)
        }
    }

    @Override
    void close() throws Exception {
        if (this.running.get()) {
            this.getLogger().debug('Closing timer...')
            this.stop()
            this.getLogger().debug('...timer closed!')
        }
    }

    @Override
    String toString() {
        return "Timer\n" + this.partials.collect {
            def value = it.key == 'start' ? 0 : it.value
            "${it.key}: ${value} (${value + this.start})"
        }.join("\n")
    }
}
