package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendarviewmode">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendarviewmode</a>}
*/
public enum OlCalendarViewMode implements COMEnum {
    
    /**@ Displays a 5-day week. */
    olCalendarView5DayWeek(4),    
    /**@ Displays a single day. */
    olCalendarViewDay(0),    
    /**@ Displays a month. */
    olCalendarViewMonth(2),    
    /**@ Displays a number of days equal to the DaysInMultiDayMode property value of the CalendarView object. */
    olCalendarViewMultiDay(3),    
    /**@ Displays a 7-day week. */
    olCalendarViewWeek(1);

    private final long value;

    OlCalendarViewMode(long value) {
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
