package com.itquasar.multiverse.jmacro.commands.browser.providers;

import com.itquasar.multiverse.jmacro.commands.browser.command.BrowserCommand;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public class BrowserCommandProvider implements CommandProvider<BrowserCommand> {

    @Override
    public Class<BrowserCommand> getCommandType() {
        return BrowserCommand.class;
    }

    @Override
    public BrowserCommand getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        return new BrowserCommand(core, scriptEngineAware);
    }
}
