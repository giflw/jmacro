package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsorttype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsorttype</a>}
*/
public enum XlSortType implements COMEnum {
    
    /**@ Sorts the PivotTable report by labels. */
    xlSortLabels(2),    
    /**@ Sorts the PivotTable report by values. */
    xlSortValues(1);

    private final long value;

    XlSortType(long value) {
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
