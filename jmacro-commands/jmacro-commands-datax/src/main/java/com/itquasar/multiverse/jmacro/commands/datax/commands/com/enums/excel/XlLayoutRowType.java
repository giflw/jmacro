package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllayoutrowtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllayoutrowtype</a>}
*/
public enum XlLayoutRowType implements COMEnum {
    
    /**@ Compact Row */
    xlCompactRow(0),    
    /**@ Outline Row */
    xlOutlineRow(2),    
    /**@ Tabular Row */
    xlTabularRow(1);

    private final long value;

    XlLayoutRowType(long value) {
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
