package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfielddatatype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfielddatatype</a>}
*/
public enum XlPivotFieldDataType implements COMEnum {
    
    /**@ Contains a date. */
    xlDate(2),    
    /**@ Contains a number. */
    xlNumber(-4145),    
    /**@ Contains text. */
    xlText(-4158);

    private final long value;

    XlPivotFieldDataType(long value) {
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
