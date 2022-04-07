package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfixedformatquality">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfixedformatquality</a>}
*/
public enum XlFixedFormatQuality implements COMEnum {
    
    /**@ Minimum quality */
    xlQualityMinimum(1),    
    /**@ Standard quality */
    xlQualityStandard(0);

    private final long value;

    XlFixedFormatQuality(long value) {
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
