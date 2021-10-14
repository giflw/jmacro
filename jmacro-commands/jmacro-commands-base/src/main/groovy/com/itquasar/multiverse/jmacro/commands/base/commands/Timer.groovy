package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.commands.base.Command
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import java.util.concurrent.atomic.AtomicBoolean

@CompileStatic
@Log4j2
class Timer implements Command, AutoCloseable {

    private AtomicBoolean running = new AtomicBoolean(false)
    private Map<String, BigDecimal> partials = new LinkedHashMap()

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

    void print() {
        println(this.toString())
    }

    @Override
    void close() throws Exception {
        if (this.running.get()) {
            log.debug('Closing timer...')
            this.stop()
            log.debug('...timer closed!')
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
