package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadwidth">https://docs.microsoft.com/en-us/office/vba/api/excel.xlarrowheadwidth</a>}
*/
public enum XlArrowHeadWidth implements COMEnum {
    
    /**@ Medium-width arrowhead */
    xlArrowHeadWidthMedium(-4138),    
    /**@ Narrowest arrowhead */
    xlArrowHeadWidthNarrow(1),    
    /**@ Widest arrowhead */
    xlArrowHeadWidthWide(3);

    private final long value;

    XlArrowHeadWidth(long value) {
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
