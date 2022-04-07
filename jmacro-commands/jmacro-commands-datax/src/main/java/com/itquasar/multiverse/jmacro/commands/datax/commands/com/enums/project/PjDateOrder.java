package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdateorder">https://docs.microsoft.com/en-us/office/vba/api/project.pjdateorder</a>}
*/
public enum PjDateOrder implements COMEnum {
    
    /**@ Order is the day, the month, and then the year. */
    pjDayMonthYear(0),    
    /**@ Order is the month, the day, and then the year. */
    pjMonthDayYear(1),    
    /**@ Order is the year, the month, and then the day. */
    pjYearMonthDay(2);

    private final long value;

    PjDateOrder(long value) {
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
