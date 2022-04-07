package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummaryrow">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummaryrow</a>}
*/
public enum XlSummaryRow implements COMEnum {
    
    /**@ The summary row will be positioned above the detail rows in the outline. */
    xlSummaryAbove(0),    
    /**@ The summary row will be positioned below the detail rows in the outline. */
    xlSummaryBelow(1);

    private final long value;

    XlSummaryRow(long value) {
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
