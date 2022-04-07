package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtimescaleunit">https://docs.microsoft.com/en-us/office/vba/api/project.pjtimescaleunit</a>}
*/
public enum PjTimescaleUnit implements COMEnum {
    
    /**@ Days. */
    pjTimescaleDays(4),    
    /**@ Half years. */
    pjTimescaleHalfYears(8),    
    /**@ Hours. */
    pjTimescaleHours(5),    
    /**@ Minutes */
    pjTimescaleMinutes(6),    
    /**@ Months. */
    pjTimescaleMonths(2),    
    /**@ None. The timescale tier uses the default unit. */
    pjTimescaleNone(255),    
    /**@ Quarters of years. */
    pjTimescaleQuarters(1),    
    /**@ Thirds of months. */
    pjTimescaleThirdsOfMonths(7),    
    /**@ Weeks. */
    pjTimescaleWeeks(3),    
    /**@ Years. */
    pjTimescaleYears(0);

    private final long value;

    PjTimescaleUnit(long value) {
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
