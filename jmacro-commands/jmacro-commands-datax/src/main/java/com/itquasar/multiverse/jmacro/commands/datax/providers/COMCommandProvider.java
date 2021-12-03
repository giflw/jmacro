package com.itquasar.multiverse.jmacro.commands.datax.providers;

import com.itquasar.multiverse.jmacro.commands.datax.commands.COMCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class COMCommandProvider implements CommandProvider<COMCommand> {

    @Override
    public Class<COMCommand> getCommandType() {
        return COMCommand.class;
    }

    @Override
    public COMCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new COMCommand(jMacroCore, scriptEngine);
    }
}
