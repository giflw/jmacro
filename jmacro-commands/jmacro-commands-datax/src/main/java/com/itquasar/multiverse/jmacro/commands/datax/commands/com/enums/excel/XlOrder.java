package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlorder">https://docs.microsoft.com/en-us/office/vba/api/excel.xlorder</a>}
*/
public enum XlOrder implements COMEnum {
    
    /**@ Process down the rows before processing across pages or page fields to the right. */
    xlDownThenOver(1),    
    /**@ Process across pages or page fields to the right before moving down the rows. */
    xlOverThenDown(2);

    private final long value;

    XlOrder(long value) {
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
