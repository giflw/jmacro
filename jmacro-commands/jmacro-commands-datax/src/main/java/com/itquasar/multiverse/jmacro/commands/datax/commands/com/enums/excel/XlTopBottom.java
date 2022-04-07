package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltopbottom">https://docs.microsoft.com/en-us/office/vba/api/excel.xltopbottom</a>}
*/
public enum XlTopBottom implements COMEnum {
    
    /**@ Top 10 bottom values */
    xlTop10Bottom(0),    
    /**@ Top 10 values */
    xlTop10Top(1);

    private final long value;

    XlTopBottom(long value) {
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
