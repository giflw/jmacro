package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.itquasar.multiverse.jmacro.commands.terminal.commands.TN3270
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.WaitMode

class Writer {
    private final TN3270j tn3270j
    private final def logger;

    Writer(TN3270 tn3270) {
        this.tn3270j = tn3270.tn3270j
        this.logger = tn3270.getLogger()
    }

    def methodMissing(String name, def args) {
        if (tn3270j.respondsTo(name, args)) {
            if (args) {
                return tn3270j."$name"(args)
            }
            return tn3270j."$name"()
        }

        int row = args[0]
        int col = args[1]
        this.logger.info("Writing '$name' at $row x $col")
        this.tn3270j.write(row, col, name)
    }

    def propertyMissing(String name) {
        try {
            return WaitMode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            return this.tn3270j.send(name)
        }
    }
}
