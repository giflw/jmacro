package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlallocation</a>}
*/
public enum XlAllocation implements COMEnum {
    
    /**@ Calculate changes automatically after each value is changed. */
    xlAutomaticAllocation(2),    
    /**@ Calculate changes manually. */
    xlManualAllocation(1);

    private final long value;

    XlAllocation(long value) {
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
