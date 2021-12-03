package com.itquasar.multiverse.jmacro.core.util;

import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@UtilityClass
@Log4j2
public class URLUtil {

    public URL create(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new JMacroException("Error creating URL objetc for [" + url + "]", e);
        }
    }

    public Map<String, String> parseOptions(URL url) {
        return Arrays.stream(url.getQuery().split("&"))
            .map(pair -> pair.split("=", 2))
            .collect(Collectors.toMap(pair -> pair[0], pair -> pair[1]));
    }
}
