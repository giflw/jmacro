package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;

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
     * @param core   Core to use in this command.
     * @param scriptEngine Script engine instance where command will be bound.
     * @return Command new instance.
     */
    C getCommand(Core core, ScriptEngine scriptEngine);
}
