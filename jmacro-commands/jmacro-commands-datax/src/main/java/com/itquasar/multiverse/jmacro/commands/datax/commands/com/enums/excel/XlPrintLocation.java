package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlprintlocation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlprintlocation</a>}
*/
public enum XlPrintLocation implements COMEnum {
    
    /**@ Comments will be printed where they were inserted on the worksheet. */
    xlPrintInPlace(16),    
    /**@ Comments will not be printed. */
    xlPrintNoComments(-4142),    
    /**@ Comments will be printed as end notes at the end of the worksheet. */
    xlPrintSheetEnd(1);

    private final long value;

    XlPrintLocation(long value) {
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
