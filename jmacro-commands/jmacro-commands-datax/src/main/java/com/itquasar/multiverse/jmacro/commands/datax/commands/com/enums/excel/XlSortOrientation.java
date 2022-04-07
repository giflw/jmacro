package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortorientation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortorientation</a>}
*/
public enum XlSortOrientation implements COMEnum {
    
    /**@ Sorts by column. */
    xlSortColumns(1),    
    /**@ Sorts by row. This is the default value. */
    xlSortRows(2);

    private final long value;

    XlSortOrientation(long value) {
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
