package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldeleteshiftdirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xldeleteshiftdirection</a>}
*/
public enum XlDeleteShiftDirection implements COMEnum {
    
    /**@ Cells are shifted to the left. */
    xlShiftToLeft(-4159),    
    /**@ Cells are shifted up. */
    xlShiftUp(-4162);

    private final long value;

    XlDeleteShiftDirection(long value) {
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
