package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.PDFCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class PDFCommandProvider implements CommandProvider<PDFCommand> {

    @Override
    public Class<PDFCommand> getCommandType() {
        return PDFCommand.class;
    }

    @Override
    public PDFCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new PDFCommand(core, scriptEngineAware);
    }
}
