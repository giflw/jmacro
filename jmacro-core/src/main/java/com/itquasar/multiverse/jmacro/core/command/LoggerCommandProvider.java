package com.itquasar.multiverse.jmacro.core.command;

import lombok.extern.log4j.Log4j2;

import javax.script.ScriptContext;

// FIXME move to commands base
@Log4j2
public class LoggerCommandProvider implements CommandProvider {

    @Override
    public String getName() {
        return "logger";
    }

    @Override
    public Object getCommand(ScriptContext context) {
        return LOGGER;
    }
}
