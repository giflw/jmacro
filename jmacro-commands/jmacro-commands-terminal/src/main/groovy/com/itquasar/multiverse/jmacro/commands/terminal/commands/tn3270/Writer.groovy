package com.itquasar.multiverse.jmacro.commands.terminal.commands.tn3270

import com.itquasar.multiverse.jmacro.commands.terminal.commands.TN3270Command
import com.itquasar.multiverse.tn3270j.TN3270j
import com.itquasar.multiverse.tn3270j.WaitMode
import groovy.transform.CompileDynamic

public class Writer {
    private final TN3270j tn3270j
    private final def logger;

    Writer(TN3270Command tn3270) {
        this.tn3270j = tn3270.tn3270j
        this.logger = tn3270.getLogger()
    }

    @CompileDynamic
    def methodMissing(String name, def args) {
        if (tn3270j.respondsTo(name, args)) {
            if (args) {
                return tn3270j."$name"(args)
            }
            return tn3270j."$name"()
        }
        // FIXME is there a easy way to make this log in dynamic calls?
        if (args.length == 2) {
            String content = name
            int row = args[0]
            int col = args[1]
            this.logger.info("Writing '$content' at $row x $col")
            return this.tn3270j.write(row, col, content)
        }
        if (args.length == 3) {
            String content = name
            int row = args[0]
            int col = args[1]
            int length = args[2]
            this.logger.info("Writing '$content' at $row x $col with length $length")
            return this.tn3270j.write(row, col, length, content)
        }
        if (args.length == 4) {
            String fieldName = name
            int row = args[0]
            int col = args[1]
            int length = args[2]
            String content = args[3]
            this.logger.info("Writing $fieldName with '$content' at $row x $col with length $length")
            this.tn3270j.write(row, col, length, content, fieldName)
        }
    }

    def propertyMissing(String name) {
        try {
            return WaitMode.valueOf(name)
        } catch (IllegalArgumentException ex) {
            return this.tn3270j.send(name)
        }
    }
}
