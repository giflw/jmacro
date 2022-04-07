package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimaccumulate">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimaccumulate</a>}
*/
public enum MsoAnimAccumulate implements COMEnum {
    
    /**@ Accumulates with other animation behaviors. */
    msoAnimAccumulateAlways(2),    
    /**@ Does not accumulate. */
    msoAnimAccumulateNone(1);

    private final long value;

    MsoAnimAccumulate(long value) {
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
