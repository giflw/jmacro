package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchdirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsearchdirection</a>}
*/
public enum XlSearchDirection implements COMEnum {
    
    /**@ Search for next matching value in range. */
    xlNext(1),    
    /**@ Search for previous matching value in range. */
    xlPrevious(2);

    private final long value;

    XlSearchDirection(long value) {
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
