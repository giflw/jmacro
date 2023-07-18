package com.itquasar.multiverse.jmacro.core.engine;

import com.itquasar.multiverse.jmacro.core.engine.AbstractLanguageAdaptor;
import lombok.extern.log4j.Log4j2;

import javax.script.ScriptEngine;
import java.util.Set;
import java.util.stream.Collectors;

@Log4j2
public final class ScalaLanguageAdaptor extends AbstractLanguageAdaptor {

    @Override
    public void _adapt(final ScriptEngine scriptEngine) {
        Set<String> implicitConversions = getBindings().values().stream()
            .map(Object::getClass)
            .filter(it -> !it.isArray() && !it.isPrimitive())
            .distinct()
            // FIXME
            .filter(it -> !it.getSimpleName().endsWith("Map"))
            .filter(it -> !it.getSimpleName().endsWith("List"))
            .filter(it -> !it.getSimpleName().endsWith("Set"))
            .filter(it -> !it.getSimpleName().endsWith("Queue"))
            .map(it -> """
                    implicit def obj2%s(x: Object) = x.asInstanceOf[%s]
                    """.formatted(
                    it.getName().replace(".", "_"),
                    it.getName()
                ).trim()
            )
            .collect(Collectors.toSet());


        implicitConversions.add("implicit def obj2set(x: Object) = x.asInstanceOf[java.util.Set[_]]");
        implicitConversions.add("implicit def obj2list(x: Object) = x.asInstanceOf[java.util.List[_]]");
        implicitConversions.add("implicit def obj2queue(x: Object) = x.asInstanceOf[java.util.Queue[_]]");
        implicitConversions.add("implicit def obj2map(x: Object) = x.asInstanceOf[java.util.Map[_,_]]");

        for (String implicitConversion : implicitConversions) {
            try {
                LOGGER.warn("Registering implicit conversion: " + implicitConversion);
                scriptEngine.eval(implicitConversion);
            } catch (Exception ex) {
                LOGGER.error("Failed to register implicit conversion", ex);
            }
        }
    }

    @Override
    public String forExtension() {
        return "scala";
    }
}
