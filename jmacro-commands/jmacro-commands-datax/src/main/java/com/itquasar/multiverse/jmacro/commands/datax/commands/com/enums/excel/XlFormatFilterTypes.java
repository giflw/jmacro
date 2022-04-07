package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatfiltertypes">https://docs.microsoft.com/en-us/office/vba/api/excel.xlformatfiltertypes</a>}
*/
public enum XlFormatFilterTypes implements COMEnum {
    
    /**@ Bottom. */
    FilterBottom(0),    
    /**@ Bottom Percent. */
    FilterBottomPercent(2),    
    /**@ Top. */
    FilterTop(1),    
    /**@ Top Percent. */
    FilterTopPercent(3);

    private final long value;

    XlFormatFilterTypes(long value) {
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
