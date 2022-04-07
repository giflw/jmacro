package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchorder">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchorder</a>}
*/
public enum XlSearchOrder implements COMEnum {
    
    /**@ Searches down through a column, then moves to the next column. */
    xlByColumns(2),    
    /**@ Searches across a row, then moves to the next row. */
    xlByRows(1);

    private final long value;

    XlSearchOrder(long value) {
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
