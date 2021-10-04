package com.itquasar.multiverse.jmacro.commands.base;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Context;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Echo extends Command {

    public Echo(Context context) {
        super(context);
    }

    @Override
    public String getName() {
        return "echo";
    }

    public String call(Object... args) {
        if (args == null) {
            return "null";
        }
        return Arrays.stream(args)
            .filter(Objects::nonNull)
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}
