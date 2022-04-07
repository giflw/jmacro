package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldupeunique">https://docs.microsoft.com/en-us/office/vba/api/excel.xldupeunique</a>}
*/
public enum XlDupeUnique implements COMEnum {
    
    /**@ Display duplicate values. */
    xlDuplicate(1),    
    /**@ Display unique values. */
    xlUnique(0);

    private final long value;

    XlDupeUnique(long value) {
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
