package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import org.apache.logging.log4j.Level;

import javax.script.ScriptEngine;

public class EchoCommandProvider implements CommandProvider<EchoCommandProvider.EchoCommand> {

    /**
     * New log level between WARN and INFO.
     */
    public static final Level ECHO = Level.forName("ECHO", 350);

    @Override
    public Class<EchoCommand> getCommandType() {
        return EchoCommand.class;
    }

    @Override
    public EchoCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new EchoCommand(jMacroCore, scriptEngine);
    }

    public static class EchoCommand extends Command {

        public EchoCommand(JMacroCore core, ScriptEngine scriptEngine) {
            super(core, scriptEngine);
        }

        void call(Object arg) {
            this.getLogger().log(ECHO, arg);
        }

    }
}
