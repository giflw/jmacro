package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.Moment;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class MomentCommandProvider implements CommandProvider<Moment> {
    @Override
    public String getName() {
        return "moment";
    }

    @Override
    public Moment getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Moment();
    }
}
