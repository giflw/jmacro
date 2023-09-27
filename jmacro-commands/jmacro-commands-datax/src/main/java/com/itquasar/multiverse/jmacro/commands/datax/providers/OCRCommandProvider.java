package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.OCRCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class OCRCommandProvider implements CommandProvider<OCRCommand> {

    @Override
    public Class<OCRCommand> getCommandType() {
        return OCRCommand.class;
    }

    @Override
    public OCRCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new OCRCommand(core, scriptEngineAware);
    }
}
