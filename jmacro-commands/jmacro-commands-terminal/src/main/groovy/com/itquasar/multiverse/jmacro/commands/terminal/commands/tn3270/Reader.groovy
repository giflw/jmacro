package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.itquasar.multiverse.jmacro.commands.terminal.commands.TN3270Command
import com.itquasar.multiverse.tn3270j.TN3270j

class Reader extends LinkedHashMap<String, String> {

    private final Mode mode

    private final TN3270j tn3270j
    private final def logger

    Reader(TN3270Command tn3270, Mode mode) {
        this.tn3270j = tn3270.tn3270j
        this.logger = tn3270.getLogger()
        this.mode = mode
    }

    def methodMissing(String name, def args) {
        int row = args[0]
        int col = args[1]
        int length = args[2]
        if (mode == Mode.FINAL_POSITION) {
            length = length - col + 1
        }
        this.logger.info("Reading '$name' at $row x $col")
        this.put(name, this.tn3270j.read(row, col, length))
    }


    static enum Mode {
        FINAL_POSITION, LENGTH
    }
}
