package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbardirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xlerrorbardirection</a>}
*/
public enum XlErrorBarDirection implements COMEnum {
    
    /**@ Bars run parallel to the Y axis for X-axis values. */
    xlX(-4168),    
    /**@ Bars run parallel to the X axis for Y-axis values. */
    xlY(1);

    private final long value;

    XlErrorBarDirection(long value) {
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
