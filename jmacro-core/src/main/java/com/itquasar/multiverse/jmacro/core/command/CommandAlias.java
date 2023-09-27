package com.itquasar.multiverse.jmacro.core.command;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(CommandAliases.class)
public @interface CommandAlias {
    String value();
}
