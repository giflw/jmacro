package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlscaletype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlscaletype</a>}
*/
public enum XlScaleType implements COMEnum {
    
    /**@ Linear */
    xlScaleLinear(-4132),    
    /**@ Logarithmic */
    xlScaleLogarithmic(-4133);

    private final long value;

    XlScaleType(long value) {
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
