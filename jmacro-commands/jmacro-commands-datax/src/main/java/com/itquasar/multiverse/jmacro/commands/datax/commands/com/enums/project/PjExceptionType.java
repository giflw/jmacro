package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptiontype">https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptiontype</a>}
*/
public enum PjExceptionType implements COMEnum {
    
    /**@ The exception recurrence pattern is daily. */
    pjDaily(1),    
    /**@ The exception daily recurrence ends after a specified number of occurrences. */
    pjDayCount(7),    
    /**@ The exception recurrence pattern is monthly on a specified day, for example the 24th of the month. */
    pjMonthlyMonthDay(4),    
    /**@ The exception recurrence pattern is monthly on a specified position of a day in a month, for example the fourth Friday. */
    pjMonthlyPositional(5),    
    /**@ The exception recurrence ends after a specified number of weekday occurrences. */
    pjWeekDayCount(8),    
    /**@ The exception recurrence pattern is weekly. */
    pjWeekly(6),    
    /**@ The exception recurrence pattern is yearly on a specified day of a month, for example on December 24. */
    pjYearlyMonthDay(2),    
    /**@ The exception recurrence pattern is yearly on a specified position of a day in a month, for example the fourth Friday of every month. */
    pjYearlyPositional(3);

    private final long value;

    PjExceptionType(long value) {
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
