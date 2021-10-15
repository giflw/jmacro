package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import lombok.SneakyThrows;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConstantsCommandProvider implements CommandProvider<Map<String, ConstantsCommandProvider.Constants>> {
    @Override
    public String getName() {
        return "constants";
    }

    @Override
    @SneakyThrows
    public Map<String, Constants> getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine, ScriptContext scriptContext) {
        Bindings bindings = scriptContext.getBindings(ScriptContext.ENGINE_SCOPE);
        // allow constants be acessed directly
        Arrays.stream(Constants.values()).forEach(
            constant -> bindings.put(constant.name(), constant)
        );
        return new LinkedHashMap<>() {{
            Arrays.stream(Constants.values()).forEach(
                constant -> this.put(constant.name(), constant)
            );
        }};
    }

    public enum Constants {
        QUIET, VERBOSE;
    }
}
