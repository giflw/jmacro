package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlinsertformatorigin">https://docs.microsoft.com/en-us/office/vba/api/excel.xlinsertformatorigin</a>}
*/
public enum XlInsertFormatOrigin implements COMEnum {
    
    /**@ Copy the format from cells above and/or to the left. */
    xlFormatFromLeftOrAbove(0),    
    /**@ Copy the format from cells below and/or to the right. */
    xlFormatFromRightOrBelow(1);

    private final long value;

    XlInsertFormatOrigin(long value) {
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
