package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acaxisrange">https://docs.microsoft.com/en-us/office/vba/api/access.acaxisrange</a>}
*/
public enum AcAxisRange implements COMEnum {
    
    /**@ The represented range is determined automatically by the lowest and highest values in the set. */
    acAxisRangeAuto(0),    
    /**@ The represented range is determined by fixed minimum/maximum values and may be clipped accordingly. */
    acAxisRangedFixed(1);

    private final long value;

    AcAxisRange(long value) {
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
