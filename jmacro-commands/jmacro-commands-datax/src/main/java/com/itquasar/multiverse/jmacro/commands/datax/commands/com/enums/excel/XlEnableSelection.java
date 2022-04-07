package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlenableselection">https://docs.microsoft.com/en-us/office/vba/api/excel.xlenableselection</a>}
*/
public enum XlEnableSelection implements COMEnum {
    
    /**@ Anything can be selected. */
    xlNoRestrictions(0),    
    /**@ Nothing can be selected. */
    xlNoSelection(-4142),    
    /**@ Only unlocked cells can be selected. */
    xlUnlockedCells(1);

    private final long value;

    XlEnableSelection(long value) {
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
