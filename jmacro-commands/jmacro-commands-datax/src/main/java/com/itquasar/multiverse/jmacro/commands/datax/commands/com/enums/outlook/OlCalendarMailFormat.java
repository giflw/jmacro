package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendarmailformat">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendarmailformat</a>}
*/
public enum OlCalendarMailFormat implements COMEnum {
    
    /**@ The calendar information is formatted as a daily schedule of appointments, containing an hour-by-hour breakdown of the calendar, showing both free and busy time blocks along with working-hour information. This layout is intended to help show recipients which times you are available. */
    olCalendarMailFormatDailySchedule(0),    
    /**@ The calendar information is formatted as a list of events, containing a list of the calendar appointments without showing any time blocks. This layout is intended to help show recipients the events scheduled for a given time period. */
    olCalendarMailFormatEventList(1);

    private final long value;

    OlCalendarMailFormat(long value) {
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
