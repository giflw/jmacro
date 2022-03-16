package com.itquasar.multiverse.jmacro.commands.io.commands.request

enum HttpMethod {
    GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH;

    private static Map<String, HttpMethod> VALUE_MAP

    static Map<String, HttpMethod> valuesMap() {
        if (!VALUE_MAP) {
            VALUE_MAP = values().collectEntries { item ->
                [(item.name()): item]
            }
        }
        return VALUE_MAP
    }
}
