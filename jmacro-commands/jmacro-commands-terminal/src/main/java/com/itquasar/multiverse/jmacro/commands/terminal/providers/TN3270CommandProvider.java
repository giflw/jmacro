package com.itquasar.multiverse.jmacro.commands.terminal.providers;

import com.itquasar.multiverse.jmacro.commands.terminal.commands.TN3270Command;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;
import com.itquasar.multiverse.tn3270j.WaitMode;

import javax.script.Bindings;
import javax.script.ScriptContext;

public class TN3270CommandProvider implements CommandProvider<TN3270Command> {

    @Override
    public Class<TN3270Command> getCommandType() {
        return TN3270Command.class;
    }

    @Override
    public TN3270Command getCommand(Core core, ScriptEngineAware scriptEngineAware) {
        Bindings bindings = scriptEngineAware.scriptEngine().getBindings(ScriptContext.ENGINE_SCOPE);
        bindings.put("WaitMode", WaitMode.class);
        return new TN3270Command(core, scriptEngineAware);
    }
}
