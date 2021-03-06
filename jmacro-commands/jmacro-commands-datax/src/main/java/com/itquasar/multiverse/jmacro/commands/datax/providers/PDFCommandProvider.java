package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.PDFCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class PDFCommandProvider implements CommandProvider<PDFCommand> {

    @Override
    public String getName() {
        return "pdf";
    }

    @Override
    public Class<PDFCommand> getCommandType() {
        return PDFCommand.class;
    }

    @Override
    public PDFCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new PDFCommand(getName(), jMacroCore, scriptEngine);
    }
}
