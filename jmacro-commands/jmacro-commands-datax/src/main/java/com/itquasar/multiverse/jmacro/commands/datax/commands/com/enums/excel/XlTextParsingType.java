package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltextparsingtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xltextparsingtype</a>}
*/
public enum XlTextParsingType implements COMEnum {
    
    /**@ Default. Indicates that the file is delimited by delimiter characters. */
    xlDelimited(1),    
    /**@ Indicates that the data in the file is arranged in columns of fixed widths. */
    xlFixedWidth(2);

    private final long value;

    XlTextParsingType(long value) {
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
