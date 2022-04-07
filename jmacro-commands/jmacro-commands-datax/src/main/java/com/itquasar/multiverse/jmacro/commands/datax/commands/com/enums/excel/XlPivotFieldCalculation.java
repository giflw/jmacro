package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldcalculation">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotfieldcalculation</a>}
*/
public enum XlPivotFieldCalculation implements COMEnum {
    
    /**@ The difference from the value of the Base item in the Base field. */
    xlDifferenceFrom(2),    
    /**@ Data calculated as ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total)). */
    xlIndex(9),    
    /**@ No calculation. */
    xlNoAdditionalCalculation(-4143),    
    /**@ Percentage difference from the value of the Base item in the Base field. */
    xlPercentDifferenceFrom(4),    
    /**@ Percentage of the value of the Base item in the Base field. */
    xlPercentOf(3),    
    /**@ Percentage of the total for the column or series. */
    xlPercentOfColumn(7),    
    /**@ Percentage of the total of the specified parent Base field. */
    xlPercentOfParent(12),    
    /**@ Percentage of the total of the parent column. */
    xlPercentOfParentColumn(11),    
    /**@ Percentage of the total of the parent row. */
    xlPercentOfParentRow(10),    
    /**@ Percentage of the total for the row or category. */
    xlPercentOfRow(6),    
    /**@ Percentage of the grand total of all the data or data points in the report. */
    xlPercentOfTotal(8),    
    /**@ Percentage of the running total of the specified Base field. */
    xlPercentRunningTotal(13),    
    /**@ Rank smallest to largest. */
    xlRankAscending(14),    
    /**@ Rank largest to smallest. */
    xlRankDecending(15),    
    /**@ Data for successive items in the Base field as a running total. */
    xlRunningTotal(5);

    private final long value;

    XlPivotFieldCalculation(long value) {
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
