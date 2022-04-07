package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlapplynamesorder">https://docs.microsoft.com/en-us/office/vba/api/excel.xlapplynamesorder</a>}
*/
public enum XlApplyNamesOrder implements COMEnum {
    
    /**@ Columns listed before rows */
    xlColumnThenRow(2),    
    /**@ Rows listed before columns */
    xlRowThenColumn(1);

    private final long value;

    XlApplyNamesOrder(long value) {
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
