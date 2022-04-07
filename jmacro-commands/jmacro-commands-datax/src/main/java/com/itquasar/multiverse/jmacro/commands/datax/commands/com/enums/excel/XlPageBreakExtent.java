package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpagebreakextent">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpagebreakextent</a>}
*/
public enum XlPageBreakExtent implements COMEnum {
    
    /**@ Full screen. */
    xlPageBreakFull(1),    
    /**@ Only within print area. */
    xlPageBreakPartial(2);

    private final long value;

    XlPageBreakExtent(long value) {
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
