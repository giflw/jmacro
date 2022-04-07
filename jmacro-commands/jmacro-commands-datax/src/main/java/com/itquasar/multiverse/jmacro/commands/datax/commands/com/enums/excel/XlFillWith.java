package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfillwith">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfillwith</a>}
*/
public enum XlFillWith implements COMEnum {
    
    /**@ Copy contents and formats. */
    xlFillWithAll(-4104),    
    /**@ Copy contents only. */
    xlFillWithContents(2),    
    /**@ Copy formats only. */
    xlFillWithFormats(-4122);

    private final long value;

    XlFillWith(long value) {
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
