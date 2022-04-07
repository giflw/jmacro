package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimadditive">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimadditive</a>}
*/
public enum MsoAnimAdditive implements COMEnum {
    
    /**@ Uses the animation behavior of the base animations. */
    msoAnimAdditiveAddBase(1),    
    /**@ Adds together the animation behavior of multiple animations. */
    msoAnimAdditiveAddSum(2);

    private final long value;

    MsoAnimAdditive(long value) {
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
