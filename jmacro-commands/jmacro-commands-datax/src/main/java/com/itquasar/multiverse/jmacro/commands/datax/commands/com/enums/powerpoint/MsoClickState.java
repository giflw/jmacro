package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoclickstate">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoclickstate</a>}
*/
public enum MsoClickState implements COMEnum {
    
    /**@ After all animations. */
    msoClickStateAfterAllAnimations(-2),    
    /**@ Before automatic animations. */
    msoClickStateBeforeAutomaticAnimations(-1);

    private final long value;

    MsoClickState(long value) {
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
