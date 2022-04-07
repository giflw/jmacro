package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcreator">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcreator</a>}
*/
public enum XlCreator implements COMEnum {
    
    /**@ The Excel for Macintosh creator code. */
    xlCreatorCode(1480803660);

    private final long value;

    XlCreator(long value) {
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
