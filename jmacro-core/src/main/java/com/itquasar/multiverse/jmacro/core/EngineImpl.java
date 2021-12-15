package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
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
import java.util.function.Consumer;

import static javax.script.ScriptContext.ENGINE_SCOPE;
import static javax.script.ScriptContext.GLOBAL_SCOPE;

@Log4j2
public final class EngineImpl implements Engine {


    private static final String DOUBLE_SEPARATOR =
        "================================================================================";
    private static final String SINGLE_SEPARATOR =
        "--------------------------------------------------------------------------------";

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
    public ScriptResult execute(final Script script, final List<String> args, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook) {
        return this.executeInternal(script, args, preExecHook, postExecHook, true);
    }

    @Override
    public ScriptResult executeInclusion(final Script script, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook) {
        return this.executeInternal(script, Collections.emptyList(), preExecHook, postExecHook, false);
    }

    private ScriptResult executeInternal(final Script script, final List<String> args, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook, boolean normalExecution) {
        var extension = script.getPath().substring(script.getPath().lastIndexOf('.') + 1);
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

        globalScope.put("__MAIN__", normalExecution);
        globalScope.put("id", id);
        globalScope.put("uuid", UUID.randomUUID());
        globalScope.put("logger", scriptLogger);
        globalScope.put("#jsr223.groovy.engine.keep.globals", "weak");

        var commandTypes = new ArrayList<Class>();
        var commandProviderLoader = new SPILoader<>(CommandProvider.class);
        var commandProviders = commandProviderLoader.load();

        var commands = new ArrayList<Command>();

        while (commandProviders.hasNext()) {
            var commandProvider = commandProviders.next();
            if (normalExecution) {
                scriptLogger.info("Registering command [" + commandProvider.getName() + "] from " + commandProvider.getClass());
            }
            var command = commandProvider.getCommand(this.jMacroCore, engine);
            if (command == null) {
                throw new JMacroException(this,
                    "Command provider " + commandProvider.getName() + " returned null command");
            }
            var name = commandProvider.getName();
            if (engineScope.containsKey(name)) {
                throw new JMacroException("Command [" + name + "] already registered for " + engineScope.get(name).getClass() + ". Register attempt from " + commandProvider.getClass());
            }
            engineScope.put(name, command);
            commands.add(command);

            var scope = engineScope;
            commandProvider.getAliases().forEach(alias -> {
                if (scope.containsKey(alias)) {
                    scriptLogger.error("Alias [" + alias + "] for command " + name + " already registered for another command: " + scope.get(alias).getClass() + ". Register attempt from " + commandProvider.getClass());
                } else {
                    scope.put(name, command);
                }
            });

            commandTypes.add(command.getClass());
        }
        commands.forEach(command -> command.allCommandsRegistered());

        var valueHolder = new ValueHolder.ObjectValueHolder();

        engineScope.put("args", args);

        engineScope.put("__SCRIPT__", script);
        engineScope.put("__METADATA__", script.getMetadata());
        engineScope.put("__CONTEXT__", engineScope);
        engineScope.put("__RESULT__", valueHolder);

        if (this.languageAdaptors.containsKey(extension)) {
            LOGGER.warn("Running adaptor for " + extension);
            this.languageAdaptors.get(extension).adapt(engine);
        }

        var exitCode = new ValueHolder<>(0);
        var evalResult = script.run(() -> {
            if (normalExecution) {
                scriptLogger.warn(DOUBLE_SEPARATOR);
                scriptLogger.warn(DOUBLE_SEPARATOR);
            }
            if (normalExecution) {
                Arrays.stream(script.getMetadata().getBanner().split("\n")).forEach(scriptLogger::warn);
                scriptLogger.warn(SINGLE_SEPARATOR);
                scriptLogger.warn(SINGLE_SEPARATOR);
            }
            Object evalReturn = null;
            try {
                preExecHook.accept(engine);
                evalReturn = engine.eval(script.getSource());
                postExecHook.accept(engine);
            } catch (Throwable exception) {
                exitCode.set(ExitException.SCRIPT_ENGINE_ERROR);
                Throwable cause = exception;
                while ((cause = cause.getCause()) != null) {
                    if (ExitException.class.isInstance(cause)) {
                        exitCode.set(((ExitException) cause).getExitCode());
                        break;
                    }
                }
                if (exitCode.get() == ExitException.SCRIPT_ENGINE_ERROR) {
                    LOGGER.error("Error during script execution", exception);
                }
            } finally {
                if (normalExecution) {
                    this.closeCommands(engine);
                }
            }

            var scriptExitCodeDescription = (exitCode.get() == ExitException.SCRIPT_ENGINE_ERROR)
                ? " (Script engine error)"
                : " (Script exit code)";

            if (normalExecution) {
                scriptLogger.warn(SINGLE_SEPARATOR);
                scriptLogger.warn(SINGLE_SEPARATOR);
                scriptLogger.warn("Script exited with code " + exitCode.get() + scriptExitCodeDescription);
                scriptLogger.warn(SINGLE_SEPARATOR);
                scriptLogger.warn("Result for script " + script.getPath());
                scriptLogger.warn("__RESULT__:");
                scriptLogger.warn(valueHolder.get());
                scriptLogger.warn("Evaluation return:");
                scriptLogger.warn(evalReturn);
                scriptLogger.warn(DOUBLE_SEPARATOR);
                scriptLogger.warn(DOUBLE_SEPARATOR);
            }
            return evalReturn;
        });

        return new ScriptResult(script, exitCode.get(), valueHolder, evalResult);
    }

    private void closeCommands(ScriptEngine engine) {
        for (int scope : new int[]{ENGINE_SCOPE, GLOBAL_SCOPE}) {
            engine.getBindings(scope).forEach((key, value) -> {
                if (AutoCloseable.class.isInstance(value)) {
                    try {
                        LOGGER.warn("Closing command " + key + " as it is AutoCloseable");
                        ((AutoCloseable) value).close();
                    } catch (Exception exception) {
                        LOGGER.error("Error closing command " + key, exception);
                    }
                }
            });
        }
    }
}

