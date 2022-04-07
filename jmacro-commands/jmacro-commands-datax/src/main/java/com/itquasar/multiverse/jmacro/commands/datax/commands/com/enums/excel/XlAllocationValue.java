package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocationvalue">https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocationvalue</a>}
*/
public enum XlAllocationValue implements COMEnum {
    
    /**@ Increment based on the old value. */
    xlAllocateIncrement(2),    
    /**@ The value entered divided by the number of allocations. */
    xlAllocateValue(1);

    private final long value;

    XlAllocationValue(long value) {
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
