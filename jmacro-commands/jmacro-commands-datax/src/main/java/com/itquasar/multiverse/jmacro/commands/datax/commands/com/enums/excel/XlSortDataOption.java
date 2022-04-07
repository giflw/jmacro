package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortdataoption">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortdataoption</a>}
*/
public enum XlSortDataOption implements COMEnum {
    
    /**@ default. Sorts numeric and text data separately. */
    xlSortNormal(0),    
    /**@ Treat text as numeric data for the sort. */
    xlSortTextAsNumbers(1);

    private final long value;

    XlSortDataOption(long value) {
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
