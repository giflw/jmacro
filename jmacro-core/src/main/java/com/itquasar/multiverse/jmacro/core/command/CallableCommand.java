package com.itquasar.multiverse.jmacro.core.command;

public interface CallableCommand <IN, OUT> extends Command {

    OUT call(IN in);

    default Object methodMissing(String name, Object args) {
        return CommandUtils.callMethodAliasOrOnBindings(this, name, args);
    }

}
