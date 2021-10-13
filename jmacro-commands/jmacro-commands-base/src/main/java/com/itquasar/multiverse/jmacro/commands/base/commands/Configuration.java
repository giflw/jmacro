package com.itquasar.multiverse.jmacro.commands.base.commands;

import lombok.SneakyThrows;
import lombok.ToString;

import java.util.LinkedHashMap;

@ToString
public class Configuration extends LinkedHashMap<String, Object> {

    @SneakyThrows
    public Object propertyMissing(String name) {
        if (this.containsKey(name)) {
            return this.get(name);
        }
        throw new NoSuchFieldException("Property " + name + " not found!");
    }
}
