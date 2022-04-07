package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltotalscalculation">https://docs.microsoft.com/en-us/office/vba/api/excel.xltotalscalculation</a>}
*/
public enum XlTotalsCalculation implements COMEnum {
    
    /**@ Average */
    xlTotalsCalculationAverage(2),    
    /**@ Count of non-empty cells */
    xlTotalsCalculationCount(3),    
    /**@ Count of cells with numeric values */
    xlTotalsCalculationCountNums(4),    
    /**@ Custom calculation */
    xlTotalsCalculationCustom(9),    
    /**@ Maximum value in the list */
    xlTotalsCalculationMax(6),    
    /**@ Minimum value in the list */
    xlTotalsCalculationMin(5),    
    /**@ No calculation */
    xlTotalsCalculationNone(0),    
    /**@ Standard deviation value */
    xlTotalsCalculationStdDev(7),    
    /**@ Sum of all values in the list column */
    xlTotalsCalculationSum(1),    
    /**@ Variable */
    xlTotalsCalculationVar(8);

    private final long value;

    XlTotalsCalculation(long value) {
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
