package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecurrencetype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olrecurrencetype</a>}
*/
public enum OlRecurrenceType implements COMEnum {
    
    /**@ Represents a daily recurrence pattern. */
    olRecursDaily(0),    
    /**@ Represents a monthly recurrence pattern. */
    olRecursMonthly(2),    
    /**@ Represents a MonthNth recurrence pattern. See RecurrencePattern.Instance property. */
    olRecursMonthNth(3),    
    /**@ Represents a weekly recurrence pattern. */
    olRecursWeekly(1),    
    /**@ Represents a yearly recurrence pattern. */
    olRecursYearly(5),    
    /**@ Represents a YearNth recurrence pattern. See RecurrencePattern.Instance property. */
    olRecursYearNth(6);

    private final long value;

    OlRecurrenceType(long value) {
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
