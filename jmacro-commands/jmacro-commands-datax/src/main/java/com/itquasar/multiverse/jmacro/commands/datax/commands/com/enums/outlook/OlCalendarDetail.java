package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendardetail">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcalendardetail</a>}
*/
public enum OlCalendarDetail implements COMEnum {
    
    /**@ Free/busy information and the appointment subjects are exported to the iCalendar file. */
    olFreeBusyAndSubject(1),    
    /**@ Only free/busy information is exported to the iCalendar file. */
    olFreeBusyOnly(0),    
    /**@ Full details of each appointment item are exported to the iCalendar file. */
    olFullDetails(2);

    private final long value;

    OlCalendarDetail(long value) {
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
