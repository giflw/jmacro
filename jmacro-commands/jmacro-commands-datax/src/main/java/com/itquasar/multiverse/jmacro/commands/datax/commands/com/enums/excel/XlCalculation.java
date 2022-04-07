package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcalculation</a>}
*/
public enum XlCalculation implements COMEnum {
    
    /**@ Excel controls recalculation. */
    xlCalculationAutomatic(-4105),    
    /**@ Calculation is done when the user requests it. */
    xlCalculationManual(-4135),    
    /**@ Excel controls recalculation but ignores changes in tables. */
    xlCalculationSemiautomatic(2);

    private final long value;

    XlCalculation(long value) {
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
