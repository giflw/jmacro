package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlgradientfilltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlgradientfilltype</a>}
*/
public enum XlGradientFillType implements COMEnum {
    
    /**@ Gradient is filled in a straight line. */
    GradientFillLinear(0),    
    /**@ Gradient is filled in a non-linear or curved path. */
    GradientFillPath(1);

    private final long value;

    XlGradientFillType(long value) {
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
