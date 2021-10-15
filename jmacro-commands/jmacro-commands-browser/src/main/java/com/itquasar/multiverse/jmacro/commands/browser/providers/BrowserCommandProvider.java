package com.itquasar.multiverse.jmacro.commands.browser.providers;

import com.itquasar.multiverse.jmacro.commands.browser.command.Browser;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class BrowserCommandProvider implements CommandProvider<Browser> {

    @Override
    public String getName() {
        return "browser";
    }

    @Override
    public Browser getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new Browser(scriptEngine.getContext());
    }
}
