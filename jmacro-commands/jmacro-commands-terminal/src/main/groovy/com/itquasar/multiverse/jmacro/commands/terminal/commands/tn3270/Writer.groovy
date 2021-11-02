package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.github.filipesimoes.j3270.Emulator

class Writer {
    private final Emulator emulator

    Writer(Emulator emulator) {
        this.emulator = emulator
    }

    def methodMissing(String name, def args) {
        this.emulator.fillField(args[1], args[2], name)
    }
}
