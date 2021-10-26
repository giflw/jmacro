package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.commands.base.commands.ConstantsCommand;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConstantsCommandProvider implements CommandProvider<Map<String, ConstantsCommand>> {

    @Override
    public String getName() {
        return "constants";
    }

    @Override
    @SneakyThrows
    public Map<String, ConstantsCommand> getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        Bindings bindings = scriptEngine.getContext().getBindings(ScriptContext.ENGINE_SCOPE);
        // allow constants be acessed directly
        Arrays.stream(ConstantsCommand.values()).forEach(
            constant -> bindings.put(constant.name(), constant)
        );
        Map constants = new LinkedHashMap();
        Arrays.stream(ConstantsCommand.values()).forEach(
            constant -> constants.put(constant.name(), constant)
        );
        return constants;
    }

}
