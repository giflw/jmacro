package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelperiodbasis">https://docs.microsoft.com/en-us/office/vba/api/project.pjlevelperiodbasis</a>}
*/
public enum PjLevelPeriodBasis implements COMEnum {
    
    /**@ Day by day. */
    pjDayByDay(2),    
    /**@ Hour by hour. */
    pjHourByHour(1),    
    /**@ Minute by minute. */
    pjMinuteByMinute(0),    
    /**@ Month by month. */
    pjMonthByMonth(4),    
    /**@ Week by week. */
    pjWeekByWeek(3);

    private final long value;

    PjLevelPeriodBasis(long value) {
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
