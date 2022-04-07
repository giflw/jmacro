package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptabstoptype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptabstoptype</a>}
*/
public enum PpTabStopType implements COMEnum {
    
    /**@ Center tab stop */
    ppTabStopCenter(2),    
    /**@ Decimal tab stop */
    ppTabStopDecimal(4),    
    /**@ Left tab stop */
    ppTabStopLeft(1),    
    /**@ Mixed */
    ppTabStopMixed(-2),    
    /**@ Right tab stop */
    ppTabStopRight(3);

    private final long value;

    PpTabStopType(long value) {
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
