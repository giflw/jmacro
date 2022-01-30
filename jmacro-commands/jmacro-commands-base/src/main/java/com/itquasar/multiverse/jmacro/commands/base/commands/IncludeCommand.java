package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.providers.ExportCommandProvider;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.*;

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

    public void call(String... includeName) {
        Arrays.stream(includeName).forEach(it ->
            new Inclusion(this, core, Collections.emptyList()).from(it)
        );
    }

    public Inclusion call(Closure contextNames) {
        ContextName contextName = new ContextName();
        contextNames.setDelegate(contextName);
        contextNames.setResolveStrategy(Closure.DELEGATE_FIRST);
        contextNames.call();
        return new Inclusion(this, core, contextName.names);
    }

    public class ContextName {
        private final List<String> names = new ArrayList<>();

        public void propertyMissing(String name) {
            names.add(name);
        }

    }

    public record Inclusion(IncludeCommand includeCommand, JMacroCore core, List contextName) {

        void from(String includeName) {
            Logger logger = includeCommand.getLogger();

            String extension = includeCommand.extension;
            includeName = includeName.endsWith(extension) ? includeName : includeName + '.' + extension;

            Optional<Script> scriptOptional = includeCommand.repository.get(includeName);
            if (scriptOptional.isPresent()) {
                Script script = scriptOptional.get();

                logger.warn("Including " + includeName);

                try {
                    core.getEngine().executeInclusion(
                        script,
                        (ScriptEngine engine) -> {
                            includeCommand.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).forEach(
                                (key, value) -> {
                                    if (!key.startsWith("__") && !key.equals("export")) {
                                        logger.warn("Transferring [" + key + "] to new engine");
                                        engine.getBindings(ScriptContext.ENGINE_SCOPE).put(key, value);
                                    }
                                });
                            SPILoader.load(CommandProvider.class).forEachRemaining(provider -> {
                                if (ExportCommandProvider.class.isInstance(provider)) {
                                    logger.warn("Creating [" + provider.getName() + "] command in new engine");
                                    provider.getCommand(this.core, engine);
                                }
                            });
                        },
                        (ScriptEngine engine) -> {
                            Map exportsMap = (Map) engine.getBindings(ScriptContext.GLOBAL_SCOPE).get(ExportCommand.EXPORTS_KEY);
                            Set<String> contextNames = new HashSet<>(contextName);
                            if (contextNames.isEmpty()) {
                                contextNames = exportsMap.keySet();
                            }
                            logger.warn(contextNames + " will be transferred to original engine");
                            contextNames.forEach(name -> {
                                Object library = exportsMap.get(name);
                                logger.warn("Transferring [" + name + "] to original engine (" + library + ")");
                                includeCommand.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).put(name, library);
                            });
                        });
                } catch (ScriptException e) {
                    throw new JMacroException("Error including script " + includeName, e);
                }
            } else {
                throw new JMacroException(this, "Could not find library " + includeName + " to include");
            }
        }
    }
}
