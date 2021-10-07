package com.itquasar.multiverse.jmacro.engine;

import com.j256.simplejmx.client.JmxClient;
import com.j256.simplejmx.common.JmxAttributeField;
import com.j256.simplejmx.common.JmxAttributeMethod;
import com.j256.simplejmx.common.JmxOperation;
import com.j256.simplejmx.common.JmxResource;
import com.j256.simplejmx.server.JmxServer;

import javax.management.ObjectName;
import java.util.Set;

public class JMXManagement {

    private static final int JMX_PORT = 8000;

    public static void main(String[] args) throws Exception {
        new JMXManagement().doMain(args);
    }

    private void doMain(String[] args) throws Exception {
        JmxServer jmxServer = new JmxServer(JMX_PORT);
        jmxServer.start();

        RuntimeCounter counter = new RuntimeCounter();
        jmxServer.register(counter);

        try {
            System.out.println("Sleeping for a while to let the server do its stuff");
            System.out.println("JMX server on port " + JMX_PORT);
            JmxClient client = new JmxClient("localhost", JMX_PORT);
            // get the set of bean names exported by the JVM
            Set<ObjectName> objectNameSet = client.getBeanNames();
            System.out.println("===========================================================");
            System.out.println("===========================================================");
            for(ObjectName objectName : objectNameSet) {
                System.out.println(objectName);
                System.out.println("===========================================================");
                System.out.println("===========================================================");
            }
            // get the start-time in milliseconds
            long startTimeMillis = (Long) client.getAttribute(new ObjectName("java.lang:type=Runtime"), "StartTime");
            // run garbage collection
            client.invokeOperation(new ObjectName("java.lang:type=Memory"), "gc");
            Thread.sleep(1000);
        } finally {
            jmxServer.close();
        }
    }

    /**
     * Here is our little bean that we are exposing via JMX.
     */
    @JmxResource(domainName = "j256.simplejmx", description = "Counter that shows how long we have been running")
    public static class RuntimeCounter {

        private long startMillis = System.currentTimeMillis();
        @JmxAttributeField(isWritable = true, description = "Show the time in seconds if true else milliseconds")
        private boolean showSeconds;

        @JmxAttributeMethod(description = "The time we have been running in seconds or milliseconds")
        public long getRunTime() {
            long diffMillis = System.currentTimeMillis() - startMillis;
            if (showSeconds) {
                return diffMillis / 1000;
            } else {
                return diffMillis;
            }
        }

        @JmxOperation(description = "Reset the start time to the current time millis")
        public String resetStartTime() {
            startMillis = System.currentTimeMillis();
            return "Timer has been reset to current millis";
        }

        @JmxOperation(description = "Add a positive or negative offset to the start time milliseconds",
            parameterNames = {"offset in millis"},
            parameterDescriptions = {"offset milliseconds value to add to start time millis"})
        public String addToStartTime(long offset) {
            long old = startMillis;
            startMillis += offset;
            return "Timer value changed from " + old + " to " + startMillis;
        }
    }
}
