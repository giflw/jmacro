package com.itquasar.multiverse.jmacro.shell;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.jline.reader.LineReader;

@Plugin(
    name = "JLineAppender",
    category = Core.CATEGORY_NAME,
    elementType = Appender.ELEMENT_TYPE)
public class JLineAppender extends AbstractAppender {

    private static LineReader LINE_READER;

    public static void configure(LineReader lineReader) {
        LINE_READER = lineReader;
    }
    protected JLineAppender(String name, Filter filter) {
        super(name, filter, null, true, Property.EMPTY_ARRAY);
    }

    @PluginFactory
    public static JLineAppender createAppender(
        @PluginAttribute("name") String name,
        @PluginElement("Filter") Filter filter) {
        return new JLineAppender(name, filter);
    }

    @Override
    public void append(LogEvent event) {
        if (LINE_READER != null) {
            LINE_READER.printAbove(event.getMessage().getFormattedMessage());
        }
    }
}
