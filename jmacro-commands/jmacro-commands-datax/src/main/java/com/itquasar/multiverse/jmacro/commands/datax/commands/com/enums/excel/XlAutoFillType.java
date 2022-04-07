package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlautofilltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlautofilltype</a>}
*/
public enum XlAutoFillType implements COMEnum {
    
    /**@ Copy the values and formats from the source range to the target range, repeating if necessary. */
    xlFillCopy(1),    
    /**@ Extend the names of the days of the week in the source range into the target range. Formats are copied from the source range to the target range, repeating if necessary. */
    xlFillDays(5),    
    /**@ Excel determines the values and formats used to fill the target range. */
    xlFillDefault(0),    
    /**@ Copy only the formats from the source range to the target range, repeating if necessary. */
    xlFillFormats(3),    
    /**@ Extend the names of the months in the source range into the target range. Formats are copied from the source range to the target range, repeating if necessary. */
    xlFillMonths(7),    
    /**@ Extend the values in the source range into the target range as a series (for example, '1, 2' is extended as '3, 4, 5'). Formats are copied from the source range to the target range, repeating if necessary. */
    xlFillSeries(2),    
    /**@ Copy only the values from the source range to the target range, repeating if necessary. */
    xlFillValues(4),    
    /**@ Extend the names of the days of the workweek in the source range into the target range. Formats are copied from the source range to the target range, repeating if necessary. */
    xlFillWeekdays(6),    
    /**@ Extend the years in the source range into the target range. Formats are copied from the source range to the target range, repeating if necessary. */
    xlFillYears(8),    
    /**@ Extend the numeric values from the source range into the target range, assuming that the relationships between the numbers in the source range are multiplicative (for example, '1, 2,' is extended as '4, 8, 16', assuming that each number is a result of multiplying the previous number by some value). Formats are copied from the source range to the target range, repeating if necessary. */
    xlGrowthTrend(10),    
    /**@ Extend the numeric values from the source range into the target range, assuming that the relationships between the numbers is additive (for example, '1, 2,' is extended as '3, 4, 5', assuming that each number is a result of adding some value to the previous number). Formats are copied from the source range to the target range, repeating if necessary. */
    xlLinearTrend(9),    
    /**@ Extend the values from the source range into the target range based on the detected pattern of previous user actions, repeating if necessary. */
    xlFlashFill(11);

    private final long value;

    XlAutoFillType(long value) {
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
