package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltabposition">https://docs.microsoft.com/en-us/office/vba/api/excel.xltabposition</a>}
*/
public enum XlTabPosition implements COMEnum {
    
    /**@ First tab position. */
    xlTabPositionFirst(0),    
    /**@ Last tab position. */
    xlTabPositionLast(1);

    private final long value;

    XlTabPosition(long value) {
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
