package com.itquasar.multiverse.jmacro.core.engine;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.SimpleBindings;

public abstract class AbstractLanguageAdaptor implements LanguageAdaptor {

    /**
     * {@link ScriptEngine} instance to apply language adaptations.
     */
    private ScriptEngine scriptEngine = null;

    protected final ScriptEngine getScriptEngine() {
        return scriptEngine;
    }

    private void setScriptEngine(final ScriptEngine scriptEngine) {
        if (this.scriptEngine != null) {
            throw new IllegalStateException(
                "Script engine already adapted for language file extension " + this.forExtension());
        }
        this.scriptEngine = scriptEngine;
    }

    protected final ScriptContext getScriptContext() {
        return scriptEngine.getContext();
    }

    @Override
    public final void adapt(final ScriptEngine engine) {
        this.setScriptEngine(engine);
        this._adapt(engine);
    }

    /**
     * Method to perform language adaptation using class extension.
     *
     * @param engine
     */
    protected abstract void _adapt(ScriptEngine engine);

    /**
     * @return All bindings in global and engine scopes. Engine scoped bindings override globals if named same.
     */
    public final Bindings getBindings() {
        Bindings allBindings = new SimpleBindings();
        for (int scope : new int[]{ScriptContext.GLOBAL_SCOPE, ScriptContext.ENGINE_SCOPE}) {
            Bindings bindings = this.getScriptContext().getBindings(scope);
            allBindings.putAll(bindings);
        }
        return allBindings;
    }

    /**
     * @param key Binding key to get.
     * @param <T> Binding type.
     * @return Binding value or null if not found.
     */
    public final <T> T getBinding(final String key) {
        return this.getBinding(key, null);
    }

    /**
     * Get binding by given key and return value or default value if null.
     *
     * @param key          Binding key to get.
     * @param defaultValue Default value if null.
     * @param <T>          Binding type.
     * @return Binding value or default value if null.
     */
    public final <T> T getBinding(final String key, final T defaultValue) {
        for (int scope : new int[]{ScriptContext.ENGINE_SCOPE, ScriptContext.GLOBAL_SCOPE}) {
            Bindings bindings = this.getScriptContext().getBindings(scope);
            if (bindings.containsKey(key)) {
                return (T) bindings.get(key);
            }
        }
        return defaultValue;
    }
}
