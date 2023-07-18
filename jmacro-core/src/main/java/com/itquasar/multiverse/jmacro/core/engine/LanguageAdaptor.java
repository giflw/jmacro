package com.itquasar.multiverse.jmacro.core.engine;

import javax.script.ScriptEngine;

public interface LanguageAdaptor {

    String forExtension();

    void adapt(ScriptEngine scriptEngine);

}
