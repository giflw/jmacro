package com.itquasar.multiverse.jmacro.core;

import javax.script.ScriptContext;

public interface LanguageAdaptor {

    String forExtension();

    void adapt(ScriptContext scriptContext);
}
