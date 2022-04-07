package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalcfor">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalcfor</a>}
*/
public enum XlCalcFor implements COMEnum {
    
    /**@ All values. */
    xlAllValues(0),    
    /**@ Column groups. */
    xlColGroups(2),    
    /**@ Row groups. */
    xlRowGroups(1);

    private final long value;

    XlCalcFor(long value) {
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
