package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.itquasar.multiverse.tn3270j.TN3270j

class Reader {

    private final Map<String, String> fields = new LinkedHashMap<>()

    private final TN3270j tn3270j

    Reader(TN3270j tn3270j) {
        this.tn3270j = tn3270j
    }

    def methodMissing(String name, def args) {
        this.fields.put(name, this.tn3270j.read(args[0], args[1], args[2]))
    }
}
