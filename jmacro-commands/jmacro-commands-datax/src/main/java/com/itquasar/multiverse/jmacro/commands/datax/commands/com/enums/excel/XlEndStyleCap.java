package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlendstylecap">https://docs.microsoft.com/en-us/office/vba/api/excel.xlendstylecap</a>}
*/
public enum XlEndStyleCap implements COMEnum {
    
    /**@ Caps applied. */
    xlCap(1),    
    /**@ No caps applied. */
    xlNoCap(2);

    private final long value;

    XlEndStyleCap(long value) {
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
