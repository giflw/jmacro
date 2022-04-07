package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortmethod">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsortmethod</a>}
*/
public enum XlSortMethod implements COMEnum {
    
    /**@ Phonetic Chinese sort order for characters. This is the default value. */
    xlPinYin(1),    
    /**@ Sort by the quantity of strokes in each character. */
    xlStroke(2);

    private final long value;

    XlSortMethod(long value) {
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
