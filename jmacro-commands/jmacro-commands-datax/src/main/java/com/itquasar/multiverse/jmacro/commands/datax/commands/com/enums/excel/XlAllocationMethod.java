package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocationmethod">https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocationmethod</a>}
*/
public enum XlAllocationMethod implements COMEnum {
    
    /**@ Use equal allocation. */
    xlEqualAllocation(1),    
    /**@ Use weighted allocation. */
    xlWeightedAllocation(2);

    private final long value;

    XlAllocationMethod(long value) {
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
