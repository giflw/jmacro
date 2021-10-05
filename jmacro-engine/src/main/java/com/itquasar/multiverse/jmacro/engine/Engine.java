package com.itquasar.multiverse.jmacro.engine;

import lombok.extern.log4j.Log4j2;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class Engine {

    static ScriptEngineManager manager = new ScriptEngineManager();
    static Map<String, ScriptEngineFactory> engines = new LinkedHashMap<>();

    public static void main(String[] args) throws Exception {
        manager.getEngineFactories().forEach(engine -> {
            var info = """
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
            LOGGER.info(info);
        });
        new Engine().execute("teste.py", null, """
            \"""
            START METADATA
                author: Me Myself
                description: Foo bar baz
                infos:
                  foo: 1
                  bar: teste
                  baz: true
                name: NOME
                version: 1.2.3
            END METADATA
            \"""
            x = 5
            y = 2
            print(x * y)
            print(__METADATA__)
            """);

    }



    public void execute(String filename, String location, String script) throws FileNotFoundException, ScriptException {
        var extension = filename.substring(filename.lastIndexOf('.') + 1);
        var engine = engines.get(extension).getScriptEngine();

        ScriptContext context = new SimpleScriptContext();
        context.setWriter(new PrintWriter(System.out));
        context.setBindings(engine.createBindings(), ScriptContext.ENGINE_SCOPE);
        Bindings engineScope = context.getBindings(ScriptContext.ENGINE_SCOPE);

        var metadata = Metadata.parseMetadata(script);
        metadata.setFilename(filename);
        metadata.setLocation(location);
        metadata.setSource(script);

        engineScope.put("__METADATA__", metadata);

        engine.eval(script, context);
    }
}

