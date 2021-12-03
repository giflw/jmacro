package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.SneakyThrows;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.Optional;

public class IncludeCommand extends Command {

    private final GlobalScriptRepository repository;
    private final ScriptEngine scriptEngine;
    private final String extension;
    private final JMacroCore core;

    public IncludeCommand(GlobalScriptRepository repository, JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine);
        this.repository = repository;
        this.scriptEngine = scriptEngine;
        this.extension = scriptEngine.getFactory().getExtensions().get(0);
        this.core = core;
    }

    @SneakyThrows
    public Inclusion call(String... contextName) {
        return new Inclusion(this, core, contextName);
    }

    public record Inclusion(IncludeCommand includeCommand, JMacroCore core, String... contextName) {

        @SneakyThrows
        void from(String includeName) {
            String extension = includeCommand.extension;
            includeName = includeName.endsWith(extension) ? includeName : includeName + '.' + extension;

            Optional<Script> scriptOptional = includeCommand.repository.get(includeName);
            if (scriptOptional.isPresent()) {
                Script script = scriptOptional.get();

                includeCommand.getLogger().warn("Including " + includeName);

                core.getEngine().executeInclusion(
                    script,
                    engine -> {
                        includeCommand.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).forEach(
                            (key, value) -> {
                                if (!key.startsWith("__")) {
                                    engine.getBindings(ScriptContext.ENGINE_SCOPE).put(key, value);
                                }
                            });
                    },
                    engine -> {
                    });
            } else {
                throw new JMacroException(this, "Could not find library " + includeName + " to include");
            }

        }
    }
}
