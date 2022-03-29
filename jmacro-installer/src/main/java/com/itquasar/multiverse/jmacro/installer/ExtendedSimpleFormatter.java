package com.itquasar.multiverse.jmacro.installer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class ExtendedSimpleFormatter extends Formatter {

    // private static final String format = "%1$tFT%1$tT.%1$tL%1$tz [%4$s] %2$s - %5$s\u001F%6$s%n";
    private static final String format = "%1$tFT%1$tT [%4$s] %2$s - %5$s\u001F%6$s%n";

    @Override
    public String format(LogRecord record) {
        ZonedDateTime zdt = ZonedDateTime.ofInstant(record.getInstant(), ZoneId.systemDefault());
        String source;
        if (record.getSourceClassName() != null) {
            source = record.getSourceClassName();
            if (record.getSourceMethodName() != null) {
                source += "::" + record.getSourceMethodName();
            }
        } else {
            source = record.getLoggerName();
        }

        var prefix = Arrays.stream(source.split("\\."))
            .map(it -> it.charAt(0))
            .filter(Character::isLowerCase)
            .map(it -> it.toString())
            .reduce((acc, it) -> acc + "." + it)
            .orElse("");
        source = prefix + "." + (source.lastIndexOf(".") > -1 ? source.substring(source.lastIndexOf(".") + 1) : source);

        String message = formatMessage(record);
        String throwable = "";
        if (record.getThrown() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            pw.println();
            record.getThrown().printStackTrace(pw);
            pw.close();
            throwable = sw.toString();
        }
        return String.format(format, zdt, source, record.getLoggerName(), record.getLevel().toString().substring(0, 4), message, throwable);
    }
}
