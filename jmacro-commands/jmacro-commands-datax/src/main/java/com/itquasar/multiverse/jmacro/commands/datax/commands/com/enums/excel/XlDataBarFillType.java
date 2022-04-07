package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarfilltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarfilltype</a>}
*/
public enum XlDataBarFillType implements COMEnum {
    
    /**@ The data bar is filled with a color gradient. */
    xlDataBarFillGradient(1),    
    /**@ The data bar is filled with solid color. */
    xlDataBarFillSolid(0);

    private final long value;

    XlDataBarFillType(long value) {
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
