package com.itquasar.multiverse.jmacro.commands.terminal.commands

import com.github.filipesimoes.j3270.Emulator
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import groovy.util.logging.Log4j2

@Log4j2
class TN3270 implements GroovyCommand, AutoCloseable {

    private final Emulator emulator = new Emulator()

    def open(String... hostnames) {
        emulator.start()
        for (String hostname : hostnames) {
            try {
                log.warn("Trying to connect to $hostname.")
                emulator.connect(hostname)
                if (emulator.isConnected()) {
                    log.warn("Connected to $hostname!")
                    break
                }
            } catch (Exception exception) {
                log.error("Error connecting to $hostname", exception)
            }
        }
    }

    def methodMissing(String name, def args) {
        return emulator."$name"(args)
    }

    def propertyMissing(String name) {
        return emulator."$name"
    }

    def propertyMissing(String name, def arg) {
        emulator."$name" = arg
    }

    @Override
    void close() throws Exception {
        if (emulator.isConnected()) {
            emulator.disconnect()
        }
    }
}
