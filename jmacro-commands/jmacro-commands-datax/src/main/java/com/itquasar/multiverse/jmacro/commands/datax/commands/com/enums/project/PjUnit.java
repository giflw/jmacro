package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjunit">https://docs.microsoft.com/en-us/office/vba/api/project.pjunit</a>}
*/
public enum PjUnit implements COMEnum {
    
    /**@ Day. */
    pjDay(7),    
    /**@ Hour. */
    pjHour(5),    
    /**@ Minute. */
    pjMinute(3),    
    /**@ Month. */
    pjMonthUnit(11),    
    /**@ Week. */
    pjWeek(9);

    private final long value;

    PjUnit(long value) {
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
