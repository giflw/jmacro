package com.itquasar.multiverse.jmacro.commands.io


import groovy.json.JsonBuilder
import groovy.transform.CompileDynamic

import java.nio.charset.StandardCharsets

@CompileDynamic
class IOExtensionMethods {

    //////////////////////////////////////////////////////////////////////////////////////
    // Object
    //////////////////////////////////////////////////////////////////////////////////////

    static String toJson(Object self, boolean pretty = true) {
        return new JsonBuilder(self).toPrettyString()
    }

    //////////////////////////////////////////////////////////////////////////////////////
    // STRING
    //////////////////////////////////////////////////////////////////////////////////////

    static urlEncode(String self) {
        return URLEncoder.encode(self, StandardCharsets.UTF_8)
    }

    static urlDecode(String self) {
        return URLDecoder.decode(self, StandardCharsets.UTF_8)
    }

}
