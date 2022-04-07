package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchwithin">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchwithin</a>}
*/
public enum XlSearchWithin implements COMEnum {
    
    /**@ Limit search to current sheet. */
    xlWithinSheet(1),    
    /**@ Search whole workbook. */
    xlWithinWorkbook(2);

    private final long value;

    XlSearchWithin(long value) {
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
