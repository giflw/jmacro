package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Constants;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ConstantsCommand extends Command implements Map<String, Object>, Constants {

    private final Map<String, Object> map = new LinkedHashMap<>();

    public ConstantsCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine);
        this.init();
    }

    private void init() {
        for (Field declaredField : Constants.class.getDeclaredFields()) {
            try {
                this.put(declaredField.getName(), declaredField.get(null));
            } catch (IllegalAccessException e) {
                new JMacroException("Failed to get Constants." + declaredField.getName());
            }
        }
    }

    @Override
    public void allCommandsRegistered() {
        Bindings bindings = this.getBindings();
        this.entrySet().stream().forEach(entry -> {
            String key = "$" + entry.getKey();
            if (bindings.containsKey(key)) {
                getLogger().error(key + " constant cannot be registered in context. Command " + bindings.get(key).getClass() + " registered with " + key + " name");
            } else {
                Object value = entry.getValue();
                getLogger().warn("Registering constant " + key + " = " + value);
                bindings.put(key, value);
            }
        });
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.map.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return this.map.get(key);
    }

    /**
     * Use key as name and value for key constant
     *
     * @param key Constant name
     * @return Same as {@link #put(String, Object)}
     */
    public Object put(String key) {
        return this.put(key, key);
    }

    @Override
    public Object put(String key, Object value) {
        if (key.matches("[A-Z_][A-Z0-9_]*")) {
            return this.map.put(key, value);
        }
        throw new IllegalArgumentException("Key must be upper case, [" + key + "] given");
    }

    @Override
    public Object remove(Object key) {
        throw new IllegalCallerException("Remove cannot be called from outside constants class");
    }

    @Override
    public void putAll(Map<? extends String, ?> m) {
        // force key validation on put
        m.entrySet().stream().forEach(entry -> this.put(entry.getKey(), entry.getValue()));
    }

    @Override
    public void clear() {
        throw new IllegalCallerException("Clear cannot be called from outside constants class");
    }

    @Override
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }
}
