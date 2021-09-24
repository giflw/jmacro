package com.itquasar.multiverse.jmacro.core;


import com.itquasar.multiverse.jmacro.core.exceptions.NotInstantiable;

public abstract class Command<T> {

    private Command() {
        throw new NotInstantiable(this.getClass());
    }

    private final Context context;

    protected Command(Context context) {
        this.context = context;
        System.out.println(context);
    }

    public abstract String getName();

}
