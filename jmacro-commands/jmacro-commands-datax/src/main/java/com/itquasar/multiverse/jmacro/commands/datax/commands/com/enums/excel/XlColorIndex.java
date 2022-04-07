package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcolorindex">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcolorindex</a>}
*/
public enum XlColorIndex implements COMEnum {
    
    /**@ Automatic color. */
    xlColorIndexAutomatic(-4105),    
    /**@ No color. */
    xlColorIndexNone(-4142);

    private final long value;

    XlColorIndex(long value) {
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
