package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import com.itquasar.multiverse.jmacro.core.script.ValueHolder;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.SimpleScriptContext;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import static javax.script.ScriptContext.ENGINE_SCOPE;
import static javax.script.ScriptContext.GLOBAL_SCOPE;

@Log4j2
public final class EngineImpl implements Engine {

    /**
     * Script engine id generator to unique identify each {@link javax.script.ScriptEngine} instance.
     */
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    /**
     * JSR 223 {@link ScriptEngineManager}.
     *
     * @see <a href="https://www.jcp.org/en/jsr/detail?id=223">JSR 223: Scripting for the JavaTM Platform</a>
     */
    private static final ScriptEngineManager ENGINE_MANAGER = new ScriptEngineManager();

    /**
     * Java SPI loader for {@link LanguageAdaptor}s.
     */
    private static final SPILoader<LanguageAdaptor> LANGUAGE_ADAPTOR_LOADER =
        new SPILoader<>(LanguageAdaptor.class);

    /**
     * Core instance used by this engine.
     */
    private final JMacroCore jMacroCore;

    /**
     * {@link ScriptEngineFactory} instances available on runtime.
     */
    private final Map<String, ScriptEngineFactory> engines = new LinkedHashMap<>();

    /**
     * {@link LanguageAdaptor}s found in runtime using SPI.
     */
    private final Map<String, LanguageAdaptor> languageAdaptors = new LinkedHashMap<>();

    /**
     * Create engine instance with given core.
     *
     * @param jMacroCore Core to use with this engine.
     */
    public EngineImpl(final JMacroCore jMacroCore) {
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

    /**
     * @return Found {@link ScriptEngineFactory} intances on runtime.
     */
    public Map<String, ScriptEngineFactory> getEngines() {
        return Collections.unmodifiableMap(this.engines);
    }

    @Override
    public ScriptResult execute(final Script script) {
        var extension = script.getFilename().substring(script.getFilename().lastIndexOf('.') + 1);
        var engine = engines.get(extension).getScriptEngine();

        ScriptContext context = engine.getContext();
        if (context == null) {
            context = new SimpleScriptContext();
            engine.setContext(context);
        }

        context.setWriter(new PrintWriter(System.out));

        Bindings globalScope = context.getBindings(GLOBAL_SCOPE);
        if (globalScope == null) {
            context.setBindings(engine.createBindings(), ScriptContext.GLOBAL_SCOPE);
            globalScope = context.getBindings(GLOBAL_SCOPE);
        }

        Bindings engineScope = context.getBindings(ENGINE_SCOPE);
        if (engineScope == null) {
            context.setBindings(engine.createBindings(), ENGINE_SCOPE);
            engineScope = context.getBindings(ENGINE_SCOPE);
        }

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
                throw new JMacroException(this,
                    "Command provider " + commandProvider.getName() + " returned null command");
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
            LOGGER.warn("Running adaptor for " + extension);
            this.languageAdaptors.get(extension).adapt(engine);
        }

        var evalResult = script.run(() -> {
            String doubleSeparator =
                "================================================================================";
            String singleSeparator =
                "--------------------------------------------------------------------------------";

            scriptLogger.warn(doubleSeparator);
            scriptLogger.warn(doubleSeparator);
            scriptLogger.warn("Script " + script.getFilename() + " started!");
            Arrays.stream(script.getMetadata().getBanner().split("\n")).forEach(scriptLogger::warn);

            scriptLogger.warn(singleSeparator);
            scriptLogger.warn(singleSeparator);
            Object evalReturn = engine.eval(script.getSource());
            scriptLogger.warn(singleSeparator);
            scriptLogger.warn(singleSeparator);
            scriptLogger.warn("Result for script " + script.getFilename());
            scriptLogger.warn("__RESULT__:");
            scriptLogger.warn(valueHolder.get());
            scriptLogger.warn("Evaluation return:");
            scriptLogger.warn(evalReturn);
            scriptLogger.warn(doubleSeparator);
            scriptLogger.warn(doubleSeparator);
            return evalReturn;
        });

        return new ScriptResult(script, valueHolder, evalResult);
    }
}

