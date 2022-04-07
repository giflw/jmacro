package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdategrouptype">https://docs.microsoft.com/en-us/office/vba/api/access.acdategrouptype</a>}
*/
public enum AcDateGroupType implements COMEnum {
    
    /**@ The date is grouped by day. */
    acDateGroupDay(4),    
    /**@ The date is grouped by month. */
    acDateGroupMonth(3),    
    /**@ No grouping is applied. */
    acDateGroupNone(0),    
    /**@ The date is grouped by quarter. */
    acDateGroupQuarter(2),    
    /**@ The date is grouped by year. */
    acDateGroupYear(1);

    private final long value;

    AcDateGroupType(long value) {
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
