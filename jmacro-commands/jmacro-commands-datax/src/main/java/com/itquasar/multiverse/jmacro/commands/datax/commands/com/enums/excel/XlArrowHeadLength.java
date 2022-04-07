package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadlength">https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadlength</a>}
*/
public enum XlArrowHeadLength implements COMEnum {
    
    /**@ Longest arrowhead */
    xlArrowHeadLengthLong(3),    
    /**@ Medium-length arrowhead */
    xlArrowHeadLengthMedium(-4138),    
    /**@ Shortest arrowhead */
    xlArrowHeadLengthShort(1);

    private final long value;

    XlArrowHeadLength(long value) {
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
