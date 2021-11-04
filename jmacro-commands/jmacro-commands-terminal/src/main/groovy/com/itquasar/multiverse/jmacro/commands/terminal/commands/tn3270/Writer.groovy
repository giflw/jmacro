package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.github.filipesimoes.j3270.Emulator
import com.itquasar.multiverse.tn3270j.TN3270j

class Writer {
    private final TN3270j tn3270j

    Writer(Emulator tn3270j) {
        this.tn3270j = tn3270j
    }

    def methodMissing(String name, def args) {
        this.tn3270j.write(args[1], args[2], name)
    }
}
