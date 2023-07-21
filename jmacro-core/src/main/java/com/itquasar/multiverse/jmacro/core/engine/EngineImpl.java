package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.command.*;
import com.itquasar.multiverse.jmacro.core.exception.ExitException;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;
import com.itquasar.multiverse.jmacro.core.script.Script;
import com.itquasar.multiverse.jmacro.core.script.ScriptResult;
import com.itquasar.multiverse.jmacro.core.util.SPILoader;
import com.itquasar.multiverse.jmacro.core.util.TUI;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.groovy.jsr223.GroovyScriptEngineImpl;

import javax.script.*;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import static javax.script.ScriptContext.ENGINE_SCOPE;
import static javax.script.ScriptContext.GLOBAL_SCOPE;

@Log4j2
public final class EngineImpl extends Engine implements Constants, TUI {


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
     * Core instance used by this engine.
     */
    private final Core core;

    /**
     * {@link ScriptEngineFactory} instances available on runtime.
     */
    private final Map<String, ScriptEngineFactory> engines = new LinkedHashMap<>();

    /**
     * {@link LanguageAdaptor}s found in runtime using SPI.
     */
    private final Map<String, LanguageAdaptor> languageAdaptors = new LinkedHashMap<>();
    private final Set<CommandProvider<?>> commandProviders = new HashSet<>();

    private static final List<OnShutdown> ON_SHUTDOWN = new ArrayList<>(0);

