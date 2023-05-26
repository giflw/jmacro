package com.itquasar.multiverse.jmacro.shell;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jline.reader.Candidate;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JLineScriptEngine implements org.jline.console.ScriptEngine {

    private static final Logger LOGGER = LogManager.getLogger(JLineScriptEngine.class);

    private final ScriptEngine scriptEngine;

    public JLineScriptEngine(ScriptEngine scriptEngine) {
        this.scriptEngine = scriptEngine;
    }

    @Override
    public String getEngineName() {
        return scriptEngine.getFactory().getEngineName();
    }

    @Override
    public Collection<String> getExtensions() {
        return scriptEngine.getFactory().getExtensions();
    }

    @Override
    public Completer getScriptCompleter() {
        return new Completer() {
            @Override
            public void complete(LineReader reader, ParsedLine line, List<Candidate> candidates) {
                LOGGER.warn("Completer not implemented yet!");
            }
        };
    }

    @Override
    public boolean hasVariable(String name) {
        return scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).containsKey(name);
    }

    @Override
    public void put(String name, Object value) {
        scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).put(name, value);
    }

    @Override
    public Object get(String name) {
        return scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).get(name);
    }

    @Override
    public Map<String, Object> find(String name) {
        if (name.equals("*")) {
            return scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
        }
        Predicate<Map.Entry<String, Object>> filter = (entry) -> false;
        if (name.startsWith("*")) {
            String search = name.substring(1);
            filter = (Map.Entry<String, Object> entry) -> entry.getKey().endsWith(search);
        } else if (name.endsWith("*")) {
            String search = name.substring(0, name.length() - 1);
            filter = (Map.Entry<String, Object> entry) -> entry.getKey().startsWith(search);
        } else {
            filter = (Map.Entry<String, Object> entry) -> entry.getKey().equals(name);
        }
        return scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).entrySet().stream().filter(filter).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public void del(String... vars) {
        for (var key : vars) {
            scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE).remove(key);
        }
    }

    @Override
    public String toJson(Object object) {
        return new Gson().toJson(object);
    }

    @Override
    public String toString(Object object) {
        return object != null ? object.toString() : "<NULL>";
    }

    @Override
    public Map<String, Object> toMap(Object object) {
        return object == null ? Collections.emptyMap() : Arrays.stream(object.getClass().getDeclaredFields()).map(field -> {
            try {
                return List.of(field.getName(), field.get(object));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toMap(l -> l.get(0).toString(), l -> l.get(1)));
    }

    @Override
    public Object deserialize(String value, String format) {
        LOGGER.debug("deserialize from " + format + ": " + value);
        // FIXME use format
        HashMap fromJson = new Gson().fromJson(value, HashMap.class);
        return fromJson != null ? fromJson : new HashMap<>();
    }

    @Override
    public List<String> getSerializationFormats() {
        return List.of("json");
    }

    @Override
    public List<String> getDeserializationFormats() {
        return List.of("json");
    }

    @Override
    public void persist(Path file, Object object) {
        // FIXME
        LOGGER.error("persist not implemented yet!");
    }

    @Override
    public void persist(Path file, Object object, String format) {
        // FIXME
        LOGGER.error("persist not implemented yet!");
    }

    @Override
    public Object execute(String statement) throws Exception {
        LOGGER.error("execute not implemented yet!");
        return null;
    }

    @Override
    public Object execute(File script, Object[] args) throws Exception {
        LOGGER.error("execute not implemented yet!");
        return null;
    }

    @Override
    public Object execute(Object closure, Object... args) {
        LOGGER.error("execute not implemented yet!");
        return null;
    }
}
