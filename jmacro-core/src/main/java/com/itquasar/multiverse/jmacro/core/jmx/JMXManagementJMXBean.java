package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.j256.simplejmx.common.JmxAttributeField;
import com.j256.simplejmx.common.JmxAttributeMethod;
import com.j256.simplejmx.common.JmxOperation;
import com.j256.simplejmx.common.JmxResource;

@JmxResource(description = "JMXManagement bean", domainName = "com.itquasar.multiverse.jmacro.core", beanName = "JMXManagement")
public class JMXManagementJMXBean extends JMXBean {

    @JmxAttributeField(description = "Number of hits in the cache")
    private long startTimestamp = System.currentTimeMillis();

    @JmxAttributeMethod
    public JMacroCore getJMacroCore() {
        return super.getJMacroCore();
    }

    @JmxOperation(description = "Call GC")
    public String callGC() {
        System.gc();
        return "GC CALLED";
    }
}
