package com.itquasar.multiverse.jmacro.core.command;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;

import javax.script.ScriptEngine;
import java.util.Collections;
import java.util.List;

public interface CommandProvider<C extends Command> {

    /**
     * @return Command name to be used to invoke in script.
     */
    String getName();

    default List<String> getAliases() {
        return Collections.emptyList();
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
