package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.Core

import javax.script.ScriptEngine

class ParserCommand extends Command implements InputParsers {

    private String text

    ParserCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    @Override
    String getText() {
        return text
    }

    def call(String text) {
        this.text = text
        return this
    }

    void setText(String text) {
        this.text = text
    }
}
