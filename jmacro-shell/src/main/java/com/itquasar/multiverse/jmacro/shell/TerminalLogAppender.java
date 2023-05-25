package com.itquasar.multiverse.jmacro.shell;

@Plugin(
    name = "MapAppender",
    category = Core.CATEGORY_NAME,
    elementType = Appender.ELEMENT_TYPE)
public class MapAppender extends AbstractAppender {

    private final ConcurrentMap<String, LogEvent> eventMap = new ConcurrentHashMap<>();

    protected MapAppender(String name, Filter filter) {
        super(name, filter, null);
    }

    @PluginFactory
    public static MapAppender createAppender(
        @PluginAttribute("name") String name,
        @PluginElement("Filter") Filter filter) {
        return new MapAppender(name, filter);
    }

    @Override
    public void append(LogEvent event) {
        eventMap.put(Instant.now().toString(), event);
    }
}
