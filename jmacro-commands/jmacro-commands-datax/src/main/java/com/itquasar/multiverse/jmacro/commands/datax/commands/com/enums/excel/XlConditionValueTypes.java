package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlconditionvaluetypes">https://docs.microsoft.com/en-us/office/vba/api/excel.xlconditionvaluetypes</a>}
*/
public enum XlConditionValueTypes implements COMEnum {
    
    /**@ The longest data bar is proportional to the maximum value in the range. */
    xlConditionValueAutomaticMax(7),    
    /**@ The shortest data bar is proportional to the minimum value in the range. */
    xlConditionValueAutomaticMin(6),    
    /**@ Formula is used. */
    xlConditionValueFormula(4),    
    /**@ Highest value from the list of values. */
    xlConditionValueHighestValue(2),    
    /**@ Lowest value from the list of values. */
    xlConditionValueLowestValue(1),    
    /**@ No conditional value. */
    xlConditionValueNone(-1),    
    /**@ Number is used. */
    xlConditionValueNumber(0),    
    /**@ Percentage is used. */
    xlConditionValuePercent(3),    
    /**@ Percentile is used. */
    xlConditionValuePercentile(5);

    private final long value;

    XlConditionValueTypes(long value) {
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
