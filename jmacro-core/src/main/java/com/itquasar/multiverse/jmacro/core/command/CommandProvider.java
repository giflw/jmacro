package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.JMacroCore;

import javax.script.ScriptEngine;

public interface CommandProvider<C> {

    /**
     * @return Command name to be used to invoke in script.
     */
    default String getName() {
        return this.getClass().getSimpleName().replace(CommandProvider.class.getSimpleName(), "").toLowerCase();
    }

    /**
     * @return Command type.
     */
    Class<C> getCommandType();

    /**
     * Create command new instance when called.
     *
     * @param jMacroCore   Core to use in this command.
     * @param scriptEngine Script engine instance where command will be bound.
     * @return Command new instance.
     */
    C getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine);
}
