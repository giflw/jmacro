package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortorder">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortorder</a>}
*/
public enum XlSortOrder implements COMEnum {
    
    /**@ Sorts the specified field in ascending order. This is the default value. */
    xlAscending(1),    
    /**@ Sorts the specified field in descending order. */
    xlDescending(2),    
    /**@ Manual sort (you can drag items to rearrange them). */
    xlManual(-4135);

    private final long value;

    XlSortOrder(long value) {
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
