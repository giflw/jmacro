package com.itquasar.multiverse.jmacro.core.util;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@UtilityClass
public class URLUtil {

    @SneakyThrows
    public URL create(String url){
        return new URL(url);
    }

    public Map<String, String> parseOptions(URL url) {
        return Arrays.stream(url.getQuery().split("&"))
            .map(pair -> pair.split("=", 2))
            .collect(Collectors.toMap(pair -> pair[0], pair -> pair[1]));
    }
}
