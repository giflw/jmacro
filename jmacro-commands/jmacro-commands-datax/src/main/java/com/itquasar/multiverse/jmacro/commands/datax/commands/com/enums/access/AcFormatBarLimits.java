package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acformatbarlimits">https://docs.microsoft.com/en-us/office/vba/api/access.acformatbarlimits</a>}
*/
public enum AcFormatBarLimits implements COMEnum {
    
    /**@ For the shortest bar, the lowest value is used. For the highest bar, the highest value is used. */
    acAutomatic(0),    
    /**@ A number is used. */
    acNumber(1),    
    /**@ A percentage is used. */
    acPercent(2);

    private final long value;

    AcFormatBarLimits(long value) {
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
