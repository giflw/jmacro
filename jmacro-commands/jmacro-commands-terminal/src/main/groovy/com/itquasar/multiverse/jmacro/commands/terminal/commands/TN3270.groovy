package com.itquasar.multiverse.jmacro.commands.terminal.commands

import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Reader
import com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270.Writer
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.TN3270jFactory
import com.itquasar.multiverse.tn3270j.WaitMode
import groovy.util.logging.Log4j2

import java.nio.file.Path

@Log4j2
class TN3270 implements GroovyCommand, AutoCloseable {

    private final TN3270j tn3270j
    private boolean opened = false

    TN3270() {
        // FIXME
        Path toolsDir = Path.of(System.getProperty('basedir')).resolve('../tools')
        boolean isWindows = System.getProperty('os.name').startsWith("Windows")
        String arch = System.getProperty("os.arch").contains("64") ? "64" : "32"
        this.tn3270j = TN3270jFactory.create(
            "3270/j3270",
            new ProcessBuilder(
                toolsDir.resolve(
                    "x3270/" + (isWindows ? 'windows' : 'linux') + "/$arch/" + (isWindows ? 'ws3270.exe' : 's3270')
                ).toString()
            ),
            WaitMode.Seconds
        )
    }

    def open(String... hostnames) {
        return open(Arrays.asList(hostnames))
    }

    def open(List<String> hostnames) {
        this.opened = true
        for (String hostname : hostnames) {
            try {
                log.warn("Trying to connect to $hostname.")
                tn3270j.open(hostname)
//                if (tn3270j.isConnected()) {
//                    log.warn("Connected to $hostname!")
//                    break
//                }
            } catch (IllegalArgumentException exception) {
                log.error("Error connecting to $hostname", exception)
            }
        }
    }

    def methodMissing(String name, def args) {
        return tn3270j."$name"(*args)
    }

    def propertyMissing(String name) {
        return tn3270j."$name"
    }

    def propertyMissing(String name, def arg) {
        tn3270j."$name" = arg
    }

    def write(Closure closure) {
        closure.delegate = new Writer(this.tn3270j)
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
    }

    def read(Closure closure) {
        closure.delegate = new Reader(this.tn3270j)
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
    }

    @Override
    // FIXME
    void close() throws Exception {
//        if (this.opened && tn3270j.isConnected()) {
        try {
            // FIXME implements is connected or is opened
            tn3270j.close()
        } catch(Throwable ex) {
            // FIXME
            println ex.getMessage()
        }
//        }
    }
}

