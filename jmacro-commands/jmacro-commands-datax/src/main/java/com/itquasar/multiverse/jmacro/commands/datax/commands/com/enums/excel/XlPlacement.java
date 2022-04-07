package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlplacement">https://docs.microsoft.com/en-us/office/vba/api/excel.xlplacement</a>}
*/
public enum XlPlacement implements COMEnum {
    
    /**@ Object is free floating. */
    xlFreeFloating(3),    
    /**@ Object is moved with the cells. */
    xlMove(2),    
    /**@ Object is moved and sized with the cells. */
    xlMoveAndSize(1);

    private final long value;

    XlPlacement(long value) {
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
