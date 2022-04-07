package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffectrestart">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimeffectrestart</a>}
*/
public enum MsoAnimEffectRestart implements COMEnum {
    
    /**@ Always restarts. */
    msoAnimEffectRestartAlways(1),    
    /**@ Never restarts. */
    msoAnimEffectRestartNever(3),    
    /**@ Restarts when animation is off. */
    msoAnimEffectRestartWhenOff(2);

    private final long value;

    MsoAnimEffectRestart(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
