package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;
import lombok.extern.log4j.Log4j2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Log4j2
public class Timer implements AutoCloseable {

    private AtomicBoolean running = new AtomicBoolean(false);
    private Map<String, Double> partials = Collections.EMPTY_MAP;

    public Timer start() {
        if (!this.running.compareAndSet(false, true)) {
            throw new JMacroException(this, "Timer already started!");
        }
        this.partials = new LinkedHashMap();
        this.partials.put("Start", System.currentTimeMillis() / 1000.);
        return this;
    }

    public Timer stop() {
        if (!running.compareAndSet(true, false)) {
            throw new JMacroException(this, "Timer not started!");
        }
        this.partials.put("Stop", (System.currentTimeMillis() / 1000.) - this.partials.get("Start"));
        return this;
    }

    public Timer partial() {
        return this.partial(null);
    }

    public Timer partial(String label) {
        partials.put(
            label != null ? label : "Partial " + (partials.size() + 1),
            (System.currentTimeMillis() / 1000) - this.partials.get("Start")
        );
        return this;
    }

    public Double getStart() {
        return this.partials.get("Start");
    }

    public Double getStop() {
        return this.partials.get("Stop");
    }

    public Map<String, Double> get() {
        Map<String, Double> all = new LinkedHashMap();
        all.putAll(partials);
        return all;
    }

    public Double get(String label) {
        return this.partials.get(label);
    }

    public Map<String, Double> getPartials() {
        return this.partials;
    }

    public void print() {
        var start = this.partials.get("Start");
        this.partials.entrySet().stream().forEach(partial ->
            System.out.println(partial.getKey() + ": " + (partial.getValue() - start) + " (" + partial.getValue() + ")")
        );
    }

    @Override
    public void close() {
        if (this.running.get()) {
            LOGGER.debug("Closing timer...");
            this.stop();
            LOGGER.debug("...timer closed!");
        }
    }
}
