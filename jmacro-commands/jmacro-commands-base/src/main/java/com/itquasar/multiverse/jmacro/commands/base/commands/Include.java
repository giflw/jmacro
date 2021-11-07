package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.LoggingCommand;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import lombok.SneakyThrows;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.util.Optional;

public class Include extends LoggingCommand {

    private final GlobalScriptRepository repository;
    private final ScriptEngine scriptEngine;
    private final String extension;
    private final JMacroCore core;

    public Include(GlobalScriptRepository repository, ScriptEngine scriptEngine, JMacroCore core) {
        super(scriptEngine.getContext());
        this.repository = repository;
        this.scriptEngine = scriptEngine;
        this.extension = scriptEngine.getFactory().getExtensions().get(0);
        this.core = core;
    }

    @SneakyThrows
    public Inclusion call(String... contextName) {
        return new Inclusion(this, core, contextName);
    }

    public record Inclusion(Include include, JMacroCore core, String... contextName) {

        @SneakyThrows
        void from(String includeName) {
            String extension = include.extension;
            includeName = includeName.endsWith(extension) ? includeName : includeName + '.' + extension;

            Optional<Script> scriptOptional = include.repository.get(includeName);
            if (scriptOptional.isPresent()) {
                Script script = scriptOptional.get();

                include.getLogger().warn("Including " + includeName);
                String source = script.getSource();

                core.getEngine().execute(
                    script,
                    engine -> {
                        include.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).forEach(
                            (key, value) -> {
                                if (!key.startsWith("__")) {
                                    engine.getBindings(ScriptContext.ENGINE_SCOPE).put(key, value);
                                }
                            });
                    },
                    engine -> {
                        for (String name : contextName) {
                            if (name.startsWith("__")) {
                                continue;
                            }
                            include.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).put(
                                name,
                                engine.getBindings(ScriptContext.ENGINE_SCOPE).get(name)
                            );
                        }
                    });
            } else {
                throw new JMacroException(this, "Could not find library " + includeName + " to include");
            }

        }
    }
}
