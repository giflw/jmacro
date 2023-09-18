package com.itquasar.multiverse.jmacro.core.engine

import groovy.transform.CompileDynamic

class ScriptConfiguration {

    private Map<String, ConfigurationHolder<?>> configHolders = new LinkedHashMap<>()
    private ConfigObject custom = new ConfigObject()

    Map<String, ConfigurationHolder<?>> getConfigHolders() {
        return configHolders
    }

    ConfigObject getCustom() {
        return custom
    }

    @CompileDynamic
    ScriptConfiguration fill(Map<String, String> configurations) {
        for (Map.Entry<String, String> entry : configurations) {
            List<String> paths = (entry.key.split("\\.")).toList()
            Object object = this.configHolders.containsKey(paths.first()) ? this.configHolders : null
            for (String path : paths) {
                if (object == null) {
                    scriptLogger.warn("Could not find configuration ${entry.key} (path ${path} is null). Creating custom config.")
                    this.custom.putAt(entry.key, entry.value)
                    break
                }
                if (path == paths.last()) {
                    if (object instanceof ConfigurationHolder<?>) {
                        object.setValueOf(entry.value)
                    } else {
                        object."$path" = entry.value
                    }
                    break
                }
                object = object."$path"
            }
        }
        return this
    }
}
