package com.itquasar.multiverse.jmacro.core.engine;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public interface LanguageAdaptor {

    String forExtension();

    void adapt(ScriptEngine scriptEngine);

}
