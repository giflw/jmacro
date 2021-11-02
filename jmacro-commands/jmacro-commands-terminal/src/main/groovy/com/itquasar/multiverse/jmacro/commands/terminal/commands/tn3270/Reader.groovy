package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.github.filipesimoes.j3270.Emulator

class Reader {

    private final Map<String, String> fields = new LinkedHashMap<>()

    private final Emulator emulator

    Reader(Emulator emulator) {
        this.emulator = emulator
    }

    def methodMissing(String name, def args) {
        this.fields.put(name, this.emulator.getText(args[0], args[1], args[2]))
    }
}