    /**
     * Create engine instance with given core.
     *
     * @param core Core to use with this engine.
     */
    public EngineImpl(final Core core) {
        this.registerShutdownHook();
        this.core = core;
        ENGINE_MANAGER.getEngineFactories().forEach(engine -> {
            final var engineInfo = """
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
            engine.getExtensions().forEach(ext -> this.engines.put(ext, engine));
            LOGGER.trace(engineInfo);
        });

        new SPILoader<>(LanguageAdaptor.class).load().forEachRemaining(languageAdaptor ->
            this.languageAdaptors.put(languageAdaptor.forExtension(), languageAdaptor)
        );

        new SPILoader<>(CommandProvider.class).load().forEachRemaining(this.commandProviders::add);
    }

    /**
     * @return Found {@link ScriptEngineFactory} intances on runtime.
     */
    public Map<String, ScriptEngineFactory> getEngines() {
        return Collections.unmodifiableMap(this.engines);
    }

    @Override
    public ScriptResult<?, ? extends Throwable> execute(final Script script, final List<String> args, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook) {
        return this.executeInternal(script, args, preExecHook, postExecHook, true);
    }

    @Override
    public ScriptResult<?, ? extends Throwable> include(final Script script, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook) {
        return this.executeInternal(script, Collections.emptyList(), preExecHook, postExecHook, false);
    }

    private ScriptResult<?, ? extends Throwable> executeInternal(final Script script, final List<String> args, final Consumer<ScriptEngine> preExecHook, final Consumer<ScriptEngine> postExecHook, final boolean normalExecution) {
        String scriptPath = script.getPath();
        final var extension = scriptPath.substring(scriptPath.lastIndexOf('.') + 1);
        final var engine = this.engines.get(extension).getScriptEngine();

        var context = engine.getContext();
        if (context == null) {
            context = new SimpleScriptContext();
            engine.setContext(context);
        }

        context.setWriter(new PrintWriter(System.out));

        var globalScope = context.getBindings(GLOBAL_SCOPE);
        if (globalScope == null) {
            context.setBindings(engine.createBindings(), ScriptContext.GLOBAL_SCOPE);
            globalScope = context.getBindings(GLOBAL_SCOPE);
        }

        var engineScope = context.getBindings(ENGINE_SCOPE);
        if (engineScope == null) {
            context.setBindings(engine.createBindings(), ENGINE_SCOPE);
            engineScope = context.getBindings(ENGINE_SCOPE);
        }

        final var id = ID_GENERATOR.addAndGet(1);
        final var loggerName = "#" + id + ":" +
            scriptPath.substring(scriptPath.lastIndexOf('/') + 1, scriptPath.lastIndexOf('.')).replace('.', '-') +
            "@" + scriptPath.substring(scriptPath.lastIndexOf('.') + 1);
        final var scriptLogger = LogManager.getLogger(loggerName);

        globalScope.put("__MAIN__", normalExecution);
        globalScope.put("id", id);
        globalScope.put("uuid", UUID.randomUUID());
        globalScope.put("logger", scriptLogger);

        if (engine instanceof GroovyScriptEngineImpl) {
            engine.getContext().setAttribute("#jsr223.groovy.engine.keep.globals", "weak", ENGINE_SCOPE);
            // FIXME awaiting https://github.com/groovy/groovy-core/pull/685
            engine.getContext().setAttribute("#jsr223.groovy.engine.script.name.prefix", script.getMetadata().getName(), ENGINE_SCOPE);
        }

        final var commandTypes = new ArrayList<Class>();

        final var commands = new ArrayList<AbstractCommand>();

        for (CommandProvider<?> commandProvider: commandProviders) {
            if (normalExecution) {
                scriptLogger.trace("Registering command '" + commandProvider.getName() + "' from " + commandProvider.getClass());
            }
            final var command = commandProvider.getCommand(this.core, engine);
            if (command == null) {
                throw new JMacroException(this,
                    "Command provider " + commandProvider.getName() + " returned null command");
            }
            final var name = commandProvider.getName();
            if (engineScope.containsKey(name)) {
                throw new JMacroException("Command [" + name + "] already registered for " + engineScope.get(name).getClass() + ". Register attempt from " + commandProvider.getClass());
            }
            engineScope.put(name, command);
            commands.add(command);
            if (command instanceof OnShutdown onShutdown) {
                ON_SHUTDOWN.add(onShutdown);
            }

            commandTypes.add(command.getClass());
        }

        commands.forEach(Command::allCommandsLoaded);

        var locationArg = script.getLocation().toString();
        locationArg = normalExecution ? INCLUDED + ':' + locationArg : locationArg;
        final var argsFinal = new LinkedList<>(args);
        argsFinal.addFirst(locationArg);
        scriptLogger.warn("Script args: " + argsFinal);
        engineScope.put(ARGV, argsFinal);
        engineScope.put("__SCRIPT__", script);
        engineScope.put("__METADATA__", script.getMetadata());
        engineScope.put("__CONTEXT__", engineScope);

        commands.forEach(Command::allCommandsRegistered);
        EngineResult<?, ? extends Throwable> result = (EngineResult) engineScope.get("result");


        if (this.languageAdaptors.containsKey(extension)) {
            LOGGER.warn("Running adaptor for " + extension);
            this.languageAdaptors.get(extension).adapt(engine);
        }

        script.run(() -> {
            if (normalExecution) {
                scriptLogger.warn(DOUBLE_SEPARATOR);
                scriptLogger.warn(DOUBLE_SEPARATOR);
                Arrays.stream(script.getMetadata().getBanner().split("\n")).forEach(scriptLogger::warn);
                scriptLogger.warn(SINGLE_SEPARATOR);
                scriptLogger.warn(SINGLE_SEPARATOR);
            }
            Object evalReturn = null;
            try {
                preExecHook.accept(engine);
                evalReturn = engine.eval(script.getSource());
                postExecHook.accept(engine);
            } catch (final Throwable exception) {
                if (!normalExecution) {
                    ExitException exitEx = getExitException(exception);
                    throw new ExitException(exitEx == null ? ExitException.SCRIPT_ENGINE_ERROR : exitEx.getExitCode(), exception);
                }

                ExitException exitException = getExitException(exception);

                if (exitException == null && result.exitCode() == ExitException.OK) {
                    result.exitCode(ExitException.SCRIPT_ENGINE_ERROR);
                }
                LOGGER.warn("Result code: " + result.exitCode());

                if (exitException != null) {
                    if (exitException.getExitCode() != ExitException.OK) {
                        // fixme ADD WHERE CASE NO EXCEPTION LIKE  exit(5)
                        LOGGER.error("Exit cause: exit(" + exitException.getExitCode() + ")", exitException.getCause());
                    } else {
                        String where = "unknown source";
                        Optional<StackTraceElement> stackTraceElementOptional = Arrays.stream(exitException.getStackTrace()).filter(ste -> !ste.getFileName().endsWith(".java")).findFirst();
                        if (stackTraceElementOptional.isPresent()) {
                            StackTraceElement element = stackTraceElementOptional.get();
                            where = element.getClassName() + "#" + element.getMethodName() + "():" + element.getLineNumber() + "@" + element.getFileName();
                        }
                        LOGGER.info("Exit cause: exit(0) (" + where + ")");
                    }
                } else {
                    LOGGER.error("Exit cause: " + exception.getMessage(), exception);
                }
            } finally {
                if (normalExecution) {
                    this.closeCommands(engine);
                }
            }
            if (normalExecution) {
                exitBanner(script, scriptLogger, result);
            }
            return evalReturn;
        });

        return new ScriptResult<>(script, result);
    }

    private static void exitBanner(Script script, Logger scriptLogger, EngineResult<?, ?> engineResult) {
        scriptLogger.warn(SINGLE_SEPARATOR);
        scriptLogger.warn(SINGLE_SEPARATOR);
        final var scriptExitCodeDescription = (engineResult.exitCode() == ExitException.SCRIPT_ENGINE_ERROR)
            ? " (Script engine error)"
            : " (Script exit code)";
        scriptLogger.warn("Script exited with code " + engineResult.exitCode() + scriptExitCodeDescription);
        scriptLogger.warn(SINGLE_SEPARATOR);
        scriptLogger.warn("Result for script " + script.getPath());
        scriptLogger.warn("result:");
        scriptLogger.warn(engineResult.value());
        scriptLogger.warn(DOUBLE_SEPARATOR);
        scriptLogger.warn(DOUBLE_SEPARATOR);
    }

    public void onShutdown() {
        ON_SHUTDOWN.forEach(OnShutdown::onShutdown);
    }

    private static ExitException getExitException(Throwable exception) {
        ExitException exitException = null;
        Throwable cause = exception.getCause();
        while (cause != null) {
            if (cause instanceof ExitException ex) {
                exitException = ex;
            }
            cause = cause.getCause();
        }
        return exitException;
    }

    private void closeCommands(final ScriptEngine engine) {
        for (final int scope : new int[]{ENGINE_SCOPE, GLOBAL_SCOPE}) {
            new ConcurrentHashMap<>(engine.getBindings(scope)).forEach((key, value) -> {
                try {
                    if (value instanceof AutoCloseableAll closeable) {
                        LOGGER.debug("Closing command " + key + " as it is AutoCloseableAll");
                        closeable.closeAll();
                    } else if (value instanceof AutoCloseable closeable) {
                        LOGGER.debug("Closing command " + key + " as it is AutoCloseable");
                        closeable.close();
                    }
                } catch (final Exception exception) {
                    LOGGER.error("Error closing command " + key, exception);
                }
            });
        }
    }
}

