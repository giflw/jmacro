package com.itquasar.multiverse.jmacro.commands.browser.providers;

import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand;
import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;

import javax.script.ScriptEngine;

public class BrowserCommandProvider implements CommandProvider<BrowserCommand> {

    @Override
    public String getName() {
        return "browser";
    }

    @Override
    public Class<BrowserCommand> getCommandType() {
        return BrowserCommand.class;
    }

    @Override
    public BrowserCommand getCommand(Core core, ScriptEngine scriptEngine) {
        return new BrowserCommand(getName(), core, scriptEngine);
    }
}
