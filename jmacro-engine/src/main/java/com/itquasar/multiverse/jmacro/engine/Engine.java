package com.itquasar.multiverse.jmacro.engine;

import com.itquasar.multiverse.jmacro.core.CommandProviderLoader;
import lombok.extern.log4j.Log4j2;

import javax.script.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Log4j2
public class Engine {

    private ScriptEngineManager manager = new ScriptEngineManager();
    private Map<String, ScriptEngineFactory> engines = new LinkedHashMap<>();

    public Engine() {
        manager.getEngineFactories().forEach(engine -> {
            var engineInfo = """
                %s
                    Name: %s
                    Language: %s v %s
                    Extensions: %s
                    Names: %s
                    Mime-type: %s
                """.formatted(
                engine.getClass().getName(),
                engine.getEngineName(),
                engine.getLanguageName(), engine.getLanguageVersion(),
                String.join(",", engine.getExtensions()),
                String.join(",", engine.getNames()),
                String.join(",", engine.getMimeTypes())
            );
            engine.getExtensions().forEach(ext -> engines.put(ext, engine));
            LOGGER.trace(engineInfo);
        });
    }

    public Metadata execute(String filename, String location, String script) throws ScriptException {
        var extension = filename.substring(filename.lastIndexOf('.') + 1);
        var engine = engines.get(extension).getScriptEngine();

        ScriptContext context = new SimpleScriptContext();
        context.setWriter(new PrintWriter(System.out));

        context.setBindings(engine.createBindings(), ScriptContext.GLOBAL_SCOPE);
        Bindings globalScope = context.getBindings(ScriptContext.GLOBAL_SCOPE);
        // FIX NPE on jshell script engine
        engine.setBindings(globalScope, ScriptContext.GLOBAL_SCOPE);

        context.setBindings(engine.createBindings(), ScriptContext.ENGINE_SCOPE);
        Bindings engineScope = context.getBindings(ScriptContext.ENGINE_SCOPE);
        // just to not get a NPE on a script engine for shure
        engine.setBindings(globalScope, ScriptContext.ENGINE_SCOPE);

        var commandTypes = new ArrayList<Class>();
        var commandProviderLoader = new CommandProviderLoader();
        var commandProviders = commandProviderLoader.load();
        while (commandProviders.hasNext()) {
            var commandProvider = commandProviders.next();
            Object command = commandProvider.getCommand(context);
            globalScope.put(
                commandProvider.getName(),
                command
            );
            commandTypes.add(command.getClass());
        }

        var metadata = Metadata.parseMetadata(script);
        metadata.setFilename(filename);
        metadata.setLocation(location);
        metadata.setSource(script);
        engineScope.put("__METADATA__", metadata);

        var scriptResult = engine.eval(script, context);
        if (metadata.getResult() == null) {
            metadata.setResult(scriptResult);
        }
        return metadata;
    }
}

