package com.itquasar.multiverse.jmacro.core;

import javax.script.Bindings;
import javax.script.ScriptContext;

public abstract class AbstractLanguageAdaptor implements LanguageAdaptor {

    private ScriptContext scriptContext = null;

    protected ScriptContext getScriptContext() {
        return scriptContext;
    }

    private void setScriptContext(ScriptContext scriptContext) {
        if (this.scriptContext != null) {
            throw new IllegalStateException("Script context already adapted for language file extension " + this.forExtension());
        }
        this.scriptContext = scriptContext;
    }

    @Override
    public final void adapt(ScriptContext scriptContext) {
        this.setScriptContext(scriptContext);
        this._adapt(scriptContext);
    }

    public abstract void _adapt(ScriptContext scriptContext);

    public <T> T getBinding(String key) {
        return this.getBinding(key, null);
    }

    public <T> T getBinding(String key, T defaultValue) {
        for (int scope : new int[]{ScriptContext.ENGINE_SCOPE, ScriptContext.GLOBAL_SCOPE}) {
            Bindings bindings = this.scriptContext.getBindings(scope);
            if (bindings.containsKey(key)) {
                return (T) bindings.get(key);
            }
        }
        return defaultValue;
    }
}
