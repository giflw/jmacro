package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotlinetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotlinetype</a>}
*/
public enum XlPivotLineType implements COMEnum {
    
    /**@ Blank line after each group. */
    xlPivotLineBlank(3),    
    /**@ Grand Total line. */
    xlPivotLineGrandTotal(2),    
    /**@ Regular PivotLine with pivot items. */
    xlPivotLineRegular(0),    
    /**@ Subtotal line. */
    xlPivotLineSubtotal(1);

    private final long value;

    XlPivotLineType(long value) {
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
