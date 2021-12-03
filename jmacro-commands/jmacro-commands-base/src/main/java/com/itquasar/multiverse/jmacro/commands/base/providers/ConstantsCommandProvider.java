package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConstantsCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;

import javax.script.ScriptEngine;
import java.util.List;

public class ConstantsCommandProvider implements CommandProvider<ConstantsCommand> {

    @Override
    public List<String> getAliases() {
        return List.of("C");
    }

    @Override
    public Class<ConstantsCommand> getCommandType() {
        return ConstantsCommand.class;
    }

    @Override

    public ConstantsCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ConstantsCommand(jMacroCore, scriptEngine);
    }

}
