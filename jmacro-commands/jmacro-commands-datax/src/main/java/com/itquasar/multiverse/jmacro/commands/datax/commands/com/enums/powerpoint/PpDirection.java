package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppdirection">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppdirection</a>}
*/
public enum PpDirection implements COMEnum {
    
    /**@ Left-to-right layout */
    ppDirectionLeftToRight(1),    
    /**@ Mixed layout */
    ppDirectionMixed(-2),    
    /**@ Right-to-left layout */
    ppDirectionRightToLeft(2);

    private final long value;

    PpDirection(long value) {
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
