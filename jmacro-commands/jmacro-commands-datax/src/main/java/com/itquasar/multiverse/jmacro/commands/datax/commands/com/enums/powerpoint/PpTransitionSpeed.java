package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptransitionspeed">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptransitionspeed</a>}
*/
public enum PpTransitionSpeed implements COMEnum {
    
    /**@ Fast */
    ppTransitionSpeedFast(3),    
    /**@ Medium */
    ppTransitionSpeedMedium(2),    
    /**@ Mixed */
    ppTransitionSpeedMixed(-2),    
    /**@ Slow */
    ppTransitionSpeedSlow(1);

    private final long value;

    PpTransitionSpeed(long value) {
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
