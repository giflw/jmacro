package com.itquasar.multiverse.jmacro.core;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.SimpleBindings;

public abstract class AbstractLanguageAdaptor implements LanguageAdaptor {

    private ScriptEngine scriptEngine = null;

    final protected ScriptEngine getScriptEngine() {
        return scriptEngine;
    }

    private void setScriptEngine(ScriptEngine scriptEngine) {
        if (this.scriptEngine != null) {
            throw new IllegalStateException("Script engine already adapted for language file extension " + this.forExtension());
        }
        this.scriptEngine = scriptEngine;
    }

    final protected ScriptContext getScriptContext() {
        return scriptEngine.getContext();
    }

    @Override
    public final void adapt(ScriptEngine scriptEngine) {
        this.setScriptEngine(scriptEngine);
        this._adapt(scriptEngine);
    }

    public abstract void _adapt(ScriptEngine scriptEngine);

    public Bindings getBindings() {
        Bindings allBindings = new SimpleBindings();
        for (int scope : new int[]{ScriptContext.GLOBAL_SCOPE, ScriptContext.ENGINE_SCOPE}) {
            Bindings bindings = this.getScriptContext().getBindings(scope);
            allBindings.putAll(bindings);
        }
        return allBindings;
    }

    public <T> T getBinding(String key) {
        return this.getBinding(key, null);
    }

    public <T> T getBinding(String key, T defaultValue) {
        for (int scope : new int[]{ScriptContext.ENGINE_SCOPE, ScriptContext.GLOBAL_SCOPE}) {
            Bindings bindings = this.getScriptContext().getBindings(scope);
            if (bindings.containsKey(key)) {
                return (T) bindings.get(key);
            }
        }
        return defaultValue;
    }
}
