package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.commands.base.providers.ArgsCommandProvider;
import com.itquasar.multiverse.jmacro.commands.base.providers.ExportCommandProvider;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.SPILoader;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.Doc;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository;
import com.itquasar.multiverse.jmacro.core.script.Script;
import groovy.lang.Closure;
import org.apache.logging.log4j.Logger;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.net.URI;
import java.net.URL;
import java.util.*;

@Doc("Allows script inclusion, of any extensions installed on the engine.")
public class IncludeCommand extends Command {

    @Doc("Global repository instance.")
    private final GlobalScriptRepository repository;

    @Doc("File extension of running script.")
    private final String extension;

    public IncludeCommand(String name, GlobalScriptRepository repository, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
        this.repository = repository;
        this.extension = scriptEngine.getFactory().getExtensions().get(0);
    }

    @Doc(
        """
            Include all exported objects from included scripts.
            If extension is not supplied, same extensions as origin script will be used.

            ```
            include 'script_name_2.ext', 'script_name_2'
            ```

            See `export` command.
            """
    )
    public void call(@Doc(name = "includeName") String... includeName) {
        Arrays.stream(includeName).forEach(it ->
            this.call(includeName)
        );
    }

    public void call(@Doc(name = "includeName") String includeName) {
        new Inclusion(this, getCore(), getScriptEngine(), Collections.emptyList()).from(includeName);
    }

    @Doc("include { ObjA, ObjB } from 'script_name.ext'.")
    public Inclusion call(@Doc(name = "includeObjects") Closure contextNames) {
        ContextName contextName = new ContextName();
        contextNames.setDelegate(contextName);
        contextNames.setResolveStrategy(Closure.DELEGATE_FIRST);
        contextNames.call();
        return new Inclusion(this, getCore(), getScriptEngine(), contextName.names);
    }

    public record Inclusion(IncludeCommand includeCommand, JMacroCore core, ScriptEngine scriptEngine, List contextName) {

        void from(String includeName) {
            Logger logger = includeCommand.getLogger();

            String extension = includeCommand.extension;
            includeName = includeName.endsWith(extension) ? includeName : includeName + '.' + extension;

            // FIXME use path of script calling include to allow relative imports
            // FIXME create syntax for abosulte and relaive? (like @ prefix on node?)

            // FIXME allow repository selection on inclusion

            Optional<Script> scriptOptional = includeCommand.repository.get(includeName);
            if (scriptOptional.isPresent()) {
                Script script = scriptOptional.get();

                logger.debug("Including " + includeName);

                try {
                    core.getEngine().executeInclusion(
                        script,
                        (ScriptEngine engine) -> {
                            includeCommand.getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE).forEach(
                                (key, value) -> {
                                    if (!key.startsWith("__") && !key.equals("export") && !key.equals(ARGS)) {
                                        logger.debug("Transferring [" + key + "] to new engine");
                                        engine.getBindings(ScriptContext.ENGINE_SCOPE).put(key, value);
                                    }
                                    // FIXME APPEND PARENT SCRIPT ARGS
                                    // if (key.equals(ARGS)) {
                                    //     ArgsCommandProvider.ArgsCommand args = (ArgsCommandProvider.ArgsCommand) engine.getBindings(ScriptContext.ENGINE_SCOPE).get(ARGS);
                                    //     args.appendArgs()
                                    // }
                                });
                            SPILoader.load(CommandProvider.class).forEachRemaining(provider -> {
                                if (ExportCommandProvider.class.isInstance(provider)) {
                                    logger.debug("Creating [" + provider.getName() + "] command in new engine");
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
                            if(contextNames.isEmpty()) {
                                logger.warn("Nothing will be included in original engine");
                            } else {
                                logger.warn(contextNames + " will be included in original engine");
                            }
                            contextNames.forEach(name -> {
                                Object library = exportsMap.get(name);
                                logger.debug("Including [" + name + "] to original engine (" + library + ")");
                                includeCommand.getScriptEngine().getBindings(ScriptContext.ENGINE_SCOPE).put(name, library);
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

    public class ContextName {

        private final List<String> names = new ArrayList<>();

        public void propertyMissing(String name) {
            names.add(name);
        }
    }
}
