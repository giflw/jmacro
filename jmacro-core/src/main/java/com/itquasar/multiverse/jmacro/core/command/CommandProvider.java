package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.engine.Engine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

import javax.script.ScriptEngine;
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware;

public interface CommandProvider<C extends AbstractCommand> {

    /**
     * @return Command name to be used to invoke in script.
     */
    String getName();

    /**
     * @return Command type.
     */
    Class<C> getCommandType();

    /**
     * Create command new instance when called.
     *
     * @param core         Core to use in this command.
     * @param scriptEngineAware Script engine aware instance where command will be bound.
     * @return Command new instance.
     */
    C getCommand(Core core, ScriptEngineAware scriptEngineAware);
}
