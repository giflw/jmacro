package com.itquasar.multiverse.jmacro.core.jmx;

import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.exceptions.FieldAlreadySetted;

public abstract class JMXBean implements JMXBeanIFace {

    private JMacroCore jMacroCore;

    public JMacroCore getJMacroCore() {
        return this.jMacroCore;
    }

    public void setJMacroCore(JMacroCore jMacroCore) {
        if (this.jMacroCore == null) {
            this.jMacroCore = jMacroCore;
        } else {
            throw new FieldAlreadySetted("jMacroCore");
        }
    }

}
