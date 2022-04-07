package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarnegativecolortype">https://docs.microsoft.com/en-us/office/vba/api/excel.xldatabarnegativecolortype</a>}
*/
public enum XlDataBarNegativeColorType implements COMEnum {
    
    /**@ Use the color specified in the Negative Value and Axis Setting dialog box or by using the ColorType and BorderColorType properties of the NegativeBarFormat object. */
    xlDataBarColor(0),    
    /**@ Use the same color as positive data bars. */
    xlDataBarSameAsPositive(1);

    private final long value;

    XlDataBarNegativeColorType(long value) {
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
