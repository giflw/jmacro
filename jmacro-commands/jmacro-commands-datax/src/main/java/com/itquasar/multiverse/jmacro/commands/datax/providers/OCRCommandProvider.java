package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.OCRCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

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
    public OCRCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new OCRCommand(getName(), core, scriptEngineAware);
    }
}
