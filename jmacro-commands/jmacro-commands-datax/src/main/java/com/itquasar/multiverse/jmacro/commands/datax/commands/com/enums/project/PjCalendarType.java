package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendartype">https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendartype</a>}
*/
public enum PjCalendarType implements COMEnum {
    
    /**@ Gregorian Calendar. */
    pjGregorianCalendar(1),    
    /**@ Hijri Calendar. */
    pjHijriCalendar(6),    
    /**@ Thai Calendar. */
    pjThaiCalendar(7);

    private final long value;

    PjCalendarType(long value) {
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
