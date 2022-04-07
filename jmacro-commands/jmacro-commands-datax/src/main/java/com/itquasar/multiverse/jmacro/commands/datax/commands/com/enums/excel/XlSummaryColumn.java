package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummarycolumn">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsummarycolumn</a>}
*/
public enum XlSummaryColumn implements COMEnum {
    
    /**@ The summary column will be positioned to the left of the detail columns in the outline. */
    xlSummaryOnLeft(-4131),    
    /**@ The summary column will be positioned to the right of the detail columns in the outline. */
    xlSummaryOnRight(-4152);

    private final long value;

    XlSummaryColumn(long value) {
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
