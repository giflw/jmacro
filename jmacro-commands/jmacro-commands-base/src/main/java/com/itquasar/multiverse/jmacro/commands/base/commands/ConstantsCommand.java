package com.itquasar.multiverse.jmacro.commands.base.commands;

import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.Command;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import com.itquasar.multiverse.jmacro.core.interfaces.Constants;

import javax.script.Bindings;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ConstantsCommand extends AbstractCommand implements Map<String, Object>, Constants {

    private final Map<String, Object> map = new LinkedHashMap<>();

    public ConstantsCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware);
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
    public void allCommandsRegistered(Collection<? extends Command> commands) {
        Bindings bindings = this.getBindings();
        this.entrySet().stream().forEach(entry -> {
            String key = entry.getKey();
            if (!key.startsWith("_")) {
                key = "$" + key;
                if (bindings.containsKey(key)) {
                    getScriptLogger().error(key + " constant cannot be registered in context. Command " + bindings.get(key).getClass() + " registered with " + key + " name");
                } else {
                    Object value = entry.getValue();
                    if ((boolean) getContext().getAttribute("__MAIN__")) {
                        getScriptLogger().trace("Registering constant " + key + " = " + value);
                    }
                    bindings.put(key, value);
                }
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
