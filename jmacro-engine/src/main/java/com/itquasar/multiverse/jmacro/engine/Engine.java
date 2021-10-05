package com.itquasar.multiverse.jmacro.engine;

import lombok.extern.log4j.Log4j2;

import javax.script.*;
import java.io.PrintWriter;
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
            LOGGER.debug(engineInfo);
        });
    }


    public Metadata execute(String filename, String location, String script) throws ScriptException {
        var extension = filename.substring(filename.lastIndexOf('.') + 1);
        var engine = engines.get(extension).getScriptEngine();

        engine.setBindings(engine.createBindings(), ScriptContext.GLOBAL_SCOPE);

        ScriptContext context = new SimpleScriptContext();
        context.setWriter(new PrintWriter(System.out));
        context.setBindings(engine.createBindings(), ScriptContext.ENGINE_SCOPE);
        Bindings engineScope = context.getBindings(ScriptContext.ENGINE_SCOPE);

        var metadata = Metadata.parseMetadata(script);
        metadata.setFilename(filename);
        metadata.setLocation(location);
        metadata.setSource(script);

        engineScope.put("__METADATA__", metadata);

        metadata.setResult(engine.eval(script, context));
        return metadata;
    }
}

