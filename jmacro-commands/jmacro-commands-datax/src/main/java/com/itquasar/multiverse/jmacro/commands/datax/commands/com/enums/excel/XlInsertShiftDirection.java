package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlinsertshiftdirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xlinsertshiftdirection</a>}
*/
public enum XlInsertShiftDirection implements COMEnum {
    
    /**@ Shift cells down. */
    xlShiftDown(-4121),    
    /**@ Shift cells to the right. */
    xlShiftToRight(-4161);

    private final long value;

    XlInsertShiftDirection(long value) {
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
