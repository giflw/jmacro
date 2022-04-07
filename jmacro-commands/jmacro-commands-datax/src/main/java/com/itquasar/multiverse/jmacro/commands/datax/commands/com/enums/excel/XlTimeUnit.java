package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltimeunit">https://docs.microsoft.com/en-us/office/vba/api/excel.xltimeunit</a>}
*/
public enum XlTimeUnit implements COMEnum {
    
    /**@ Days */
    xlDays(0),    
    /**@ Months */
    xlMonths(1),    
    /**@ Years */
    xlYears(2);

    private final long value;

    XlTimeUnit(long value) {
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
