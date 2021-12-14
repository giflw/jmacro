package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.MomentCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class MomentCommandProvider implements CommandProvider<MomentCommand> {

    @Override
    public String getName() {
        return "moment";
    }

    @Override
    public Class<MomentCommand> getCommandType() {
        return MomentCommand.class;
    }

    @Override
    public MomentCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new MomentCommand(jMacroCore, scriptEngine);
    }
}
