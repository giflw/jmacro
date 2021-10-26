package com.itquasar.multiverse.jmacro.core;

import javax.script.ScriptEngine;

public interface LanguageAdaptor {

    String forExtension();

    void adapt(ScriptEngine scriptEngine);

}
