package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums;

import com.jacob.com.Variant;

public interface COMEnum {

    String name();

    Variant toVariant();

    long getValue();
}
