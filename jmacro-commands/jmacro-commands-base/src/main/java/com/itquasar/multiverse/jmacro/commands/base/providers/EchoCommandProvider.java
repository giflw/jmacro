package com.itquasar.multiverse.jmacro.commands.base.providers;

import javax.script.ScriptEngine;

import org.apache.logging.log4j.Level;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import com.itquasar.multiverse.jmacro.core.command.Doc;

public class EchoCommandProvider implements CommandProvider<EchoCommandProvider.EchoCommand> {

    /**
     * New log level between WARN and INFO.
     */
    public static final Level ECHO = Level.forName("ECHO", 350);

    @Override
    public String getName() {
        return "echo";
    }

    @Override
    public Class<EchoCommand> getCommandType() {
        return EchoCommand.class;
    }

    @Override
    public EchoCommand getCommand(final JMacroCore jMacroCore, final ScriptEngine scriptEngine) {
        return new EchoCommand(this.getName(), jMacroCore, scriptEngine);
    }


    // TODO add option to skip new line
    @Doc("Echoes given argument to script output")
    public static class EchoCommand extends Command {

        public EchoCommand(final String name, final JMacroCore core, final ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }

        @Doc("Make this object behaves as function on groovy environment.")
        void call(@Doc("Object to print to script output") final Object arg) {
            this.getLogger().log(ECHO, arg);
        }

    }
}
