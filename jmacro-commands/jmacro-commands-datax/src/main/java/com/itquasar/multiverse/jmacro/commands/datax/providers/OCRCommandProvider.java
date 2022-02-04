package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.OCRCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class OCRCommandProvider implements CommandProvider<OCRCommand> {

    @Override
    public String getName() {
        return "ocr";
    }

    @Override
    public Class<OCRCommand> getCommandType() {
        return OCRCommand.class;
    }

    @Override
    public OCRCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new OCRCommand(getName(), jMacroCore, scriptEngine);
    }
}
