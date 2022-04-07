package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbaselinealignment">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbaselinealignment</a>}
*/
public enum PpBaselineAlignment implements COMEnum {
    
    /**@ Aligned to the baseline. */
    ppBaselineAlignBaseline(1),    
    /**@ Aligned to the center. */
    ppBaselineAlignCenter(3),    
    /**@ Align FarEast50. */
    ppBaselineAlignFarEast50(4),    
    /**@ Mixed alignment. */
    ppBaselineAlignMixed(-2),    
    /**@ Aligned to the top. */
    ppBaselineAlignTop(2);

    private final long value;

    PpBaselineAlignment(long value) {
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
