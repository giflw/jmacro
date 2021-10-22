package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import com.itquasar.multiverse.jmacro.core.script.ValueHolder;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.script.*;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static javax.script.ScriptContext.ENGINE_SCOPE;

@Log4j2
public class EngineImpl implements Engine {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    private static final ScriptEngineManager ENGINE_MANAGER = new ScriptEngineManager();
    private static final SPILoader<LanguageAdaptor> LANGUAGE_ADAPTOR_LOADER = new SPILoader<>(LanguageAdaptor.class);

    private final JMacroCore jMacroCore;
    private final Map<String, ScriptEngineFactory> engines = new LinkedHashMap<>();
    private final Map<String, LanguageAdaptor> languageAdaptors = new LinkedHashMap<>();

    public EngineImpl(JMacroCore jMacroCore) {
        this.jMacroCore = jMacroCore;
        ENGINE_MANAGER.getEngineFactories().forEach(engine -> {
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

        LANGUAGE_ADAPTOR_LOADER.load().forEachRemaining(languageAdaptor ->
            this.languageAdaptors.put(languageAdaptor.forExtension(), languageAdaptor)
        );
    }

    public Map<String, ScriptEngineFactory> getEngines() {
        return Collections.unmodifiableMap(this.engines);
    }

    @Override
    public ScriptResult execute(Script script) {
        var extension = script.getFilename().substring(script.getFilename().lastIndexOf('.') + 1);
        var engine = engines.get(extension).getScriptEngine();

        ScriptContext context = new SimpleScriptContext();
        engine.setContext(context);

        context.setWriter(new PrintWriter(System.out));
        context.setBindings(engine.createBindings(), ScriptContext.GLOBAL_SCOPE);
        context.setBindings(engine.createBindings(), ENGINE_SCOPE);
        Bindings engineScope = context.getBindings(ENGINE_SCOPE);

        int id = ID_GENERATOR.addAndGet(1);
        Logger scriptLogger = LogManager.getLogger("ScriptEngine#" + id);

        context.setAttribute("id", id, ENGINE_SCOPE);
        context.setAttribute("uuid", UUID.randomUUID(), ENGINE_SCOPE);
        context.setAttribute("logger", scriptLogger, ENGINE_SCOPE);

        context.setAttribute("#jsr223.groovy.engine.keep.globals", "weak", ENGINE_SCOPE);

        var commandTypes = new ArrayList<Class>();
        var commandProviderLoader = new SPILoader<>(CommandProvider.class);
        var commandProviders = commandProviderLoader.load();
        while (commandProviders.hasNext()) {
            var commandProvider = commandProviders.next();
            Object command = commandProvider.getCommand(this.jMacroCore, engine);
            if (command == null) {
                throw  new JMacroException(this, "Command provider " + commandProvider.getName() + " returned null command");
            }
            engineScope.put(
                commandProvider.getName(),
                command
            );
            commandTypes.add(command.getClass());
        }

        var valueHolder = new ValueHolder.ObjectValueHolder();

        engineScope.put("__SCRIPT__", script);
        engineScope.put("__METADATA__", script.getMetadata());
        engineScope.put("__CONTEXT__", script.getMetadata());
        engineScope.put("__RESULT__", valueHolder);

        if (this.languageAdaptors.containsKey(extension)) {
            this.languageAdaptors.get(extension).adapt(context);
        }

        var evalResult = script.run(() -> {
            scriptLogger.warn("================================================================================");
            scriptLogger.warn("================================================================================");
            scriptLogger.warn("Script " + script.getFilename() + " started!");
            Arrays.stream(script.getMetadata().getBanner().split("\n")).forEach(scriptLogger::warn);
            scriptLogger.warn("--------------------------------------------------------------------------------");
            scriptLogger.warn("--------------------------------------------------------------------------------");
            final CompiledScript compiled = ((Compilable) engine).compile(script.getSource());
            Object evalReturn = compiled.eval();
            scriptLogger.warn("--------------------------------------------------------------------------------");
            scriptLogger.warn("--------------------------------------------------------------------------------");
            scriptLogger.warn("Result for script " + script.getFilename());
            scriptLogger.warn("__RESULT__:");
            scriptLogger.warn(valueHolder.get());
            scriptLogger.warn("Evaluation return:");
            scriptLogger.warn(evalReturn);
            scriptLogger.warn("================================================================================");
            scriptLogger.warn("================================================================================");
            return evalReturn;
        });

        return new ScriptResult(script, valueHolder, evalResult);
    }
}

