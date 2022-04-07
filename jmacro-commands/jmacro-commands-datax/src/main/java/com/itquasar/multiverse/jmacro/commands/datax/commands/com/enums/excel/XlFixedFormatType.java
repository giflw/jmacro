package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfixedformattype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfixedformattype</a>}
*/
public enum XlFixedFormatType implements COMEnum {
    
    /**@ "PDF" - Portable Document Format file (.pdf) */
    xlTypePDF(0),    
    /**@ "XPS" - XPS Document (.xps) */
    xlTypeXPS(1);

    private final long value;

    XlFixedFormatType(long value) {
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
