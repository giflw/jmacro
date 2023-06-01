package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.Core;
import com.itquasar.multiverse.jmacro.core.exception.FieldAlreadySet;

public abstract class JMXBean implements JMXBeanIFace {

    private Core core;

    public Core getCore() {
        return this.core;
    }

    public void setCore(Core core) {
        if (this.core == null) {
            this.core = core;
        } else {
            throw new FieldAlreadySet("jMacroCore");
        }
    }

}
