package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acaggregatetype">https://docs.microsoft.com/en-us/office/vba/api/access.acaggregatetype</a>}
*/
public enum AcAggregateType implements COMEnum {
    
    /**@ Average */
    acAggregateAverage(2),    
    /**@ Count */
    acAggregateCount(6),    
    /**@ Distinct */
    acAggregateDistinct(5),    
    /**@ Maximum */
    acAggregateMaximum(4),    
    /**@ Minimum */
    acAggregateMinimum(3),    
    /**@ None */
    acAggregateNone(0),    
    /**@ Sum */
    acAggregateSum(1);

    private final long value;

    AcAggregateType(long value) {
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
