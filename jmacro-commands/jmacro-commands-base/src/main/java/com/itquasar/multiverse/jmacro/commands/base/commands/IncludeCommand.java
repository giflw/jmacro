package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.providers.ExportCommandProvider;
import com.itquasar.multiverse.jmacro.commands.base.providers.IncludeCommandProvider;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.util.SPILoader;
import groovy.lang.Closure;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.nio.file.Paths;
import java.util.*;

public class IncludeCommand extends AbstractCommand {

    private final GlobalScriptRepository repository;

    private final String extension;

    public IncludeCommand(final String name, final GlobalScriptRepository repository, final Core core, final ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
        this.repository = repository;
        this.extension = scriptEngine.getFactory().getExtensions().get(0);
    }

    public void call(final String... includeName) {
        Arrays.stream(includeName).forEach(it -> this.call(includeName));
    }

    public void call(final String includeName) {
        new Inclusion(this, this.getCore(), this.getScriptEngine(), Collections.emptyList()).from(includeName);
    }

    public Inclusion call(final Closure contextNames) {
        final var contextName = new ContextName();
        contextNames.setDelegate(contextName);
        contextNames.setResolveStrategy(Closure.DELEGATE_FIRST);
        contextNames.call();
        return new Inclusion(this, this.getCore(), this.getScriptEngine(), contextName.names);
    }

    public record Inclusion(IncludeCommand includeCommand, Core core, ScriptEngine scriptEngine,
                            List contextName) {

        @SuppressWarnings("unchecked")
        void from(String includeName) {
            final var logger = this.includeCommand.getScriptLogger();

            final var extension = this.includeCommand.extension;
            includeName = includeName.endsWith(extension) ? includeName : includeName + '.' + extension;

            final var parentScript = (Script) ((Map<String, Object>) this.scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE)).get("__SCRIPT__");
            final var includePath = Paths.get(parentScript.getPath()).resolveSibling(includeName).toString().replace("\\", "/");

            // FIXME create syntax for abosulte and relaive? (like @ prefix on node?)

            // FIXME allow repository selection on inclusion

            final var scriptOptional = this.includeCommand.repository.get(includePath);
            if (scriptOptional.isPresent()) {
                final var script = scriptOptional.get();

                logger.debug("Including " + includeName);

                try {
                    this.core.getEngine().include(script, (final var engine) -> {
                        this.includeCommand.getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE).forEach((key, value) -> {
                            if (!key.startsWith("__") && !key.equals("export") && !key.equals("include") && !key.equals(ARGS)) {
                                logger.trace("Transferring [" + key + "] to new engine");
                                engine.getBindings(ScriptContext.ENGINE_SCOPE).put(key, value);
                            }
                            // FIXME APPEND PARENT SCRIPT ARGS
                            // if (key.equals(ARGS)) {
                            // ArgsCommandProvider.ArgsCommand args = (ArgsCommandProvider.ArgsCommand)
                            // engine.getBindings(ScriptContext.ENGINE_SCOPE).get(ARGS);
                            // args.appendArgs()
                            // }
                        });
                        SPILoader.load(CommandProvider.class).forEachRemaining(provider -> {
                            if ((provider instanceof ExportCommandProvider) || (provider instanceof IncludeCommandProvider)) {
                                logger.debug("Creating [" + provider.getName() + "] command in new engine");
                                provider.getCommand(this.core, engine);
                            }
                        });
                    }, (final var engine) -> {
                        final var exportsMap = (Map) engine.getBindings(ScriptContext.GLOBAL_SCOPE).get(ExportCommand.EXPORTS_KEY);
                        Set<String> contextNames = new HashSet<>(this.contextName);
                        if (contextNames.isEmpty()) {
                            contextNames = exportsMap.keySet();
                        }
                        if (contextNames.isEmpty()) {
                            logger.warn("Nothing will be included in original engine");
                        } else {
                            logger.warn(contextNames + " will be included in " + parentScript.getPath() + " engine");
                        }
                        contextNames.forEach(name -> {
                            final var library = exportsMap.get(name);
                            logger.debug("Including [" + name + "] to original engine (" + library + ")");
                            this.includeCommand.getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE).put(name, library);
                        });
                    });
                } catch (final ScriptException e) {
                    throw new JMacroException("Error including script " + includeName, e);
                }
            } else {
                throw new JMacroException(this, "Could not find library " + includeName + " to include");
            }
        }
    }

    public class ContextName {

        private final List<String> names = new ArrayList<>();

        public void propertyMissing(final String name) {
            this.names.add(name);
        }
    }
}
