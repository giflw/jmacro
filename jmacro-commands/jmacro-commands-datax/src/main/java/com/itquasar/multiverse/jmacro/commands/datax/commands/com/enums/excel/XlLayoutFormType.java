package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllayoutformtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xllayoutformtype</a>}
*/
public enum XlLayoutFormType implements COMEnum {
    
    /**@ The LayoutSubtotalLocation property specifies where the subtotal appears in the PivotTable report. */
    xlOutline(1),    
    /**@ Default. */
    xlTabular(0);

    private final long value;

    XlLayoutFormType(long value) {
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
